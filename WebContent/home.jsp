<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<link rel="stylesheet" type="text/css"
	href="../ForumeContolle/css/bootstrap.css" />
<link rel="stylesheet" type="text/css"
	href="../ForumeContolle/css/btn.css" />
<link rel="stylesheet" type="text/css"
	href="../ForumeContolle/mycss.css" />
<title>Forum</title>
</head>
<body>
 <h1>Forum</h1>

       
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js" integrity="sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI" crossorigin="anonymous"></script>
        

              <ul class="nav nav-pills">
                    <li class="nav-item">
                      <a class="nav-link active" href="#">Chat</a>
                    </li>
                    <li class="nav-item dropdown">
                      <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#">Topics</a>
                      <div class="dropdown-menu">
                        <a class="dropdown-item" href="#">Java EE</a>
                        <a class="dropdown-item" href="#">PHP</a>
                        <a class="dropdown-item" href="#">SPRING</a>

                      </div>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link" href="#">Emploi</a>
                    </li>
                    <li class="nav-item">
                      <a class="nav-link disabled" href="#">Contact</a>
                    </li>
                  </ul>

              <div class="container">
                    <h2>Commentaires</h2>
                  
                    <div id="accordion">
                      <div class="card">
                        <div class="card-header">
                          <a class="card-link" data-toggle="collapse" href="#collapseOne">
                            Commentaire 
                            
                           
                          </a>
                        </div>
                        <div id="collapseOne" class="collapse show" data-parent="#accordion">
                          <div class="card-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                          </div>
                        </div>
                      </div>
                      <div class="card">
                        <div class="card-header">
                          <a class="collapsed card-link" data-toggle="collapse" href="#collapseTwo">
                          Commentaire -2-
                        </a>
                        </div>
                        <div id="collapseTwo" class="collapse" data-parent="#accordion">
                          <div class="card-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                          </div>
                        </div>
                      </div>
                      <div class="card">
                        <div class="card-header">
                          <a class="collapsed card-link" data-toggle="collapse" href="#collapseThree">
                            Commentaire -3-
                          </a>
                        </div>
                        <div id="collapseThree" class="collapse" data-parent="#accordion">
                          <div class="card-body">
                            Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                          </div>
                        </div>
                      </div>
                    </div>
                  </div>
</body>
</html>