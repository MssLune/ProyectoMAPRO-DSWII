
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
<title>Lista de Usuarios</title>


<link href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/icon.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/txtList.css"/>" rel="stylesheet">

<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
    
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
						<h2>Lista <b>Usuarios</b></h2>
					</div>
					
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
                    <form action="listadoUsuarioAll">
                    <input type="hidden" name="metodo" value="usuarioXCaraceteres">
						<button type="submit" class="btn btn-primary" style="background-color: white;margin-top:-6px;"><img src="img/135-search.png"></button>
						<div class="filter-group" style="margin-top:-6px;">
							<label>Nombre</label>
							<input type="text" class="form-control" name="letra">
						</div>
						</form>
						
						<form id="id_form" action="#">
						<div class="filter-group">
						<input type="hidden" name="metodo" value="usuarioXCargo">
							<label>Cargo</label>
							<select id="comboCargo" class="form-control" name="codigo">
								<option value=" ">[SELECCIONE]</option>
								<option value="-1">[TODOS]</option>							
							</select>
						</div>
						</form><br><br><br>
						
                    </div>
                </div>
			</div><br>
			
			<!-- FORM-BUTTON FILTRAR -->
			<form id="id_form" action=listadoUsuarioAll>
			<input type="hidden" name="metodo" value="usuarioLista">
			<div class="form-group">
				<label class="control-label" for="idUsuario">
					USUARIOS 
				</label> 
				<button type="submit" class="btn btn-primary" >FILTRAR</button>
			</div>
		</form>
           
        		<!-- LISTA -->
            <table id="tablaUsuario" class="table table-striped table-hover" style="text-align:center;">
                <thead>
                    <tr>
                        <th>#</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
						<th>ID</th>
						<th>Password</th>
						<th>Correo</th>
                        <th>Fecha</th>
						<th>Cargo</th>
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

$(document).ready(function() {
	var tablaPromotor="",filaTabla="";
	$.getJSON("listarUsuario",{},function(response){
		$.each(response.dataListaUsu,function(index,item){
			
			var eliminar = '<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('
				+ item.codigoUsuario
				+ ');"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
			var actualizar = '<a href="#editEmployeeModal" class="edit" data-toggle="modal" onclick="editar('
				+ item.codigoUsuario + ","+ "'"+  item.nombreUsuario+"'"+","+"'"+item.apellidoUsuario+"'"+","+"'"+item.idUsuario+"'"+","+"'"+item.passwordUsuario+"'"+
				","+"'"+item.correoUsuario+"'"+","+"'"+item.fechaUsuario+"'"+","+item.cargo.idCargo
				+ ');"><i class="material-icons" data-toggle="tooltip" title="Editar">&#xE254;</i></a>';
			
		   filaTabla+="<tr><td>"+item.codigoUsuario+
			"</td><td>"+item.nombreUsuario+"</td><td>"+
				item.apellidoUsuario+"</td><td>"+
				item.idUsuario+"</td><td>"+
				item.passwordUsuario+"</td><td>"+
				item.correoUsuario+"</td><td>"+
				item.fechaUsuario+"</td><td>"+
				item.cargo.nombreCargo+"</td><td>"+
				eliminar+"</td><td>"+
				actualizar+"</td></tr>";					
		})
	$("#tablaUsuario tbody").append(filaTabla);
});
	
	 $.getJSON("listarCargo",{},function(response){
			console.log(response);
			$.each(response.dataLista,function(index,item){			
				$("#comboCargo").append("<option value='"+item.idCargo+"'>"+item.nombreCargo+"</option>");
				
			})
		})
		//CONSULTA POR COMBO	
		$("#comboCargo").change(function(){
			cod = $(this).val();
			console.log(cod);
			
			$.ajax({
				url: 'listarXCargo',
				type: 'POST',
				data:{codigo:cod},
				success:function(response){
					$("#comboCargo tbody").empty();
					$.each(response.dataListaUXCargo,function(index,item){
						//CAPTURAR EL ID DEL PLATO
						$("#id_table_Plato").append("<tr><td></td>"+		 
						  		   "<td></td>"+
						  			"<td></td>"+
				 					"<td>"+item.idCargo+"</td>"+
									"<td></td>"+
									 "<td></td>"+	
									"<td></td>"+	
									"<td></td>"+
				  					"<td>"+item.nombreCargo+"</td></tr>"								
						);						
					});
					
				}
				
			})
			
		});
	
} );

</script>

<script type="text/javascript">
$(document).ready( function(){
	$.getJSON("AllCombo",{metodo:"cargaCargo"}, function (data){
		$.each(data, function(index, item){
			$("#comboCargo").append("<option value="+ item.idCargo +">"+ item.nombreCargo +"</option>");
		});
	});
});
	
$("#comboCargo").change(function(){
	console.log($(this).val());
	$("#id_form").submit();
});
	

</script>

</html>  