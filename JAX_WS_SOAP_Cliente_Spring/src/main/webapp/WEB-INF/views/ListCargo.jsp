
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="img/favicon.ico">
<title>Lista de Cargos</title>



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
$(document).ready(function(){
	$('[data-toggle="tooltip"]').tooltip();
});
</script>

</head>
<t:menuAdmin>  
<body>
<t:header> </t:header>
    <div class="container">
        <div class="table-wrapper">
            <div class="table-title" style="background-color: rgba(56,102,147,0.94); border-radius:8px;">
                <div class="row">
                    <div class="col-sm-4">
						<h2>Lista <b>Cargo</b></h2>
					</div>
				<!-- 	<div class="col-sm-8">						
						<a href="#" class="btn btn-primary" style=" border-radius:8px;"><i class="material-icons">&#xE863;</i> <span>Actualizar Lista</span></a>
						<a href="#" class="btn btn-info" style=" border-radius:8px;"><i class="material-icons">&#xE24D;</i> <span>Exportar a Excel</span></a>
					</div> -->
                </div>
            </div><br>
			<div class="table-filter">
				<div class="row">
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
					
                    <div class="col-sm-9">
                    <form id="id_formCadena">
                    <input type="hidden" name="metodo" value="listaXCaracter">
						<button type="submit" class="btn btn-primary"onclick="listarXCaracter();" style="background-color: white;margin-top:-6px;" id="btn_list" ><img src="img/135-search.png"></button>
						
						<div class="filter-group" style="margin-top:-6px;" >
							<label>Nombre</label>
							<input type="text" class="form-control" name="cadena" id="id_cadena">
						</div>
					</form>
						<br><br><br>
						
                    </div>
                </div>
			</div><br>
		<form id="id_form" action=listaCargoALL>
			<input type="hidden" name="metodo" value="cargoLista">
			<div class="form-group">
				<label class="control-label" for="idCargo">
					CARGO
				</label> 
				<button type="submit" class="btn btn-primary" >FILTRAR</button>
			</div>
		</form>
			
               <table  id="tablaCargo" class="table table-striped table-hover">
                <thead>
                    <tr>
						<!-- <th>
							<span class="custom-checkbox">
								<input type="checkbox" id="selectAll">
								<label for="selectAll"></label>
							</span>
						</th>-->
						<th></th>
						<th></th>
						<th></th>
                        <th>ID</th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th>Nombre</th>
                        <th></th>
						<th></th>
                    </tr>
                </thead>
                <tbody>
                           
                </tbody>
            </table>
			
        </div>
    </div> 
       <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
    <t:footer></t:footer>
</body>
</t:menuAdmin>  

<script type="text/javascript">
function listarCargo(){
	var tablaCargo="",filaTabla="";
	$.getJSON("listarCargo",{},function(data){
				$.each(data.dataLista,function(index,item){
				   filaTabla+="<tr><td></td>"+		 
						  		   "<td></td>"+
						  			"<td></td>"+
				 					"<td>"+item.idCargo+"</td>"+
									"<td></td>"+
									 "<td></td>"+	
									"<td></td>"+	
									"<td></td>"+
				  					"<td>"+item.nombreCargo+"</td></tr>";					
				})
			$("#tablaCargo tbody").append(filaTabla);
	});
}

/*function listarXCaracter(cad){	
	var tablaCargo="",filaTabla="";
	$("#id_cadena").val();
	console.log(cadena);
	$.ajax({
		url:'listaCargoXCaracter',
		type:'POST',
		data:{cadena:cad},	
		success: function(response){
			$("#tablaCargo tbody").empty();
			$.each(data.dataLXCaracteres,function(index,item){
				filaTabla+="<tr><td></td>"+		 
		  		   "<td></td>"+
		  			"<td></td>"+
					"<td>"+item.idCargo+"</td>"+
					"<td></td>"+
					 "<td></td>"+	
					"<td></td>"+	
					"<td></td>"+
					"<td>"+item.nombreCargo+"</td></tr>";							
				});
			$("#tablaCargo tbody").append(filaTabla);
	
	});*/	



$(document).ready(function() {
	var cadena = $("#id_cadena").val();
	//console.log(cadena);
    listarCargo();
} );

</script>
</html>  