<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html >
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://ajax.googleapis.com/ajax/libs/jqueryui/1.11.2/themes/smoothness/jquery-ui.css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.0/css/all.css">
    <script src="js/jQuery.min.js"></script>
    <script src="js/jqueryui.min.js"></script>
    <script src="css/bootstrap_4_3/js/bootstrap.bundle.min.js"></script>
    <link rel="stylesheet" href="css/style.css">
    <title>Produtos</title>
</head>
<body>
    <header id="header" class="d-flex align-items-center scroll-Active">
        <nav class="navbar-expand-lg navbar-dark fixed-top floatRight" style="background-color:#f8f9fa!important" id="nav-bar">
          <div class="container-fluid">
            
            
            <div class="" id="navbarResponsive">
              <ul class="navbar-expand navbar-nav ml-auto floatRight">
                <li class="nav-item pl-2 pr-2">
                  <a class="nav-link js-scroll-trigger" href="#header">
                    <i class="fas fa-home hidden-md-up" style="font-size:1.5em"></i>
                    <span class="hidden-sm-down">Inicio</span>
                  </a>
                </li>
                
                <li class="nav-item pl-2 pr-2">
                  <a class="nav-link js-scroll-trigger" href="#Product"> 
                    <i class="fas fa-list-alt hidden-md-up" style="font-size:1.5em"></i> 
                      <span class="hidden-sm-down">Produtos</span>
                  </a>
                </li>
                
                <li class="nav-item pl-2 pr-2">
                  <a class="nav-link js-scroll-trigger" href="#Tutorial">
                    <i class="fas fa-video hidden-md-up" style="font-size:1.5em"></i> 
                      <span class="hidden-sm-down"></span>
                  </a>
                </li>
                
                <li class="nav-item pl-2 pr-2" style="border-bottom:1px solid #622569;">
                  <div class="cart text-center">
                    <i class="fa fa-shopping-basket fa-2x shopping-cart"></i>
                    <i class="fa fa-caret-down"></i>
                    <!--br-->
                    <span id="items-basket">0</span>
                  </div>
                  <div id="cart-items" class="card text-center col-lg-3 col-md-3 col-sm-6 col-xs-6 offset-sm-1" style="background-color:#f8f9fa!important">
                    <div class="card-body">
                      <span id="emptyCart">Produtos no carrinho</span>
                      <ol class="list-group list-group-flush" id="list-item"></ol>
                    </div>
                    
                    <div class="card-title">Total : <span id="total-price">$0</span></div>
                    <div class="card-body d-flex">
                      <span id="email-me">Email me the list</span>
                      <form class="form-inline justify-content-center" id="form">
                        <div class="form-group row">
                          <input type="email" id="inputemail" class="form-control" placeholder="name@example.com"> <i class="fas fa-paper-plane m-2"></i>
                        </div>
                      </form>
                    </div>
                  </div>
                </li>
              </ul>
            </div>
          </div>
        </nav>
        
       
        
      </header>
      <div class="container">
      <section id="Product">
              <div class="container-fluid">
                              <div class="row mt-6 mb-3">
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12">
                          <h2 class="align-left">
                             Lista de produtos
                          </h2>
                      </div>
                                  </div>
                  <div class="row justify-content-center align-items-start">
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://gaston.vteximg.com.br/arquivos/ids/275370-1000-1000/2001099525_Ampliada.jpg?v=637086393512900000" alt="" />
      
                              
                                  <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Nike</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_600,f_auto,q_auto/d210aea304c048e596cea80b00d5793b_9366/Camiseta_Trefoil_Preto_CW0709_21_model.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Adidas preta</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_600,f_auto,q_auto/2d197c27eaed4401a930ac5900f455a0_9366/Camisa_Human_Race_FC_Bayern_Vermelho_GJ9088_21_model.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Bayer de Munique</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_385,h_385,f_auto,q_auto:sensitive,fl_lossy/9856a403d5574b199e66ab4901830fa2_9366/jaqueta-corta-vento-essentials.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Blusa de frio adidas</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_385,h_385,f_auto,q_auto:sensitive,fl_lossy/2ba2ec210c1d41488533ab370045d21a_9366/camiseta-globe.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Adidas branca</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_385,h_385,f_auto,q_auto:sensitive,fl_lossy/cbb60a90a0aa40dfbbc9abf1011abdd5_9366/camisa-pre-jogo-real-madrid.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Real Madrid Feminina</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_385,h_385,f_auto,q_auto:sensitive,fl_lossy/d581c6245a19414a9c6eab34015c3e20_9366/camisa-internacional-2.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa Internacional</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
                      <div class="col-lg-3 col-md-4 col-sm-6 col-xs-12 mb-3 mt-3">
                          <div class="item">
                              <img class="img-thumbnail" src="https://assets.adidas.com/images/w_385,h_385,f_auto,q_auto:sensitive,fl_lossy/605dfc266b0b40f0a4bcabf0016a1e7b_9366/blusa-moletom-capuz-pride-flag-fill-genero-neutro-unisex.jpg" alt="" />
                               <div class="text-center">
                                      <h4 class="product-name marginTop">Camisa</h4>
                                  </div>
                                  <div class="text-center marginTop">
                                     Valor $15.00
                                  </div>
                              
                              <div class="text-center marginTop">
                                      <button class="btn add-to-cart" type="button">Adicionar ao carrinho</button>
                                </div>
                          </div>
                      </div>
      
                  </div>
              </div>
          </section>
          </div>
      
          
          <footer>
              <div class="container">
                  <div class="row mt-3">
                      <div class="col-lg-12 col-md-12 col-sm-12 col-xs-12 d-flex justify-content-center align-items-center my-auto footer">
      
                          <ul class="navbar-expand navbar-nav">
                              <li class="nav-item pl-2 pr-2">
                                  <a href="#" target="_blank"><i class="fab fa-linkedin"></i></a>
                              </li>
                              <li class="nav-item pl-2 pr-2">
                                  <a href="#" target="_blank"><i class="fab fa-free-code-camp"></i></a>
                              </li>
      
                              <li class="nav-item pl-2 pr-2" style="border-bottom:1px solid gray;">
                                  Feito por Caio Moreno
                                  
                              </li>
                          </ul>
                      </div>
                  </div>
              </div>
          </footer>

          <script src="js/main.js"></script>
</body>
</html>