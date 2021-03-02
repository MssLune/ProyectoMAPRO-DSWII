<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@tag description="Overall Page template" pageEncoding="UTF-8"%>
 
 <!DOCTYPE html>
    <html lang="en">
  <head>
        <meta charset="utf-8" />
        <title>Inicio</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">

        <!-- App css -->
         <link href="<c:url value="/resources/css/icons.min.css"/>" rel="stylesheet">
          <link href="<c:url value="/resources/css/app.min.css"/>" rel="stylesheet">
           <link href="<c:url value="/resources/css/app.min431.css"/>" rel="stylesheet">
           

    </head>
  
  <body>
  
  <!-- Topbar Start -->
  
                <div class="content" style="margin:30px;background-color:rgba(246,246,247,0.80)">
                    <div class="navbar-custom">
                        <ul class="list-unstyled topbar-right-menu float-right mb-0">

                            <li class="dropdown notification-list">
                                <a class="nav-link dropdown-toggle arrow-none" data-toggle="dropdown" href="#" role="button" aria-haspopup="false" aria-expanded="false">
                                 <img class="dripicons-bell noti-icon" src="<c:url value="/resources/img/notificacion.png"/>" width="32" alt="32" style="padding-top:15px;">
                                  <span class="noti-icon-badge"></span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-menu-animated dropdown-lg">

                                    <!-- item-->
                                    <div class="dropdown-item noti-title">
                                        <h5 class="m-0">
                                            <span class="float-right">
                                                <a href="javascript: void(0);" class="text-dark">
                                                    <small>Borrar Todo</small>
                                                </a>
                                            </span>Notificaciones
                                        </h5>
                                    </div>

                                    <div class="slimscroll" style="max-height: 230px;">
                                        
                                        <!-- item-->
                                        <a href="ListExpediente.jsp" class="dropdown-item notify-item">
                                            <div class="notify-icon bg-info">
                                               <img src="<c:url value="/resources/img/188-list2.png"/>">
                                            </div>
                                            <p class="notify-details">Tiene 3 registros por aprobar
                                                
                                                <small class="text-muted">Hace 2 minutos.</small>
                                            </p>
                                        </a>
                                    </div>

                                    <!-- All-->
                                    <a href="javascript:void(0);" class="dropdown-item text-center text-primary notify-item notify-all">
                                        Ver todo
                                    </a>

                                </div>
                            </li>

                            <li class="dropdown notification-list">
                                <a class="nav-link dropdown-toggle nav-user arrow-none mr-0" data-toggle="dropdown" href="#" role="button" aria-haspopup="false"
                                    aria-expanded="false">
                                    <span class="account-user-avatar"> 
                                        <img src="<c:url value="/resources/img/user.png"/>" alt="user-image" class="rounded-circle">
                                    </span>
                                    <span> <!-- item  ${sessionScope.objUsuario.nombreCompleto}-->
                                        <span class="account-user-name"> ${sessionScope.objUsuario.nombreCompleto} </span>
                                        <span class="account-position">Bienvenido</span>
                                    </span>
                                </a>
                                <div class="dropdown-menu dropdown-menu-right dropdown-menu-animated profile-dropdown ">
                                    <!-- item-->
                                    <div class=" dropdown-header noti-title">
                                        <h6 class="text-overflow m-0">Opciones Avanzadas</h6>
                                    </div>

                                    <!-- item-->
                                    <a href="CrudUsuario.jsp" class="dropdown-item notify-item">
                                        <img alt="" src="<c:url value="/resources/img/150-cogs.png"/>">
                                        <span>Configuración</span>
                                    </a>

                                    <!-- item-->
                                    <a href="javascript:void(0);" class="dropdown-item notify-item">
                                        <img alt="" src="<c:url value="/resources/img/help.png"/>">
                                        <span>Ayuda</span>
                                    </a>

                                    <!-- item-->
                                    <a href="Login.jsp" class="dropdown-item notify-item">
                                        <img alt="" src="<c:url value="/resources/img/277-exit.png"/>">
                                        <span>Cerrar Sesión</span>
                                    </a>

                                </div>
                            </li>

                        </ul>
                        <button class="button-menu-mobile open-left disable-btn">
                            <i class="mdi mdi-menu"></i>
                        </button>
                        <div class="app-search">
                            <form>
                                <div class="input-group">
                                <!--img search  -->
                                <img class="mdi mdi-magnify " src="<c:url value="/resources/img/search.png"/>" height="30px" width="30px" style="margin-right: 5px; margin-top: 3px;">
                                    <input type="text" class="form-control" placeholder="Buscar...">
                                  <!--  <span class="mdi mdi-magnify"></span> -->  
                                    <div class="input-group-append">
                                        <button class="btn btn-primary" type="submit" style="background-color: rgba(56,102,147,0.94);">Buscar</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                    
                 
            </div>
                    <!-- end Topbar -->
                    
                    
       
       <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>             

  
  </body>
  
  </html>