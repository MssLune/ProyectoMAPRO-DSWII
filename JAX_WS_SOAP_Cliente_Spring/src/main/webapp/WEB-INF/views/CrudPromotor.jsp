
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
<title>Mantenimiento Promotor</title>


<link rel="shortcut icon" href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>">
<link rel="shortcut icon" href="<c:url value="/resources/css/icon.css"/>">
<link rel="shortcut icon" href="<c:url value="/resources/css/font-awesome.min.css"/>">
<link rel="shortcut icon" href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="shortcut icon" href="<c:url value="/resources/css/txtcrud.css"/>">
<link rel="shortcut icon" href="<c:url value="/resources/css/flaticon.css"/>">

 <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
  <script type="text/javascript" src="<c:url value="/resources/bootstrap.min.js" />"></script>

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

<t:menu> 

<body>
<t:header> </t:header>
    <div class="container" >
        <div class="table-wrapper" >
        
            <div class="table-title" style="background-color: rgba(56,102,147,0.94); border-radius:8px;">
             		<form id="id_form" action=listadoPromotorAll>
					<input type="hidden" name="metodo" value="mantenimientoPromotor">
					<button type="submit" class="btn btn-warning"  data-toggle="modal" style="border-radius:8px; margin: 15px; height: 32px; width: 150px;"> <span>Filtrar</span> </button> 
					</form>
                <div class="row">
                    <div class="col-sm-6"  style="color:#ffff;margin: 5px; font-size:17px;">
						<h2>Mantenimiento <b>Promotor</b></h2>
					</div>			
                </div>
            </div>
            
            
            	<!-- <form id="idFormElimina" action="listadoPromotorAll">
			  		<input type="hidden" name="metodo" value="eliminaPromotor">
			  		<input type="hidden" id="id_elimina" name="codigo">
			 		 </form> -->
			  
           
            	<!-- LISTA -->
            <table id="tablaPromotor"  class="table table-striped table-hover"  style="text-align:center;font-size:10px;">
                <thead>
                    <tr>
                    	<th>Código</th>
                        <th>Nombre</th>
                        <th>Apellido</th>
						<th>Departamento</th>
						<th>Provincia</th>
						<th>Distrito</th>
                        <th>Dirección</th>
						<th>DNI</th>
						<th>Género</th>
						<th>Teléfono</th>
						<th>Correo</th>
						<th>Grado</th>
						<th>Edit</th>
						<th>Delete</th>
                    </tr>
                </thead>
                <tbody>
                
                   <tr>
                   		
                           
                   </tr>      
                                  
                </tbody>
            </table>
			
        </div>
    </div>
	<!-- Edit Modal HTML -->
	<div id="addEmployeeModal" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				
			</div>
		</div>
	</div>
	<!-- Edit Modal HTML -->
	<div id="editEmployeeModal" class="modal fade" style=" background-image: url(/resources/img/dif.png)">
		<div class="modal-dialog" >
		<form  action="actualizaPromotor" method="post" id="idFormModifica">
				<!-- Hidden -->
			<div class="modal-content" style="width:1000px; margin-left:-285px;margin-top:75px;" >
			
				
				
					<div class="modal-header">						
						<h4 class="modal-title">Editar Promotor</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<div class="col-lg-6">
											<div class="form-group">
                                                <label for="validationTooltip01">Código</label>
                                                <input type="text" id="id_codigo" class="form-control" name="codigo"  readonly="readonly" placeholder="Código" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Codigo.
                                                </div>
                                            </div>
						
											<div class="form-group">
                                                <label for="validationTooltip01">Nombres</label>
                                                <input type="text" id="id_nombre" class="form-control"  name="nombre" placeholder="Nombres" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Nombre.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip02">Apellidos</label>
                                                <input type="text" id="id_apellido" class="form-control" name="apellido" placeholder="Apellidos" required>
											<div class="invalid-tooltip">
                                                    Por favor ingrese un Apellido.
                                                </div>
                                            </div>
					    
                                           
											<div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Departamento</p>
                                       		<select  id="id_departamento" name="departamento" class="form-control select"  data-toggle="select">
                                                   <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>
                                            
                                            <div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Provincia</p>
                                       		<select  id="id_provincia" name="provincia" class="form-control select" data-toggle="select">
                                                   <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>

					   						<div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Distrito</p>
                                       		<select  id="id_distrito" name="distrito" class="form-control select"  data-toggle="select">
                                                   <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>
                                            
                                             <div class="form-group">
                                                <label for="validationTooltip03">Dirección</label>
                                                <input type="text" id="id_direccion" class="form-control"  name="direccion" placeholder="Dirección" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese una Dirección.
                                                </div>
                                            </div>
                                            
										</div>
										<div class="col-lg-6">

                                            <div class="form-group">
                                                <label for="validationTooltip05">DNI</label>
                                                <input type="text" id="id_dni" class="form-control"  name="dni" placeholder="DNI" required maxlength="8">
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un dni válido.
                                                </div>
                                            </div>
					  						 <div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Género</p>
                                       		<select  id="id_genero"  class="form-control select" name="genero" data-toggle="select">
                                                    <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>

                                            <div class="form-group">
                                                <label for="validationTooltip06">Telefono</label>
                                                <input type="text" id="id_telefono" class="form-control"  name="telefono" placeholder="Teléfono" required maxlength="9">
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un numero de telefono válido.
                                                </div>
                                            </div>


					  							<div class="form-group">
                                                <label for="validationTooltip07">Email</label>
                                                <input type="text" id="id_email" class="form-control"  name="email" placeholder="Email" required>
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un email válido.
                                                </div>
                                            </div>


												  <div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Grado de Instrucción</p>
                                       		<select  id="id_grado" name="grado" class="form-control select" data-toggle="select">
                                                    <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>	
                                           </div>				
					</div>
					
				
				<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
						<input type="submit" class="btn btn-info" value="Guardar">
					</div>
			</div></form>
		</div>
	</div>
	
	
	
	<!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade"  style="background-image: url(/resources/img/dif.png)">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="borrarPromotor" method="post" >
				<input type="hidden" id="id_elimina" name="codigo">
					<div class="modal-header">						
						<h4 class="modal-title">Eliminar Promotor</h4>
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					</div>
					<div class="modal-body">					
						<p>¿Estas seguro que deseas eliminar Promotor?</p>
						<p class="text-warning"><small>This action cannot be undone.</small></p>
					</div>
					<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancelar">
						<input type="submit" class="btn btn-danger" id="idFormElimina" value="Eliminar">
					</div>
				</form>
			</div>
		</div>
	</div>

	<t:footer></t:footer>
</body>

</t:menu>


<script type="text/javascript">
$(document).ready( function(){
	listaPromotores();
	$.getJSON("listaGeneros",{}, function (data){
		console.log(data);
		
		$.each(data.dataGeneros, function(index, item){
			
			$("#id_genero").append("<option value="+item.idGenero+">"+ item.nombreGenero +"</option>");
			
		});
		
	});

	$.getJSON("listaGrados",{}, function (data){
		console.log(data);
		
		$.each(data.dataGrados, function(index, item){
			
			$("#id_grado").append("<option value="+item.idGrado+">"+ item.nombreGrado +"</option>");
			
		});
		
	});

	
	$.getJSON("listaProvincias",{}, function (data){
		$.each(data.dataProvincias, function(index, item){
			$("#id_provincia").append("<option value="+ item.idProvincia +">"+ item.nombreProvincia +"</option>");
		});
	});
	
	$.getJSON("listaDepartamentos",{}, function (data){
		$.each(data.dataDepartamentos, function(index, item){
			$("#id_departamento").append("<option value="+ item.idDepartamento +">"+ item.nombreDepartamento +"</option>");
		});
	});
	
	$.getJSON("listaDistritos",{}, function (data){
		
		$.each(data.dataDistritos, function(index, item){
	
			$("#id_distrito").append("<option value="+item.idDistrito+">"+ item.nombreDistrito +"</option>");
			
		});
	});
		
	
	
});


</script>


<script type="text/javascript">
function listaPromotores(){
	var tablaPromotor="",filaTabla="";
	$.getJSON("listaPromotorOrigin",{},function(response){
				$.each(response.dataPromotor,function(index,item){
					
					console.log("Codigos a ver : "+item.departamento);
					console.log("Codigos a chequear : "+item.odistrito.idDistrito);	
					
					var editar='<a href="#editEmployeeModal" class="edit" data-toggle="modal" onclick="editar('+
    			    item.codigoPromotor+","+
					"'"+item.nombrePromotor+"',"+
					"'"+item.apellidoPromotor+"',"+
					item.departamento+","+
					item.provincia+","+
					item.distrito+","+
					"'"+item.direccionPromotor+"',"+										    
					item.dniPromotor+","+
					item.genero+","+
					item.telefonoPromotor+","+
					"'"+item.emailPromotor+"',"+
					item.grado+');"><i class="flaticon-edit" data-toggle="tooltip" title="Editar">&#xE254;</i></a>';
					var eliminar='<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('+item.codigoPromotor+');"><i class="flaticon-rubbish-bin-delete-button" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
                   
				   filaTabla+="<tr><td>"+item.codigoPromotor+
					"</td><td>"+item.nombrePromotor+"</td><td>"+
						item.apellidoPromotor+"</td><td>"+item.odepartamento.nombreDepartamento+"</td><td>"+
						item.oprovincia.nombreProvincia+"</td><td>"+item.odistrito.nombreDistrito+"</td><td>"+
						item.direccionPromotor+"</td><td>"+
						item.dniPromotor+"</td><td>"+
						item.ogenero.nombreGenero+"</td><td>"+
						item.telefonoPromotor+"</td><td>"+
						item.emailPromotor+"</td><td>"+
						item.ogrado.nombreGrado+"</td><td>"+
						editar+"</td><td>"+
						eliminar+"</td></tr>";					
				});
			$("#tablaPromotor tbody").append(filaTabla);
	});
}


</script>  



<script type="text/javascript">
function eliminar(codigo){	
	$('input[id=id_elimina]').val(codigo);
	$('#idFormElimina').submit();
}

function modificar(codigo){	
	$('input[id=id_codigo]').val(codigo);
	$('#idFormModifica').submit();
}


</script>

<script type="text/javascript">


		function editar(cod,nom,pat,dep,prov,dis,dir,dni,gen,tel,em,gr){
		//$('#id_registra').data('bootstrapValidator').resetForm(true);
		$("#id_codigo").val(cod);
		$("#id_nombre").val(nom);
		$("#id_apellido").val(pat);
		$("#id_departamento").val(dep);
		$("#id_provincia").val(prov);
		$("#id_distrito").val(dis);
		$("#id_direccion").val(dir);
		$("#id_dni").val(dni);
		$("#id_genero").val(gen);
		$("#id_telefono").val(tel);
		$("#id_email").val(em);
		$("#id_grado").val(gr);
		//$("#id_mensaje").text("Actualizar Promotor");
		//$('#exampleModal').modal({backdrop: 'static',keyboard:false,show:true});
	}
	



</script>