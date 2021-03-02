
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
<title>Mantenimiento Usuario</title>

<link href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/icon.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/font-awesome.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/txtcrud.css"/>" rel="stylesheet">
<!-- ME -->
<!--
<link href="<c:url value="/resources/bs_cs/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/bs_cs/bootstrap-theme.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/bs_cs/bootstrapValidator.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/bs_cs/dataTables.bootstrap.min.css"/>" rel="stylesheet">
  -->
<script type="text/javascript" src="<c:url value="/resources/bs_js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bs_js/bootstrapValidator.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bs_js/dataTables.bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bs_js/jquery.dataTables.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bs_js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/bs_js/jquery-3.3.1.min.js" />"></script>

<!-- END ME -->
<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>


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
            
               <form id="id_form" action=#>
					<button type="button" onclick="listaUsuario();" class="btn btn-warning"  data-toggle="modal" style="border-radius:8px;"> <i class="material-icons" >&#xe896;</i> <span>Filtrar</span> </button>
					</form>
					
                <div class="row">
                    <div class="col-sm-6">
						<h2>Mantenimiento <b>Usuarios</b></h2>
					</div>
					<div class="col-sm-6">
						<a href="#addEmployeeModal" class="btn btn-success" data-toggle="modal" style="border-radius:8px;"><i class="material-icons" >&#xE147;</i> <span>Agregar</span></a>
						<!--  <a href="#deleteEmployeeModal" class="btn btn-danger" data-toggle="modal" style="border-radius:8px;"><i class="material-icons" >&#xE15C;</i> <span>Eliminar</span></a>-->						
					</div>
				</div>
			</div>

            	<!-- LISTA -->
            <table id="tablaUsuario"  class="table table-striped table-hover" style="text-align:center;">
                <thead>
                    <tr>
                        <th>Código</th>
                        <th>Nombre</th>
						<th>Apellido</th>
                        <th>ID</th>
                        <th>Password</th>
                        <th>Correo</th>
                        <th>Fecha Nacimiento</th>
                        <th>Cargo</th>
                    </tr>
                </thead>
                <tbody>
                   
                </tbody>
            </table>
			
        </div>
    </div>
    
    	<!-- Add Modal HTML -->
	<div id="addEmployeeModal" class="modal fade" style="background-image: url(img/dif.png)">
		<div class="modal-dialog">
			<form class="needs-validation" novalidate action="registraUsuario">
			<div class="modal-content">
			
					<div class="modal-header">						
						<h4 class="modal-title">Agregar Usuario</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">	
									
						<div class="form-group">
							<label>Nombre</label>
							<input type="text" id="id_nombre" name="nombre" class="form-control" required>
						</div>	
						
						<div class="form-group">
							<label>Apellido</label>
							<input type="text" id="id_apellido" name="apellido" class="form-control" required>
						</div>	
						
					    <div class="form-group">
							<label>ID Usuario</label>
							<input type="text" id="id_usuario" name="usuario" class="form-control" required>
						</div>	
						
						<div class="form-group">
							<label>Contraseña</label>
							<input type="text" id="id_contraseña" name="contrasena" class="form-control" required>
						</div>
						
						<div class="form-group">
							<label>Correo</label>
							<input type="text" id="id_correo" name="correo" class="form-control" required>
						</div>
						
						<div class="form-group">
							<label>Fecha de Nacimiento</label>
							<input type="text" id="id_fecha" name="fecha" class="form-control" required>
						</div>
						<div class="form-group">
							<label>Cargo</label>
							<select id="comboCargo" class="form-control" name="cargo">
								<option value=" ">[SELECCIONE]</option>
								<option value="-1">[TODOS]</option>							
							</select>
						</div>
						
										
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-success" value="Agregar">
					</div>
					
					
				
			</div></form>
		</div>
	</div>
    
	<!-- Edit Modal HTML -->
	<div id="editEmployeeModal" class="modal fade" style="background-image: url(img/dif.jpg)">
		<div class="modal-dialog"><!-- updateUsuario -->
				<form  action="">
			    <div class="modal-content" style="width:1000px; margin-left:-285px;margin-top:75px;" >
					<div class="modal-header">						
						<h4 class="modal-title">Editar Usuario</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<div class="col-lg-6">
											<div class="form-group">
                                                <label for="validationTooltip01">Código</label>
                                                <input type="text" id="id_codigo_ac" class="form-control" name="codigo_ac"  readonly="readonly" placeholder="Código" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Codigo.
                                                </div>
                                            </div>						
											<div class="form-group">
                                                <label for="validationTooltip01">Nombres</label>
                                                <input type="text" id="id_nombre_ac" class="form-control"  name="nombre_ac" placeholder="Nombres" required>                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Nombre.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip02">Apellidos</label>
                                                <input type="text" id="id_apellido_ac" class="form-control" name="apellido_ac" placeholder="Apellidos" required>
											<div class="invalid-tooltip">
                                                    Por favor ingrese un Apellido.
                                                </div>
                                            </div>  
                                             <div class="form-group">
                                                <label for="validationTooltip03">ID</label>
                                                <input type="text" id="id_id_ac" class="form-control"  name="id_ac" placeholder="Id" required>
                                                   <div class="invalid-tooltip">
                                                    Por favor ingrese un Id.
                                                </div>
                                            </div>                                            
										</div>
										<div class="col-lg-6">
                                            <div class="form-group">
                                                <label for="validationTooltip05">Password</label>
                                                <input type="password" id="id_password_ac" class="form-control"  name="password_ac" placeholder="password" required>
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un password válido.
                                                </div>
                                            </div>
					  	                     <div class="form-group">
                                                <label for="validationTooltip06">Correo</label>
                                                <input type="text" id="id_correo_ac" class="form-control"  name="correo_ac" placeholder="Correo" required>
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un correo válido.
                                                </div>
                                            </div>
					  							<div class="form-group">
                                                <label for="validationTooltip07">Fecha de Nacimiento</label>
                                                <input type="text" id="id_fecha_ac" class="form-control"  name="fecha_ac" placeholder="Fecha" required>
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese una fecha válida.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip07">Cargo</label>
                                                <input type="text" id="id_cargo_ac" class="form-control"  name="cargo_ac" placeholder="Cargo" readonly="readonly" required>
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un cargo
                                                </div>
                                            </div>
                                           </div>				
					</div>
					
					
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-success" value="Guardar" onclick="guardar();">
					</div>
					</div>
				</form>
			</div>
		</div>
	<!-- Delete Modal HTML -->
<!-- 	<div id="deleteEmployeeModal" class="modal fade"  style="background-image: url(img/dif.png)">
		<div class="modal-dialog">
			<div class="modal-content">
				<form id="idFormElimina" action="deleteUsuario">
				<input type="hidden" id="id_elimina" name="codigo">
					<div class="modal-header">						
						<h4 class="modal-title">Eliminar Usuario</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>¿Estas seguro que deseas eliminar Usuario?</p>
						<p class="text-warning"><small>This action cannot be undone.</small></p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
						<input type="submit" class="btn btn-danger" value="Delete">
					</div>
				</form>
			</div>
		</div>
	</div>
 -->	
	   <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
	   <script type="text/javascript" src="<c:url value="/resources/js/app.min.js" />"></script>
	<t:footer></t:footer>
</body>

</t:menuAdmin>

<script type="text/javascript">
function eliminar(codigo){	
	$('input[id=id_elimina]').val(codigo);
	$('#idFormElimina').submit();
}
</script>

<script type="text/javascript">

function guardar(cod){
	var codigo,nombre,apellido,id,password,correo,fecha,cargo,json;
	codigo=$("#id_codigo_ac").val();
	nombre=$("#id_nombre_ac").val();
	apellido=$("#id_apellido_ac").val();
	id=$("#id_id_ac").val();
	password=$("#id_password_ac").val();
	correo=$("#id_correo_ac").val();
	fecha=$("#id_fecha_ac").val();
	cargo=$("#id_cargo_ac").val();
	json=JSON.stringify({
		codigoUsuario:codigo,nombreUsuario:nombre,apellidoUsuario:apellido,idUsuario:id,
		passwordUsuario:password,correoUsuario:correo,fechaUsuario:fecha,cargo:{
			idCargo:cargo,
			nombreCargo:""
		}
	});
	
	$.ajax({
		url: 'updateUsuariobjbj',
		type: 'POST',
		data: json,
		contentType:"application/json",
		success:function(response){
			if(response.dataUpdate != 1){
				alert("Actualizado correctamente...!");
			}else{
				alert("Error...!");
			}
		},error:function(e){
			alert("Error en el controlador");
		}
	})
}
function eliminar(cod){
	$.ajax({
		url: 'deleteUsuario',
		type: 'POST',
		data: {codigo:cod},
		success:function(response){
			if(response.dataEliminar == 1){
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

function listaUsuario(){
	var tablaPromotor="",filaTabla="";
	/*var eliminar = '<a href="#deleteEmployeeModal" class="delete" data-toggle='' onclick="eliminar()"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
	var editar = '<a href="#editEmployeeModal" class="edit" data-toggle="modal" onclick="editar"><i class="material-icons" data-toggle="tooltip" title="Editar">&#xE254;</i></a>';
	*/
		
	$.getJSON("listarUsuario",{},function(response){
				$.each(response.dataListaUsu,function(index,item){
					
					var eliminar = '<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('
						+ item.codigoUsuario
						+ ');"><i class="material-icons" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
					var actualizar = '<a href="#editEmployeeModal" class="edit" data-toggle="modal" onclick="editar('
						+ item.codigoUsuario + ","+ "'"+  item.nombreUsuario+"'"+","+"'"+item.apellidoUsuario+"'"+","+"'"+item.idUsuario+"'"+","+"'"+item.passwordUsuario+"'"+
						","+"'"+item.correoUsuario+"'"+","+"'"+item.fechaUsuario+"'"+","+item.cargo.nombreCargo
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
}

$(document).ready(function() {
   // $('#tablaUsuario').DataTable();
    console.log("despues debe de salir el objCombo");
    $.getJSON("listarCargo",{},function(response){
		console.log(response);
		$.each(response.dataLista,function(index,item){			
			$("#comboCargo").append("<option value='"+item.idCargo+"'>"+item.nombreCargo+"</option>");
			
		})
	})
} );
console.log("fin debe de salir el objCombo");
</script>


<script type="text/javascript">
function editar(codigo,nombre,apellido,id,password,correo,fecha,cargo){		
	$("#id_codigo_ac").val(codigo);
	$("#id_nombre_ac").val(nombre);
	$("#id_apellido_ac").val(apellido);
	$("#id_id_ac").val(id);
	$("#id_password_ac").val(password);
	$("#id_correo_ac").val(correo);
	$("#id_fecha_ac").val(fecha);
	$("#id_cargo_ac").val(cargo);
}

</script>


</html>  