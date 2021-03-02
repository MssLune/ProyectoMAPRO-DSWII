
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
<title>Mantenimiento Cargo</title>

<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/icon.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/txtList.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidator.css"/>" rel="stylesheet">
<link href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>" rel="stylesheet">


<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/sweetalert/sweetalert.min.js" />"></script>

<script type="text/javascript">
$(document).ready(function(){
	// Activate tooltip
	$('[data-toggle="tooltip"]').tooltip();
	
	// Select/Deselect checkboxes
	var checkbox = $('table tbody input[type="checkbox"]');
	$("#selectAll").click(function(){
		if(this.checked){
			checkbox.each(function(){
				this.checked = true;                        
			});
		} else{
			checkbox.each(function(){
				this.checked = false;                        
			});
		} 
	});
	checkbox.click(function(){
		if(!this.checked){
			$("#selectAll").prop("checked", false);
		}
	});
});
</script>
</head>

<t:menuAdmin> 

<body >
<t:header> </t:header>
    <div class="container" >
        <div class="table-wrapper" >
            <div class="table-title" style="background-color: rgba(56,102,147,0.94); border-radius:8px;">
            <form id="id_form" action="">
					<input type="hidden" name="metodo" value="">
					<button type="submit" class="btn btn-warning"  data-toggle="modal" style="border-radius:8px;" onclick="listarCargo();"> <i class="material-icons" >&#xe896;</i> <span>Filtrar</span> </button>
					</form>
                <div class="row">
                    <div class="col-sm-6">
						<h2>Mantenimiento <b>Cargo</b></h2>
					</div>
					<div class="col-sm-6">
						<a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal" style="border-radius:8px;"><i class="material-icons" >&#xE147;</i> <span>Agregar</span></a>
						<!--  <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal" style="border-radius:8px;"><i class="material-icons" >&#xE15C;</i> <span>Eliminar</span></a>-->						
					</div>
                </div>
            </div>
            
            
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
                        <th>ID</th>                        
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
	<!-- Add Modal HTML -->
	<div id="addEmployeeModal" class="modal fade" style="background-image: url(img/Fondo_2.jpg)">
		<div class="modal-dialog">
		<form class="needs-validation" novalidate action="registraCargo">
           <input type="hidden" name="metodo" value="registraCargo" >
			<div class="modal-content">
			
					<div class="modal-header">						
						<h4 class="modal-title">Agregar Cargo</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">	
						<div class="form-group">
							<label>Cargo</label>
							<input type="text" name="id_cargo" id="id_cargo" class="form-control" required>
						</div>			
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-success" value="Agregar" >
					</div>
				
			</div>
		</form>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<div id="editEmployeeModal" class="modal fade" style="background-image: url(img/Fondo_2.jpg)">
		<div class="modal-dialog">
		<form class="needs-validation" novalidate action="updateCargo">
       
			<div class="modal-content">
				
					<div class="modal-header">						
						<h4 class="modal-title">Editar Cargo</h4>
						<button type="button"  class="close"  data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">		
						<div class="form-group">
							<label>ID</label>
							<input type="text" readonly="readonly"  id="id_codigo" name="codigo_car" class="form-control" required>
						</div>			
					<div class="form-group">
							<label>Cargo</label>
							<input type="text" id="id_nombre" name="nombre_car" class="form-control" required>
						</div>	
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-info" value="Actualizar">
					</div>
			
			</div>	</form>
		</div>
	</div>
	<!-- Delete Modal HTML -->
	<!--<div id="deleteEmployeeModal" class="modal fade" style="background-image: url(img/Fondo_2.jpg)">
		<div class="modal-dialog">
			<div class="modal-content">
			 	<form id="idFormElimina" action="deleteCargo">
				<input type="hidden" id="id_elimina" name="codigo">
					<div class="modal-header">						
						<h4 class="modal-title">Eliminar Cargo</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>¿Estas seguro que deseas eliminar Cargo?</p>
						<p class="text-warning"><small>This action cannot be undone.</small></p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-danger" value="Eliminar">
					</div>
				</form>
				 
			</div>
		</div>
	</div>-->
	   <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
	   <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
	<t:footer></t:footer>
</body>

</t:menuAdmin>

<script type="text/javascript">
$(document).ready(function(){
	var tablaCargo="",filaTabla="";
	$.getJSON("listarCargo",{},function(data){
		$.each(data.dataLista,function(index,item){			
			var eliminar = '<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('
				+ item.idCargo
				+ ');"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
				var actualizar = '<a href="#editEmployeeModal" class="delete" data-toggle="modal" onclick="editar('
					+ item.idCargo+","+item.nomCargo
					+ ');"><i class="material-icons" data-toggle="tooltip" title="Editar">&#xE254;</i></a>';
			filaTabla+="<tr><td></td>"+	
  						"<td></td>"+
						"<td>"+item.idCargo+"</td>"+
						"<td>"+item.nombreCargo+"</td>"+
			 			"<td>"+actualizar+"</td>"+	
						"<td>"+eliminar+"</td></tr>";	
		})
		$("#tablaCargo tbody").append(filaTabla);
	})
});

function editar(codigo,nombre){		
	$("#id_codigo").val(codigo);
	$("#id_nombre").val(nombre);
}

/*function listarCargo(){
	var tablaCargo="",filaTabla="";
	$.getJSON("listarCargo",{},function(data){
		$.each(data.dataLista,function(index,item){
			console.log("id Eliminar :  "+ item.idCargo );
			var eliminar = '<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('
				+ item.idCargo
				+ ');"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
			filaTabla+="<tr><td></td>"+	
  						"<td></td>"+
						"<td>"+item.idCargo+"</td>"+
						"<td>"+item.nombreCargo+"</td>"+
			 			"<td>"+actualizar+"</td>"+	
						"<td>"+eliminar+"</td></tr>";	
		})
		$("#tablaCargo tbody").append(filaTabla);
	})
}*/


</script>

<script type="text/javascript">
function editarSinF(codigo,nombre){	
	$('input[id=id_codigo]').val(codigo);
	$('select[id=id_nombre]').val(nombre);
	$('#editEmployeeModal').modal("show");
}
function eliminar(cod){
	$.ajax({
		url: 'deleteCargo',
		type: 'POST',
		data: {codigo:cod},
		success:function(response){
			if(response.dataMensaje == 1){
				alert("Eliminado correctamente..!");
				$("#tablaUsuario tbody").empty();
				
			}else{
				alert("Error..!");
			}
		},
		error:function(e){
			alert("Error en el controlador..!");
		}
	});
}
</script>

<script type="text/javascript">

$(document).ready(function() {
	car=$("#id_cargo").val();
    $('#tablaCargo').DataTable();
} );

</script>
<script type="text/javascript">
function eliminarsda(codigo){	
	$('input[id=id_elimina]').val(codigo);
	//$('#idFormElimina').submit();
}
</script>
 <script type="text/javascript">
 function registrar(){	
		$('#idModalRegistra').modal("show");
	}
 </script> 


</html>  