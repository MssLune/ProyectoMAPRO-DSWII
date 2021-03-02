<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
    <head>
    	<meta charset="utf-8" />
        <title>Registro de Boleta</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="." name="description" />
        
        <!-- App favicon -->
        <link rel="shortcut icon" href="img/favicon.ico">

        <!-- App css -->
        <link href="css/icons.min.css" rel="stylesheet" type="text/css" />
        <link href="css/app.min.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" href="css/icon.css">
		
		<script src="js/jquery.min.js"></script>
		<script src="js/bootstrap.min.js"></script>

<style>

.black_overlay {
	display: none;
	position: absolute;
	top: 0%;
	left: 0%;
	width: 100%;
	height: 100%;
	background-color: black;
	z-index: 1001;
	-moz-opacity: 0.8;
	opacity: .80;
	filter: alpha(opacity = 80);
}

.white_content {
	display: none;
	position: absolute;
	top: 25%;
	left: 25%;
	width: 50%;
	height: 50%;
	padding: 16px;
	border: 16px solid gray;
	background-color: white;
	z-index: 1002;
	overflow: auto;
	border-radius:6px; 
}
</style>
<script type="text/javascript">
var a;
var lista=[];

	function addpromotor(){
		document.getElementById("metodo").value ='ingresa';
		document.getElementById("frmBoleta").action = 'ingresa';
		document.getElementById("frmBoleta").submit();
	}
	function addBoleta(){
		document.getElementById("metodo").value ='registra';
		document.getElementById("frmBoleta").action = 'boleta';
		document.getElementById("frmBoleta").submit();
	}


	function verCliente(){
		document.getElementById("fondo").style.display ='block';
		document.getElementById("divCliente").style.display ='block';
		
	}
	function verdna(){
		document.getElementById("fondo").style.display ='block';
		document.getElementById("divdna").style.display ='block';
		
		
	}
	function ocultaCliente(){
		document.getElementById("fondo").style.display ='none';
		document.getElementById("divCliente").style.display ='none';
	}
	function ocultadna(){
		document.getElementById("fondo").style.display ='none';
		document.getElementById("divdna").style.display ='none';
	}	
	
function buscaCliente(){
		
		document.getElementById("idFormCliente").submit();	 
	}
	
function prueba(){
	ocultadna();
	ocultaCliente();
	
	}
function addpromotorx(){
	var tablaAdd="",filaTabla="";
	var codx=$("#nombre_prom").val();
	var cod=$("#nombre_dna").val();
	var list=$("#tablaAdd").val();
	console.log(cod);
	console.log(codx);
	//var valores = new Array();
	
	//myList.push($("#tablaAdd").val());
	/*$("#tablaAdd").parents("tr").find("td").each(function(){
	    valores+=$(this).html()+"\n";
	});
	*/
	//console.log(valores);
	/*$("dataTable tbody tr").click(function() {
		  var total = $(this).find("td:last-child").text();
		  alert(total);
		  
		});*/
	
	
	 $.ajax({
	    	url: 'ingresa2',
	    	type: 'GET',
	    	data:{cod:cod},
	    	
	    	success: function(response){
	    		lista.push(response);
	    					$.each(response.dnasx,function(index,item){
	    						
	    					   filaTabla+="<tr><td>"+item.codigoDna+
	    						"</td><td>"+item.nombreDna+"</td><td>"+
	    							70+"</td><td>"+
	    							85+"</td></tr>";
	    					  
	    					});
	    					
	    					$("#tablaAdd").append(filaTabla);
	    					
	    	}
	    });
	 console.log(lista);
}

function registrapromotorx(){
	var tablaAdd="",filaTabla="";
	var codx=$("#nombre_prom").val();
	var cod=$("#nombre_dna").val();
	//
	console.log(cod);
	console.log(codx);
	console.log(lista);
	 $.ajax({
	    	url: 'registra',
	    	type: 'POST',
	    	data:{nombre_dna:cod,nombre_prom:codx},
	    	success: function(response){
	    			console.log(response);
	    	}
	    });
	
}



function sel(codigo){	
	$('input[id=id_elimina]').val(codigo);
	$('#idFormElimina').submit();
	a=codigo;
	document.getElementById("nombre_prom").value = codigo;
	console.log(codigo);
	

}

function sele(codigo){	
	$('input[id=id_eliminas]').val(codigo);
	$('#idFormEliminas').submit();
	document.getElementById("nombre_dna").value = codigo;
	console.log(codigo);
}

//SIN PARAMETRO
function listaPromotor(){
	var tablaPromotor="",filaTabla="";
	$.getJSON("listaPromotor",{},function(response){
		console.log(response);
				$.each(response.clientesx,function(index,item){
					var sel='<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="sel('+item.codigoPromotor+');"><i class="flaticon-rubbish-bin-delete-button" data-toggle="tooltip" title="Seleccionar">&#xE872;</i></a>';
	                   
				   filaTabla+="<tr><td>"+item.codigoPromotor+
					"</td><td>"+item.nombrePromotor+"</td><td>"+
						item.apellidoPromotor+"</td><td>"+
						item.direccionPromotor+"</td><td>"+
						item.dniPromotor+"</td><td>"+
						item.telefonoPromotor+"</td><td>"+
						item.emailPromotor+"</td><td>"+
						sel+"</td></tr>";		
				   $("#tablaPromotorbody").empty();
				});
			$("#tablaPromotorbody").append(filaTabla);
			
	});
}


function buscarDna(){
	
	var tablaDna="",filaTabla="";
	var cod=$("#nombre_prom").val();
	console.log(cod);
	console.log(a);
	 $.ajax({
	    	url: 'buscarDNAProm',
	    	type: 'GET',
	    	data:{cod:cod},
	    	
	    	success: function(response){
	    			console.log(response);
	    					$.each(response.dnas,function(index,item){
	    						var sel='<a href="#deleteEmployeeModals" onclick="sele('+item.codigoDna+');"><i class="flaticon-rubbish-bin-delete-button" data-toggle="tooltip" title="Seleccionar">&#xE872;</i></a>';
	    		                
	    					   filaTabla+="<tr><td>"+item.codigoDna+
	    						"</td><td>"+item.nombreDna+"</td><td>"+
	    							item.documentoDna+"</td><td>"+
	    							item.direccionDna+"</td><td>"+
	    							item.telefonoDna+"</td><td>"+
	    							item.ambienteDna+"</td><td>"+
	    							sel+"</td></tr>";
	    					   $("#tablaDnabody").empty();
	    					});
	    					$("#tablaDnabody").append(filaTabla);
	    		
	    	}
	    });
	
}



</script>

</head>


<t:menu>
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
                                    
                                    <h4 class="page-title">Boleta</h4>
                                     <hr>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 

                 <div class="row" >
                            <div class="col-12" >
                                <div class="card" >
                             		 <div class="card-body" style="background-color: rgba(226,229,232,0.67)"  >
                                      
									
									<form id="frmBoleta" action="">
												<input type="hidden" name="lista" id="listax" value=" ">
												
												<fieldset style="width: 90%;margin-left:65px;">
												   <h6>SELECCIONE PROMOTOR</h6>
											
													<h6>Promotor</h6> <input type="text" name="nombre_prom" id="nombre_prom" value=" " readonly  style="background-color: rgba(56,102,147,0.15);">&nbsp;&nbsp;
													<input type="button" value="..."  style="background-color: rgba(56,102,147,0.15);"  onclick="verCliente();" />
												</fieldset>
												<br><br>
												<fieldset style="width: 90%;margin-left:65px;">
													<h6>SELECCIONE DNA</h6>	
													
													<h6>DNA</h6> <input type="text" name="nombre_dna" id="nombre_dna"  value="" readonly  style="background-color: rgba(56,102,147,0.15);"> &nbsp;&nbsp;
													<input type="button" value="..."  style="background-color: rgba(56,102,147,0.15);" onclick="verdna();">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													
													<input type="button" class="btn btn-primary" value="Agregar" onclick="addpromotorx();" style="background-color:rgba(56,102,147,0.84);  width: 150px; border-radius:12px; " >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
													<input type="button" class="btn btn-primary" value="Registrar" onclick="registrapromotorx();" style="background-color: rgba(56,102,147,0.84); width: 150px;  border-radius:12px;" >
												</fieldset>
									
													
									
										</form>
									
									 		
                                    </div> <!-- end card-body-->
                                    
                                    <table class="dataTable" style="width: 60%" id="bean" align="center" >	
												<thead>
												<tr>
													<th class="sortable">CODIGO</th>
													<th class="sortable">NOMBRE</th>
													<th class="sortable">PRECIO</th>
													<th class="sortable">IMPORTE</th>
												</tr>
												</thead>
												<tbody id="tablaAdd">
													
													<tr class="odd">
														
                										
													</tr>
												
												</tbody>
									</table>
												
                                </div> <!-- end card-->
                        			
                            </div> <!-- end col-->
                   </div>


               
</div></div></div>

												

</div>


<div id="fondo" class="black_overlay">

</div>
	
<div id="divCliente" class="white_content">
<h4>BUSCA PROMOTOR</h4>

	<form id="idFormCliente" >
		<h6>Promotor</h6> 
		
		<input type="button" class="btn btn-primary" value="Buscar" onclick="listaPromotor();" style="background-color:rgba(56,102,147,0.85);  width: 90px; border-radius:7px; "/>
		<input type="button"  class="btn btn-primary" value="Salir" onclick="ocultaCliente();" style="background-color:rgba(56,102,147,0.85);  width: 90px; border-radius:7px; "/>
		<br>
		
	 </form>
	 <table class="bordered2" width="100%" border="2" id="tablaPromotor">

			 <tr style="font:bold">
			<td style="width:80px">ID</td>
			 <td style="width:95px">NOMBRE</td>
			 <td style="width:95px">APELLIDO</td>
			 <td style="width:70px">DIRECCION</td>
			 <td style="width:120px">DNI</td>
			<td style="width:120px">TELEFONO</td>
			<td style="width:120px">EMAIL</td>
			 <td style="width:20px"></td>
			 </tr>

		<tbody id="tablaPromotorbody">
 					<tr>
                   		
                           
                   </tr>  
 		</tbody> 
	</table>
</div>


<div id="divdna" class="white_content">

<h5>BUSCA DNA</h5>

<form action="" method="get" id="idFormdna">
	<h6>DNA</h6> 
	<input type="button" class="btn btn-primary" value="Buscar" onclick="buscarDna();" style="background-color:rgba(56,102,147,0.85);  width: 90px; border-radius:7px; "/> 
			
 	<input type="button" class="btn btn-primary" value="Salir" onclick="ocultadna();" style="background-color:rgba(56,102,147,0.85);  width: 90px; border-radius:7px;"/><br>
 </form>
 <table class="bordered2" width="100%" border="2" id="tablaDna">

			 <tr style="font:bold">
			<td style="width:80px">ID</td>
			 <td style="width:95px">NOMBRE</td>
			 <td style="width:95px">DOCUMENTO</td>
			 <td style="width:70px">DIRECCION</td>
			<td style="width:120px">TELEFONO</td>
			<td style="width:120px">PROMOTOR</td>
			 <td style="width:20px"></td>
			 </tr>

		<tbody id="tablaDnabody">
 					<tr>
                   		
                           
                   </tr>  
 		</tbody> 
	</table>
</div>  


<div id="deleteEmployeeModal" class="modal fade" style="background-image: url(/resources/img/dif.png)">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="" method="post" >
				<input type="hidden" id="id_elimina" name="cod">
					<div class="modal-header">						
						<h4 class="modal-title">Seleccionar Promotor</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>¿Estas seguro que deseas seleccionar Promotor?</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="button" class="btn btn-warning" data-dismiss="modal" onclick="ocultaCliente();" id="idFormElimina" value="Seleccionar">
					</div>
				</form>
			</div>
		</div>
	</div>
	
	<div id="deleteEmployeeModals" class="modal fade" style="background-image: url(/resources/img/dif.png)">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="" method="post" >
				<input type="hidden" id="id_eliminas" name="cod">
					<div class="modal-header">						
						<h4 class="modal-title">Seleccionar Dna</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>¿Estas seguro que deseas seleccionar Dna?</p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="button" class="btn btn-warning" data-dismiss="modal" onclick="ocultadna();" id="idFormEliminas" value="Seleccionar">
					</div>
				</form>
			</div>
		</div>
	</div>
	

	
	

        <!-- App js -->
        <script src="js/app.min.js"></script>
		<script src="js/demo.toastr.js"></script>
		
		<t:footer></t:footer>
    </body>
  </t:menu>
<script type="text/javascript">

</script>  

</html>
