
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">
<title>Lista de DNA</title>


<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/icon.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/txtList.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidator.css"/>" rel="stylesheet">
<link href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>" rel="stylesheet">

<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/js/bootstrapValidator.js" />"></script>


    
<script type="text/javascript">
/*$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
});*/
</script>

</head>
<t:menu>  
<body>
<t:header> </t:header>
    <div class="container">
        <div class="table-wrapper">
            <div class="table-title" style="background-color: rgba(56,102,147,0.94); border-radius:8px;">
                <div class="row">
                
                    <div class="col-sm-4">
						<h2>Lista <b>DNA</b></h2>
					</div>
					<!-- <div class="col-sm-8">						
						<a href="#" class="btn btn-primary"><i class="material-icons">&#xE863;</i> <span>Actualizar Lista</span></a>
						<a href="#" class="btn btn-info"><i class="material-icons">&#xE24D;</i> <span>Exportar a Excel</span></a>
					</div> -->
                </div>
            </div><br>
			<div class="table-filter">
				<div class="row">
				<!-- NO SE COMO PROGRAMAR ESTA XD  -->
                    <div class="col-sm-3">
						<div class="show-entries">
							<span>Mostrar</span>
							<select class="form-control">
								<option>5</option>
								<option>10</option>
								<option>15</option>
								<option>20</option>
							</select>
							<span>registros</span>
						</div>
					</div>
					
					<!--LISTADO POR CARÁCTERES -->
                    <div class="col-sm-9">
                    <form action="#">
                    <input type="hidden" name="metodo" value="DnaXCaraceteres"> 
						<button type="submit" class="btn btn-primary" style="background-color: white;margin-top:-6px;"><img src="<c:url value="/resources/img/135-search.png"/>"></button>
						<div class="filter-group" style="margin-top:-6px;" >
							<label>Nombre</label>
							<input type="text" class="form-control" name="letra">
							</div>
						</form>
						
						
						<!--LISTADO PROMOTOR POR DEPARTAMENTO -->
						<form id="id_form" action="listaDnaXDepartamento">
						<div class="filter-group">
							<input type="hidden" name="codigo" value="1">
							<label>Departamento</label>
							<select id="comboDepartamento" class="form-control" name="departamento">
								<option value=" ">[SELECCIONE]</option>
								<option value="-1">[TODOS]</option>				
							</select>
						</div>
						</form>
						
						<!--<div class="filter-group">
							<label>DNA</label>
							<select class="form-control">
								<option>[Seleccione]</option>
							</select>
						</div><br><br><br>-->
						
                    </div>
                </div>
			</div><br>
			<!-- FORM-BUTTON FILTRAR -->
			<form id="id_form" action=#>
			<input type="hidden" name="metodo" value="promotorLista">
			<div class="form-group">
				<label class="control-label" for="idPromotor">
					PROMOTORES 
				</label> 
				<button type="submit" class="btn btn-primary" >FILTRAR</button>
			</div>
		</form>
					<!-- LISTA -->
            <table id="tablaDNA" class="table table-striped table-hover" style="text-align:center;">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Nombre</th>
                        <th>Documento</th>
                        <th>Direccion</th>
						<th>Departamento</th>
						<th>Provincia</th>
						<th>Distrito</th>
                        <th>Telefono</th>
						<th>Dias</th>
						<th>Ambiente</th>
						<th>Privado</th>
						<th>Promotor</th>
                    </tr>
                </thead>
                <tbody id="tablaDNAe">
                                   
                </tbody>
            </table>
        </div>
    </div>  
    <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
    <t:footer></t:footer>
</body>
</t:menu>  

<script type="text/javascript">
var codigoTipo=0;

function listaDNAS(){
	var tablaDNA="",filaTabla="";
	$.getJSON("listaDNA",{},function(response){
				$.each(response.dataDNA,function(index,item){
				   filaTabla+="<tr><td>"+item.codigoDna+
					"</td><td>"+item.nombreDna+"</td><td>"+
						item.documentoDna+"</td><td>"+
						item.direccionDna+"</td><td>"+item.departamento.nombreDepartamento+"</td><td>"+
						item.provincia.nombreProvincia+"</td><td>"+item.distrito.nombreDistrito+"</td><td>"+
						item.telefonoDna+"</td><td>"+
						item.diasDna+"</td><td>"+
						item.ambienteDna+"</td><td>"+
						item.ambienteprivDna+"</td><td>"+
						item.promotor.nombrePromotor+"</td></tr>";					
				})
			$("#tablaDNA tbody").append(filaTabla);
	});
}

/*

function listaDNAS(){
	$("#tablaDNA").DataTable().destroy();
	$("#tablaDNA tbody").empty(); 
	var tablaDocente="",filaTabla="";
	$.getJSON("listaPromotor",{},
			  function(data){
				$.each(data.dataPromotor,function(index,item){
					
				   filaTabla+="<tr><td>"+item.codigoPromotor+
	 						"</td><td>"+item.nombrePromotor+"</td><td>"+
	 						item.apellidoPromotor+"</td><td>"+item.departamento.nombreDepartamento+"</td><td>"+
	 						item.idProvincia+"</td><td>"+item.idDistrito+"</td><td>"+
	 						item.direccionPromotor+"</td><td>"+
	 						item.dniPromotor+"</td><td>"+item.genero.nombreGenero+"</td><td>"+tem.telefonoPromotor+"</td><td>"+
	 						item.emailPromotor+"</td><td>"+
	 						item.grado.nombreGrado+"</td></tr>";			
				})
			$("#tablaDNA tbody").append(filaTabla);
			$("#tablaDNA").DataTable().draw();
			$("#tablaDNA").DataTable();
	});
}  
*/


</script>

<script type="text/javascript">

 $(document).ready( function(){
	 listaDNAS();
	 
	$.getJSON("listaDepartamentos",{}, function (data){
		$.each(data.dataDepartamentos, function(index, item){
			$("#comboDepartamento").append("<option value="+ item.idDepartamento +">"+ item.nombreDepartamento +"</option>");
		});
	});
	
	
	$("#comboDepartamento").change(function(){
		console.log($(this).val());
		$("#id_form").submit();
	});


	/*$("#comboDepartamento").change(function(e){
		cod=$(this).val();
		//limpiar 
		$("#tablaDNA").empty();
		
	$.ajax({
		url:'listaPromotorXDepartamento',
		type:'POST',
		data:{codigo:cod},
		success:function(response){
			
			$.each(response.dataPromDep,function(index,item){
				//validar
				
				if(codigoTipo==item.idDistrito)
					$("#tablaDNAe").append("<tr><td>"+item.codigoPromotor+
	 						"</td><td>"+item.nombrePromotor+"</td><td>"+
	 						item.apellidoPromotor+"</td><td>"+item.departamento.nombreDepartamento+"</td><td>"+
	 						item.provincia.nombreProvincia+"</td><td>"+item.distrito.nombreDistrito+"</td><td>"+
	 						item.direccionPromotor+"</td><td>"+
	 						item.dniPromotor+"</td><td>"+item.idGenero+"</td><td>"+tem.telefonoPromotor+"</td><td>"+
	 						item.emailPromotor+"</td><td>"+
	 						item.idGrado+"</td></tr>");
				else
					$("#tablaDNAe").append("<tr><td>"+item.codigoPromotor+
	 						"</td><td>"+item.nombrePromotor+"</td><td>"+
	 						item.apellidoPromotor+"</td><td>"+item.departamento.nombreDepartamento+"</td><td>"+
	 						item.idProvincia+"</td><td>"+item.idDistrito+"</td><td>"+
	 						item.direccionPromotor+"</td><td>"+
	 						item.dniPromotor+"</td><td>"+item.genero.nombreGenero+"</td><td>"+tem.telefonoPromotor+"</td><td>"+
	 						item.emailPromotor+"</td><td>"+
	 						item.grado.nombreGrado+"</td></tr>");
				
				
			})
			
			
			
			
		}
	})
	///////

	//////
	})
		*/
	
	
	
	
	
	
});
	



	

</script>

</html>  