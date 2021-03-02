<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 <%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 <%@tag description="Overall Page template" pageEncoding="UTF-8"%>
<!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Proyecto MAPRO</title>
        
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
       <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">

        <!-- third party css -->
        
        <link href="<c:url value="/resources/css/jquery-jvectormap-1.2.2.css"/>" rel="stylesheet">
        <!-- third party css end -->

        <!-- App css -->
        <link href="<c:url value="/resources/css/icons.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/app.min.css"/>" rel="stylesheet">
        
		<style>.contenido_iz{max-width:99%; padding-left:270px; padding-right:1%; }</style>
    </head>

    <body>
    

        <!-- Begin page -->
        <div class="wrapper" >

            <!-- ========== Left Sidebar Start ========== -->
            <div class="left-side-menu" >

                <div class="slimscroll-menu" style="background-color:rgba(22,89,56,0.45);" >

                    <!-- LOGO -->
                    <a href="Inicio.jsp" class="logo text-center" style="width:160px; height: 95px; margin:35px; padding-top:-25px; margin-left:auto;">
                        <span class="logo-lg text-center" style="border-radius:6px; background-color: rgba(247,247,247,0.2); width: 125px;height: 95px;">
                            <img src="<c:url value="/resources/img/M.png"/>" height="60px" width="60px">
                            <p style="font-weight:750; letter-spacing: .45em;margin-left: 10px;margin-top:-40px; color:#cedce4; font-size-adjust:13px;font-family: Nunito,sans-serif;">MIMP</p>
                        </span >
                        <span class="logo-sm">                           
                        </span>                        
                    </a>

                    <!--- Sidemenu -->
                    <ul class="metismenu side-nav">
					
						
                        <li class="side-nav-title side-nav-item" style=" font-size:10px;">Inicio</li>

                         <li class="side-nav-item">
                            <a href="#" class="side-nav-link">
                                 <img class="dripicons-view-apps" src="<c:url value="/resources/img/119-user-tie.png"/>" width="12" alt="12">
                                 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                <span style="font-size:13px;font-weight:500;"> Registro </span>
                                <img class="menu-arrow" class="dripicons-view-apps" src="<c:url value="/resources/img/flecha-derecha.png"/>" width="12" alt="12">
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                                <li class="side-nav-item">
                                    <a href="listPromotorJsp">Promotor</a>
                                </li>
                                <li>
                                    <a href="listDNAJsp">DNA</a>
                                </li>
                                <li class="side-nav-item">
                                    <a href="boletajsp">Boleta</a>
                                </li>
                              
                            </ul>
                        </li>

                        <li class="side-nav-item">
                            <a href="#" class="side-nav-link">
                                 <img class="dripicons-view-apps" src="<c:url value="/resources/img/149-cog.png"/>" width="12" alt="12">
                                 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                <span style="font-size:13px;font-weight:500;"> Mantenimiento </span>
                                <img class="menu-arrow" class="dripicons-view-apps" src="<c:url value="/resources/img/flecha-derecha.png"/>" width="12" alt="12">
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                                <li class="side-nav-item">
                                    <a href="crudPromotorjsp">Promotor</a>
                                </li>
                                <li>
                                    <a href="crudDNAjsp">DNA</a>
                                </li>
                                
                            </ul>
                        </li>
            
                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                                 <img class="dripicons-view-apps" src="<c:url value="/resources/img/188-list2.png"/>" width="12" alt="12">
                                 &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                <span style="font-size:13px;font-weight:500;"> Consultas </span>
                                <img class="menu-arrow" class="dripicons-view-apps" src="<c:url value="/resources/img/flecha-derecha.png"/>" width="12" alt="12">
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                                <li>
                                    <a href="listPromotorjsp">Consultar Promotor</a>
                                </li>
                                <li>
                                    <a href="listaDNAJsp">Consultar DNA</a>
                                </li>
                               
                                
                                
                            </ul>
                        </li>

                        <li class="side-nav-item">
                            <a href="javascript: void(0);" class="side-nav-link">
                            
                               <img class="dripicons-view-apps" src="<c:url value="/resources/img/156-stats-dots.png"/>" width="12" alt="12">
                               &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                <span style="font-size:13px;font-weight:500;"> Reportes </span>
                                <img class="menu-arrow" class="dripicons-view-apps" src="<c:url value="/resources/img/flecha-derecha.png"/>" width="12" alt="12">
                            </a>
                            <ul class="side-nav-second-level" aria-expanded="false">
                                 <li>
                                    <a href="ReportePromotor.jsp">Reporte de Promotor</a>
                                </li>
                                <li>
                                    <a href="ReporteDNA.jsp">Reporte de DNA</a>
                                </li>
                              
                            </ul>
                        </li>

                       

                        <li class="side-nav-item">
                            <a href="loginjsp" class="side-nav-link">
                            
                                <img class="dripicons-view-apps" src="<c:url value="/resources/img/277-exit.png"/>" width="12" alt="12">
                                &nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
                                 <span style="font-size:13px;font-weight:500;"> Cerrar sesión</span>
                                
                                <img class="menu-arrow" class="dripicons-view-apps" src="<c:url value="/resources/img/flecha-derecha.png"/>" width="12" alt="12">
                            </a>
                        </li>
				</ul>
                     
                </div>
                <!-- Sidebar -left -->
                

            </div>
            <!-- Left Sidebar End --> 
                     
        </div>
        <div class="contenido_iz"> 
			<section class="content" >
      			<jsp:doBody />
    		</section> 
		</div>
        <!-- bundle -->

        <!-- third party js -->
        <script type="text/javascript" src="<c:url value="/resources/js/Chart.bundle.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-jvectormap-1.2.2.min.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/jquery-jvectormap-world-mill-en.js" />"></script>
        <script type="text/javascript" src="<c:url value="/resources/js/demo.dashboard.js" />"></script>
        
        <!-- third party js ends -->

        <!-- demo app -->
        <script src="js/demo.dashboard.js"></script>
        <!-- end demo js-->
        
    </body>

</html>