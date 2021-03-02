
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Reporte Cargo</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="." name="description" />
        <meta content="Coderthemes" name="" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="img/favicon.ico">

        <!-- App css -->
        <link href="css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="css/app.min.css" rel="stylesheet" type="text/css" />

    </head>
     <t:menuAdmin>
    <body>
<t:header> </t:header>
        <!-- Begin page -->
   <div class="wrapper" style="margin-left:-170px;">

	<div class="content-page">
                <div class="content">
                    <!-- Start Content-->
                    <div class="container-fluid">
                        
                        <!-- start page title -->
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    
                                    <h4 class="page-title">Reporte Cargo</h4>
                                     <hr>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 

                            <div class="row" >
                            <div class="col-12" >
                                <div class="card" >
                                   
                                    <div class="card-body" style="background-color: rgba(226,229,232,0.67)"  >
                                    <form class="needs-validation" novalidate action="viewReportPdf" >
										<!-- <input type="hidden" name="metodo" value="reporteCargo"> --> 
										 <button type="submit" class="btn btn-secondary" style="background-color:rgba(56,102,147,0.94);  width: 100px; height: 40px; margin-left:47%; border-radius:15px; ">Generar PDF</button>
                                   
                                          <div class="form-group position-relative mb-3" style="border:solid rgba(226,229,232,0.67)no 2px; width:100%; height:300px;" >
                                                
                                            </div>
                                            <div></div>
                                         </form>
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div> <!-- end col-->
                  		 </div>
					</div>
			</div>
		</div>
	</div>


        <!-- App js -->
        <script src="js/app.min.js"></script>
		<script src="js/demo.toastr.js"></script>
		<script src="js/app.min.js"></script>
		<t:footer></t:footer>
    </body>
  </t:menuAdmin>
</html>
