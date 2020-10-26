package br.com.LojaDeRoupas.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.LojaDeRoupas.Model.Cliente;
import br.com.LojaDeRoupas.Util.ConexaoDB;
import java.sql.DriverManager;

public class ClienteDao {

private String jdbcURL;
    private String jdbcUsername;
    private String jdbcPassword;
    private Connection jdbcConnection;
	
    public ClienteDao(String jdbcURL, String jdbcUsername, String jdbcPassword) {
        this.jdbcURL = jdbcURL;
        this.jdbcUsername = jdbcUsername;
        this.jdbcPassword = jdbcPassword;
    }
     
    protected void connect() throws SQLException {
        if (jdbcConnection == null || jdbcConnection.isClosed()) {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                throw new SQLException(e);
            }
            jdbcConnection = DriverManager.getConnection(
                                        jdbcURL, jdbcUsername, jdbcPassword);
        }
    }
     
    protected void disconnect() throws SQLException {
        if (jdbcConnection != null && !jdbcConnection.isClosed()) {
            jdbcConnection.close();
        }
    }
	
    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO CLIENTE (NOME, CPF, SEXO , DATANASCIMENTO , TELEFONE , EMAIL , CEP , ENDERECO , BAIRRO , NUMERO , COMPLEMENTO , CIDADE , ESTADO)"
        								+ " VALUES(?,?,?,?,?,?,?,?,?) ";

    try {
	        Connection con = ConexaoDB.getConnection();
	         
	        PreparedStatement statement = con.prepareStatement(sql);
	        statement.setString(1, cliente.getNomeCliente());
	        statement.setString(2, cliente.getCpfCliente());
	        statement.setString(3, cliente.getSexoCliente());
	        statement.setString(4, cliente.getDataNascimento());
	        statement.setString(5, cliente.getTelefone());
	        statement.setString(6, cliente.getEmail());
	        statement.setString(7, cliente.getCep());
	        statement.setString(8, cliente.getEndereco());
	        statement.setString(9, cliente.getBairro());
	        statement.setString(10, cliente.getNumero());
	        statement.setString(11, cliente.getComplemento());
	        statement.setString(12, cliente.getCidade());
	        statement.setString(13, cliente.getEstado());
	        statement.execute();

	        
        }catch (SQLException e) {
			e.printStackTrace();
		}
    }
     
//    public List<Book> listAllBooks() throws SQLException {
//        List<Book> listBook = new ArrayList<>();
//         
//        String sql = "SELECT * FROM book";
//         
//        connect();
//         
//        Statement statement = jdbcConnection.createStatement();
//        ResultSet resultSet = statement.executeQuery(sql);
//         
//        while (resultSet.next()) {
//            int id = resultSet.getInt("book_id");
//            String title = resultSet.getString("title");
//            String author = resultSet.getString("author");
//            float price = resultSet.getFloat("price");
//             
//            Book book = new Book(id, title, author, price);
//            listBook.add(book);
//        }
//         
//        resultSet.close();
//        statement.close();
//         
//        disconnect();
//         
//        return listBook;
//    }
//     
//    public boolean deleteBook(Book book) throws SQLException {
//        String sql = "DELETE FROM book where book_id = ?";
//         
//        connect();
//         
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setInt(1, book.getId());
//         
//        boolean rowDeleted = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowDeleted;     
//    }
//     
//    public boolean updateBook(Book book) throws SQLException {
//        String sql = "UPDATE book SET title = ?, author = ?, price = ?";
//        sql += " WHERE book_id = ?";
//        connect();
//         
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setString(1, book.getTitle());
//        statement.setString(2, book.getAuthor());
//        statement.setFloat(3, book.getPrice());
//        statement.setInt(4, book.getId());
//         
//        boolean rowUpdated = statement.executeUpdate() > 0;
//        statement.close();
//        disconnect();
//        return rowUpdated;     
//    }
//     
//    public Book getBook(int id) throws SQLException {
//        Book book = null;
//        String sql = "SELECT * FROM book WHERE book_id = ?";
//         
//        connect();
//         
//        PreparedStatement statement = jdbcConnection.prepareStatement(sql);
//        statement.setInt(1, id);
//         
//        ResultSet resultSet = statement.executeQuery();
//         
//        if (resultSet.next()) {
//            String title = resultSet.getString("title");
//            String author = resultSet.getString("author");
//            float price = resultSet.getFloat("price");
//             
//            book = new Book(id, title, author, price);
//        }
//         
//        resultSet.close();
//        statement.close();
//         
//        return book;
//    }
}
