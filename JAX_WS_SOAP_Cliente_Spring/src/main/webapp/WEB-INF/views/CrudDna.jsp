
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
<title>Mantenimiento DNA</title>


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
             		<form id="id_form" action=listadoDNAAll>
					<input type="hidden" name="metodo" value="mantenimientoDNA">
					<button type="submit" class="btn btn-warning"  data-toggle="modal" style="border-radius:8px; margin: 15px; height: 32px; width: 150px;"> <span>Filtrar</span> </button> 
					</form>
                <div class="row">
                    <div class="col-sm-6"  style="color:#ffff;margin: 5px; font-size:17px;">
						<h2>Mantenimiento <b>DNA</b></h2>
					</div>			
                </div>
            </div>
            
            
            	<!-- <form id="idFormElimina" action="listadoPromotorAll">
			  		<input type="hidden" name="metodo" value="eliminaPromotor">
			  		<input type="hidden" id="id_elimina" name="codigo">
			 		 </form> -->
			  
           
            	<!-- LISTA -->
            <table id="tablaDNA"  class="table table-striped table-hover"  style="text-align:center;font-size:10px;">
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
		<form  action="actualizarDna" method="post" id="idFormModifica">
				<!-- Hidden -->
			<div class="modal-content" style="width:1000px; margin-left:-285px;margin-top:75px;" >
			
				
				
					<div class="modal-header">						
						<h4 class="modal-title">Editar DNA</h4>
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
                                                <label for="validationTooltip02">Documento</label>
                                                <input type="text" id="id_documento" class="form-control" name="documento" placeholder="Apellidos" required>
											<div class="invalid-tooltip">
                                                    Por favor ingrese un Documento.
                                                </div>
                                            </div>
					    					  <div class="form-group">
                                                <label for="validationTooltip02">Dirección</label>
                                                <input type="text" id="id_direccion" class="form-control" name="direccion" placeholder="Apellidos" required>
											<div class="invalid-tooltip">
                                                    Por favor ingrese un Documento.
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
                                                <label for="validationTooltip03">Teléfono</label>
                                                <input type="text" id="id_telefono" class="form-control"  name="telefono" placeholder="Dirección" required maxlength="9">
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Teléfono.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip03">Días</label>
                                                <input type="text" id="id_dias" class="form-control"  name="dias" placeholder="Dirección" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Día.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip03">N° Ambiente</label>
                                                <input type="text" id="id_ambiente" class="form-control"  name="ambiente" placeholder="Dirección" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Ambiente.
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="validationTooltip03">N° A. Privado</label>
                                                <input type="text" id="id_ambientepriv" class="form-control"  name="ambientePriv" placeholder="Dirección" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Ambiente Privado.
                                                </div>
                                            </div>
												  <div class="form-group">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Promotor</p>
                                       		<select  id="id_promotor" name="promotor" class="form-control select" data-toggle="select">
                                                    <option value="0" selected>Seleccione </option>
                                                </select>
                                            </div>	
                                           </div>				
					</div>
					
				
				<div class="modal-footer">
						<input type="button" class="btn btn-default" data-dismiss="modal" value="Cancel">
						<input type="submit" class="btn btn-info" value="Guardar">
					</div>
			</div>
		</form>
		</div>
	</div>
	<!-- Delete Modal HTML -->
	<div id="deleteEmployeeModal" class="modal fade"  style="background-image: url(/resources/img/dif.png)">
		<div class="modal-dialog">
			<div class="modal-content">
				<form action="borrarDna" method="post" >
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
	listarDna();
	
	$.getJSON("listaPromotor",{}, function (data){
		console.log(data);
		
		$.each(data.dataProm, function(index, item){
			
			$("#id_promotor").append("<option value="+item.codigoPromotor+">"+ item.nombrePromotor +"</option>");
			
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
function listarDna(){
	var tablaDNA="",filaTabla="";
	$.getJSON("listaDNA",{},function(response){
				$.each(response.dataDNA,function(index,item){
					
					var editar='<a href="#editEmployeeModal" class="edit" data-toggle="modal" onclick="editar('+
    			    item.codigoDna+","+
					"'"+item.nombreDna+"',"+
					"'"+item.documentoDna+"',"+
					"'"+item.direccionDna+"',"+
					item.departamento.idDepartamento+","+
					item.provincia.idProvincia+","+
					item.distrito.idDistrito+","+
					item.telefonoDna+","+										    
					item.diasDna+","+
					item.ambienteDna+","+
					item.ambienteprivDna+","+
					item.promotor.codigoPromotor+');"><i class="flaticon-edit" data-toggle="tooltip" title="Editar">&#xE254;</i></a>';
					var eliminar='<a href="#deleteEmployeeModal" class="delete" data-toggle="modal" onclick="eliminar('+item.codigoDna+');"><i class="flaticon-rubbish-bin-delete-button" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
                   
					 filaTabla+="<tr><td>"+item.codigoDna+
						"</td><td>"+item.nombreDna+"</td><td>"+
							item.documentoDna+"</td><td>"+
							item.direccionDna+"</td><td>"+item.departamento.nombreDepartamento+"</td><td>"+
							item.provincia.nombreProvincia+"</td><td>"+item.distrito.nombreDistrito+"</td><td>"+
							item.telefonoDna+"</td><td>"+
							item.diasDna+"</td><td>"+
							item.ambienteDna+"</td><td>"+
							item.ambienteprivDna+"</td><td>"+
							item.promotor.nombrePromotor+"</td><td>"+
							editar+"</td><td>"+
							eliminar+"</td></tr>";				
				});
			$("#tablaDNA tbody").append(filaTabla);
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


		function editar(cod,nom,docu,dire,dep,prov,dis,telef,dia,ambi,priv,promo){
		//$('#id_registra').data('bootstrapValidator').resetForm(true);
		$("#id_codigo").val(cod);
		$("#id_nombre").val(nom);
		$("#id_documento").val(docu);
		$("#id_direccion").val(dire);
//		$("input[name=tipoMoneda]").trigger("click").val([tip]);
		$("#id_departamento").val(dep);
		$("#id_provincia").val(prov);
		$("#id_distrito").val(dis);
		$("#id_telefono").val(telef);
		$("#id_dias").val(dia);
		$("#id_ambiente").val(ambi);
		$("#id_ambientepriv").val(priv);
		$("#id_promotor").val(promo);
		//$("input[name=promotor]").trigger("click").val([promo]);
		//$("#id_mensaje").text("Actualizar Promotor");
		//$('#exampleModal').modal({backdrop: 'static',keyboard:false,show:true});
	}
	



</script>