<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="esS">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">

<link href="<c:url value="/resources/css/bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrap-theme.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidator.min.css"/>" rel="stylesheet">

<link href="<c:url value="/resources/css/bootstrap-datepicker.css"/>" rel="stylesheet">

<link href="<c:url value="/resources/css/dataTables.bootstrap.min.css"/>" rel="stylesheet">
<link href="<c:url value="/resources/css/bootstrapValidator.min.css"/>" rel="stylesheet">


<script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrapValidator.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.dataTables.min.js" />"></script>
<script type="text/javascript" src="<c:url value="/resources/js/dataTables.bootstrap.min.js" />"></script>

<script type="text/javascript" src="<c:url value="/resources/js/bootstrap-datepicker.min.js" />"></script>


<script type="text/javascript" src="<c:url value="/resources/sweetalert/sweetalert.min.js" />"></script>

<title>Docente</title>
<style>
	.btn-primary{
		background: #46b8da;
		border-color:#46b8da;
		color: white !important;
		text-align: center;
		font-size: 14px;
	}
	.btn-primary:hover{
		background: #46b8da;
		border-color:#46b8da;
		color: white !important;
	}
	.btn-primary:focus{
		background: #46b8da;
		border-color:#46b8da;
		color: white !important;
	}	
</style>
</head>
<body>
	<div class="container">
		<h3 align="center">Lista Docentes</h3>
					<button type="button" data-toggle='modal' onclick="modalDocente();"  
					class='btn btn-primary' id="validateBtnw2" >Nuevo Docente</button><br>&nbsp;<br>		
			<div id="divDocente">
		 								<table id="id_table_docente" class="table table-bordered table-condensed table-hover table-striped dataTable no-footer" 
	            							role="grid" aria-describedby="dataTable_info">
												<thead>
														<tr>
															<th>Código</th>
															<th>Nombre</th>
															<th>Paterno</th>
															<th>Materno</th>
															<th>Sexo</th>
															<th>Hijos</th>
															<th>Sueldo</th>
															<th></th>
															<th></th>
														</tr>
												</thead>
												<tbody>
																									
												</tbody>
											</table>	
			</div>	

		<!-- Nuevo y Acualizar -->
		<div class="modal fade" id="exampleModal">
		  <div class="modal-dialog" role="document">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">Docente</h5>
		  
		      </div>
		      <div class="modal-body">
				<div class="panel panel-info">
					<div class="panel-heading">
						<div class="panel-title" id="id_mensaje">Registra Docente</div>
					</div>
					<div class="panel-body">
						<form action="#" class="form-horizontal" id="id_registra"
								method="post"  data-toggle="validator" role="form">
							<input type="hidden"  id="id_codigo">
							<div class="form-group">
								<label for="i_nombre" class="col-lg-3 control-label">Nombre</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="id_nombre" 
										name="nombre" placeholder="Ingresar nombre"/>
								</div>
							</div>
							<div class="form-group">
								<label for="i_paterno" class="col-lg-3 control-label">Paterno</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="id_paterno" 
										name="paterno" placeholder="Ingresar Paterno"/>
								</div>
							</div>
							<div class="form-group">
								<label for="i_materno" class="col-lg-3 control-label">Materno</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="id_materno" 
										name="materno" placeholder="Ingresar materno"/>
								</div>
							</div>
							<div class="form-group">
								<label for="i_sexo" class="col-lg-3 control-label">Sexo</label>
								<div class="col-lg-9">
								<select id="id_sexo" name="sexo" class='form-control'>
										  <option value=" ">[SELECCIONE]</option>
										  <option value="Masculino">Masculino</option>
										  <option value="Femenino">Femenino</option>
    						    </select>
								</div>
							</div>
							<div class="form-group">
								<label for="i_hijos" class="col-lg-3 control-label">Hijos</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="id_hijos" 
										name="hijos" placeholder="Ingresar hijos"/>
								</div>
							</div>
							<div class="form-group">
		                         <label class="col-lg-3 control-label" for="id_reg_sueldo">Sueldo</label>
		                         <div class="col-lg-5">
									<input class="form-control" id="id_sueldo" name="sueldo" placeholder="Ingrese Sueldo"/>
		                        </div>
		                    </div>
							<div class="form-group">
								<label for="i_direccion" class="col-lg-3 control-label">Dirección</label>
								<div class="col-lg-9">
									<input type="text" class="form-control" id="id_direccion" 
										name="direccion" placeholder="Ingresar dirección"/>
								</div>
							</div>
							<div class="form-group">
								<label for="i_distrito" class="col-lg-3 control-label">Distrito</label>
								<div class="col-lg-9">
								<select id="id_distrito" name="distrito" class='form-control'>
										  <option value=" ">[SELECCIONE]</option>
    						    </select>
								</div>
							</div>
							
						</form>
					</div>
			</div>
			</div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-primary" onclick="postValidarRegistra()">Guardar</button>
                 <button type="button" class="btn btn-danger" id="resetBtn">Cerrar</button>
		      </div>
		    </div>
		  </div>
		</div>
		<!-- FIN Nuevo y Acualizar-->			
		
		
		
		
		
		
		
		
		
	</div>




<script type="text/javascript">

	function listarDocentes(){
		$("#id_table_docente").DataTable().destroy();
		$("#id_table_docente tbody").empty(); 
		var tablaDocente="",filaTabla="";
		$.getJSON("listaDocentes",{},
				  function(data){
					$.each(data.dataDocentes,function(index,item){
						var editar='<button type="button" class="btn btn-success" onclick="editarDocente('+
						    			    item.codigo+","+
										"'"+item.nombre+"',"+
										"'"+item.paterno+"',"+
										"'"+item.materno+"',"+
										"'"+item.sexo+"',"+
										    item.numHijos+","+
											item.sueldo+","+										    
										"'"+item.direccion+"',"+
										    item.codigoDistrito+')">Editar</button>';
						var eliminar='<button type="button" class="btn btn-btn-danger" onclick="eliminarDocente('+
											item.codigo+')">Eliminar</button>';
					   filaTabla+="<tr><td>"+item.codigo+"</td>"+		 
							  						  "<td>"+item.nombre+"</td>"+
							  						  "<td>"+item.paterno+"</td>"+
					 								  "<td>"+item.materno+"</td>"+
													  "<td>"+item.sexo+"</td>"+
													  "<td>"+item.numHijos+"</td>"+	
													  "<td>"+item.sueldo+"</td>"+	
													  "<td>"+editar+"</td>"+
					  								  "<td>"+eliminar+"</td></tr>";					
					})
				$("#id_table_docente tbody").append(filaTabla);
				$("#id_table_docente").DataTable().draw();
				$("#id_table_docente").DataTable();
		});
	}
	function listarDistritos(){
		$.getJSON("listaDistritos",{},
				  function(data){
					$.each(data.dataDistritos,function(index,item){
					  $("#id_distrito").append("<option value='"+item.codigo+"'>"+
							  						  			 item.nombre+"</option>");					
					})
				});
	}
	function postValidarRegistra() {
		var validator = $('#id_registra').data('bootstrapValidator');
        validator.validate();
        if (validator.isValid()) {
        	registrarDocente();
        }
	}
	function registrarDocente(){
		var codo,nom,pat,mat,sex,hij,sue,dir,dis;
		cod=$("#id_codigo").val();		
		nom=$("#id_nombre").val();
		pat=$("#id_paterno").val();
		mat=$("#id_materno").val();
		sex=$("#id_sexo").val();
		hij=$("#id_hijos").val();
		sue=$("#id_sueldo").val();
		dir=$("#id_direccion").val();
		dis=$("#id_distrito").val();
		json=JSON.stringify({codigo:cod,nombre:nom,paterno:pat,materno:mat,
							 sexo:sex,numHijos:hij,sueldo:sue,direccion:dir,codigoDistrito:dis});
		swal({
			  title: "Seguro de Guardar?",
			  text: "",
			  icon: "warning",
			  buttons: true,
			  dangerMode: true,
			})
			.then((willSave) => {
			  if (willSave) {
				  $.ajax({
						url:  'saveDocente',
						type: 'POST',
						data: json,
						contentType:'application/json',
						success:function(data){
							if(data.dataMensaje==1){
								console.log(data);
								swal("Registro Guardado correctamente...","","success");
								listarDocentes();
								$("#exampleModal").modal("hide");
								$('#id_registra').data('bootstrapValidator').resetForm(true);
			   			    	$('#id_registra').trigger("reset");
							}
							else
								swal("Error al guardar el registro...","","error");
						},
						error: function (jqXhr) { // error callback 
							swal("Mensaje", "Disculpe, existió un problema", "error");
				    	}
					})
					$("#id_codigo").val(0);
				  	$('#id_registra2').data('bootstrapValidator').resetForm(true);
			    	swal("Registro Guardado...","","success");
			  } 
			});
	}
	function modalDocente(){
		$('#id_registra').data('bootstrapValidator').resetForm(true);
	    $('#id_registra').trigger("reset");
		$("#id_mensaje").text("Registrar Docente");
		$("#id_codigo").val(0);
		$('#exampleModal').modal({backdrop: 'static', keyboard: false,show:true});  
	}
	function editarDocente(cod,nom,pat,mat,sexo,hijos,sue,direc,distrito){
		$('#id_registra').data('bootstrapValidator').resetForm(true);
		$("#id_codigo").val(cod);
		$("#id_nombre").val(nom);
		$("#id_paterno").val(pat);
		$("#id_materno").val(mat);
		$("#id_sexo").val(sexo);
		$("#id_hijos").val(hijos);
		$("#id_sueldo").val(sue);
		$("#id_direccion").val(direc);
		$("#id_distrito").val(distrito);
		$("#id_mensaje").text("Actualizar Docente");
		$('#exampleModal').modal({backdrop: 'static',keyboard:false,show:true});
	}
	function eliminarDocente(id){		
		swal({
			  title: "Seguro de Eliminar?",
			  text: "Eliminar docente con Código : "+id,
			  icon: "warning",
			  buttons: true,
			  dangerMode: true,
			})
			.then((willDelete) => {
			  if (willDelete) {
				  $.ajax({
						url:'deleteDocente',
						type:'POST',
						data:{docenteCod:id},
						success: function(response){
							if(response.dataMensaje==1){
								console.log(response);
								swal("Registro eliminado correctamente...","","success");
								listarDocentes();
							}
							else
								swal("Error en la eliminación del registro...","","error");
						},
						error: function (jqXhr) { // error callback 
							swal("Mensaje", "Disculpe, existió un problema "+jqXhr, "error");
				    	}
					});
			    	
			  }
			});
	}	
</script>

<script type="text/javascript">
	$(document).ready(function() {
		listarDocentes();
		listarDistritos();
		$('#resetBtn').click(function() {
	        $('#id_registra').data('bootstrapValidator').resetForm(true);
	        $('#exampleModal').modal("hide");
	    });    
	} );
</script>
<script type="text/javascript">
$(document).ready(function() {
	//validar registra nuevo empleado
	$('#id_registra').bootstrapValidator({
	    message: 'This value is not valid',
	    feedbackIcons: {
	        valid: 'glyphicon glyphicon-ok',
	        invalid: 'glyphicon glyphicon-remove',
	        validating: 'glyphicon glyphicon-refresh'
	    },
	    fields: {
	    	nombre: {
	            validators: {
	                notEmpty: {
	                    message: 'El campo Nombre es requerido. No puede estar vacio'
	                },
	                stringLength: {
	                    min: 3,
	                    max: 30,
	                    message: 'El nombre debe contener minimo 3 y maximo de 30 letras'
	                },
	                regexp: {
	                    regexp: /^[a-zA-Z\s\á\é\í\ó\ú\Á\É\Í\Ó\Ú\ñ\Ñ]+$/,
	                    message: 'El nombre sólo puede contener letras'
	                }
	            }
	        },
	        paterno:{
	        	validators:{
	        		notEmpty: {
	                    message: 'El campo Paterno es requerido. No puede estar vacio'
	                }
	        	}
	        }
	        
	        
	
	    }
	});
});
</script>
</body>
</html>







