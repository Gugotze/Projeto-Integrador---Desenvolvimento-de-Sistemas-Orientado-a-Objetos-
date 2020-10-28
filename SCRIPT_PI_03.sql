CREATE DATABASE LOJADEROUPAS;

USE LOJADEROUPAS;

CREATE TABLE CLIENTE (
ID_CLIENTE INT (10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR (50) NOT NULL,
CPF VARCHAR (11) UNIQUE NOT NULL,
SEXO VARCHAR (1) NOT NULL,
DATANASCIMENTO VARCHAR (10) NOT NULL,
TELEFONE INT (12) NOT NULL,
EMAIL VARCHAR (50) UNIQUE NOT NULL,
CEP VARCHAR (9) NOT NULL,
ENDERECO VARCHAR (100) NOT NULL,
BAIRRO VARCHAR (20) NOT NULL,
NUMERO INT (5) NOT NULL,
COMPLEMENTO VARCHAR (30),
CIDADE VARCHAR (30) NOT NULL,
ESTADO VARCHAR (20) NOT NULL
);


CREATE TABLE FUNCIONARIO (
ID_FUNCIONARIO INT (10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
NOME VARCHAR (50) NOT NULL,
CPF VARCHAR (11) UNIQUE NOT NULL,
SEXO VARCHAR (1) NOT NULL,
DATANASCIMENTO VARCHAR (10) NOT NULL,
TELEFONE INT (12) NOT NULL,
EMAIL VARCHAR (50) UNIQUE NOT NULL,
CEP VARCHAR (9) NOT NULL,
ENDERECO VARCHAR (100) NOT NULL,
BAIRRO VARCHAR (20) NOT NULL,
NUMERO INT (5) NOT NULL,
COMPLEMENTO VARCHAR (30),
CIDADE VARCHAR (30) NOT NULL,
ESTADO VARCHAR (20) NOT NULL,
LOGIN VARCHAR (50) NOT NULL,
SENHA VARCHAR(20) NOT NULL,
TIPO CHAR(1) NOT NULL
);

CREATE TABLE FILIAL (
ID_FILIAL INT (10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
ESTADO VARCHAR (20) NOT NULL
);

INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('1', 'SP');
INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('2', 'RJ');
INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('3', 'ES');
INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('4', 'PR');
INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('5', 'SC');
INSERT INTO `LOJADEROUPAS`.`FILIAL` (`ID_FILIAL`, `ESTADO`) VALUES ('6', 'RS');



CREATE TABLE PRODUTO (
ID_PRODUTO INT (10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
COD_FILIAL INT (10) NOT NULL,
NOME VARCHAR (100) NOT NULL,
TIPO VARCHAR (30) NOT NULL,
VALOR_COMPRA NUMERIC (10,2) NOT NULL,
VALOR_VENDA NUMERIC (10,2) NOT NULL
);

ALTER TABLE PRODUTO
ADD CONSTRAINT FK_FILIAL_PRODUTO FOREIGN KEY (COD_FILIAL) REFERENCES FILIAL (ID_FILIAL);


CREATE TABLE ESTOQUE (
ID_ESTOQUE INT(10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
COD_PRODUTO_FK INT (10) NOT NULL,
QUANTIDADE INT (10) NOT NULL
);

/*Feito para caso excluir um produto, excluir seu estoque*/
ALTER TABLE ESTOQUE ADD FOREIGN KEY (COD_PRODUTO_FK) REFERENCES PRODUTO(ID_PRODUTO) ON DELETE CASCADE;


CREATE TABLE VENDA (
ID_VENDA INT (10) NOT NULL PRIMARY KEY AUTO_INCREMENT,
DATA_VENDA VARCHAR (10) NOT NULL,
COD_CLIENTE INT (10) NOT NULL,
COD_PRODUTO INT (10) NOT NULL,
COD_FILIAL INT (10) NOT NULL,
QUANTIDADE INT (10) NOT NULL,
DESCONTO NUMERIC (10,2),
VALOR_TOTAL NUMERIC (10,2) NOT NULL
);


ALTER TABLE VENDA
ADD CONSTRAINT FK_CLIENTE_VENDA FOREIGN KEY (COD_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE),
ADD CONSTRAINT FK_PRODUTO_VENDA FOREIGN KEY (COD_PRODUTO) REFERENCES PRODUTO (ID_PRODUTO),
ADD CONSTRAINT FK_FILIAL_VENDA FOREIGN KEY (COD_FILIAL) REFERENCES FILIAL (ID_FILIAL);

CREATE TABLE VENDA_HAS_PRODUTO (
COD_VENDA INT (10) NOT NULL,
COD_CLIENTE INT (10) NOT NULL,
COD_PRODUTO INT (10) NOT NULL,
COD_FILIAL INT (10) NOT NULL
);

ALTER TABLE VENDA_HAS_PRODUTO
ADD CONSTRAINT FK_VENDA_AUXILIARVENDA FOREIGN KEY (COD_VENDA) REFERENCES VENDA (ID_VENDA),
ADD CONSTRAINT FK_CLIENTE_AUXILIARVENDA FOREIGN KEY (COD_CLIENTE) REFERENCES CLIENTE (ID_CLIENTE),
ADD CONSTRAINT FK_FILIAL_AUXILIARVENDA FOREIGN KEY (COD_FILIAL) REFERENCES FILIAL (ID_FILIAL);

USE `LOJADEROUPAS`;

DELIMITER $$

DROP TRIGGER IF EXISTS LOJADEROUPAS.atualiza_estoque$$
USE `LOJADEROUPAS`$$
CREATE TRIGGER atualiza_estoque AFTER INSERT ON VENDA FOR EACH ROW
BEGIN
UPDATE ESTOQUE SET quantidade = quantidade - NEW.QUANTIDADE WHERE COD_PRODUTO_FK = NEW.COD_PRODUTO;
END$$
DELIMITER ;
