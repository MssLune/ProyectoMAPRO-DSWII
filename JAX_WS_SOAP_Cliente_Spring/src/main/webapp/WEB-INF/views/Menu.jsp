<jsp:include page="intranetValida.jsp" />
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page import="java.util.*" %>
<%@ page import="java.text.SimpleDateFormat"%>

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

    </head>
	<t:menuAdmin>
    <body >
    <t:header> </t:header>
        <!-- Begin page -->
        <div class="wrapper" style="margin-left: -200px; margin:30px;margin-top:65px;">     

            <div class="content-page"  >
                <div class="content">

                    <!-- Start Content-->
                    <div class="container-fluid" style=" width: 100%;" >
                        
                        <!-- start page title -->
                          
                        <!-- end page title --> 

                        <div class="row"  >
                            <div class="col-12">
                                <div class="card" style="width:19;">
                                    <div class="card-body" >

                                        <!-- Invoice Logo-->
                                        <div class="clearfix" >
                                            <div class="float-left mb-3" >
                                                <img src="assets/images/logo-dark.png" alt="" height="18">
                                            </div>
                                            <div class="float-right">
                                                <h4 class="m-0 d-print-none"></h4>
                                            </div>
                                        </div>

                                        <!-- Invoice Detail-->
                                        <div class="row"  >
                                            <div class="col-sm-6">
                                                <div class="float-left mt-3">
                                                    <p><b>Bienvenido,  Sr(a): <!-- Invoice Detail ${sessionScope.objUsuario.nombreCompleto} --></b></p>
                                                    <p class="text-muted font-13">Please find below a cost-breakdown for the recent work completed. Please make payment at your earliest convenience, and do not hesitate to contact me with any questions.</p>
                                                </div>
            
                                            </div><!-- end col -->
                                            <div class="col-sm-4 offset-sm-2">
                                                <div class="mt-3 float-sm-right">
   
                                                    <p class="font-13"><strong>Fecha  : </strong> &nbsp;&nbsp;&nbsp; Jan 17, 2019</p>
                                                    <p class="font-13"><strong>Cargo  : </strong> <span class="badge badge-success float-right">Paid</span></p>
                                                    <p class="font-13"><strong>Codigo : </strong> <span class="float-right">#123456</span></p>
                                                </div>
                                            </div><!-- end col -->
                                        </div>
                                        <!-- end row -->    
                                        <div class="d-print-none mt-4">
                                            <div class="text-right">
                                                <a href="javascript:window.print()" class="btn btn-primary"><i class="mdi mdi-printer"></i> Imprimir</a>
                                                <a href="javascript: void(0);" class="btn btn-info">Enviar</a>
                                            </div>
                                        </div>   
                                        <!-- end buttons -->

                                    </div> <!-- end card-body-->
                                </div> <!-- end card -->
                            </div> <!-- end col-->
                        </div>
                        <!-- end row -->
                        
                    </div> <!-- container -->

                </div> <!-- content -->

                <!-- Footer Start -->
                <footer class="footer">
                    <div class="container-fluid">
                        <div class="row">
                            <div class="col-md-6">
                                2018 © 
                            </div>
                            <div class="col-md-6">
                                <div class="text-md-right footer-links d-none d-md-block">
                                    <a href="javascript: void(0);">About</a>
                                    <a href="javascript: void(0);">Soporte</a>
                                    <a href="javascript: void(0);">Contact Us</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </footer>
                <!-- end Footer -->

            </div>

            <!-- ============================================================== -->
            <!-- End Page content -->
            <!-- ============================================================== -->


        </div>
        <!-- END wrapper -->
        <!-- App js -->
        <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
    </body>
    </t:menuAdmin>
</html>