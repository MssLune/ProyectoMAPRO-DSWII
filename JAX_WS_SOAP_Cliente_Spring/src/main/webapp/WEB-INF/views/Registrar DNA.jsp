
<%@taglib tagdir="/WEB-INF/tags" prefix="t" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <title>Registro de DNA</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta content="A fully featured admin theme which can be used to build CRM, CMS, etc." name="description" />
        <meta content="Coderthemes" name="author" />
        <!-- App favicon -->
        <link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">

        <!-- App css -->
        <link href="<c:url value="/resources/css/icons.min.css"/>" rel="stylesheet">
        <link href="<c:url value="/resources/css/app.min.css"/>" rel="stylesheet">

    </head>
     <t:menu>
    <body>
<t:header> </t:header>
        <!-- Begin page -->
   <div class="wrapper" style="margin-left:-170px;" id="idModalRegistra">

	<div class="content-page">
                <div class="content">

                  
                    <!-- Start Content-->
                    <div class="container-fluid">
                        
                        <!-- start page title -->
                        <div class="row">
                            <div class="col-12">
                                <div class="page-title-box">
                                    
                                    <h4 class="page-title">REGISTRA DNA</h4>
                                     <hr>
                                </div>
                            </div>
                        </div>     
                        <!-- end page title --> 




                            <div class="row">
                            <div class="col-12">
                                <div class="card">
                                    <div class="card-body">
                                        <h4 class="header-title mb-3">DNA</h4>
                                     

                                        <form action="registraDNA" method="post" class="needs-validation" novalidate>
                                        	<input type="hidden" name="codigo" id="id_codigo" >
                                            <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip01" for="nombrePromotor">Nombres</label>
                                                <input type="text" class="form-control" id="id_nombre" name="nombre" placeholder="Nombres" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Nombre.
                                                </div>
                                            </div>
                                            
                                             <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip01" for="documentoDna">Documento</label>
                                                <input type="text" class="form-control" id="id_documento" name="documento" placeholder="Documentos" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Documento.
                                                </div>
                                            </div>
                                            
                                             <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip01" for="direccionDna">Direcci�n</label>
                                                <input type="text" class="form-control" id="id_direccion" name="direccion" placeholder="Direcci�n" required>
                                                
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese una Direcci�n.
                                                </div>
                                            </div>
					    
					   						<div class="col-md-6"  style="margin-left: -15px;">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted" >Departamento</p>
                                       		<select id="comboDepartamento" name="departamento" class="form-control select" data-toggle="select">
                                                    <option>Seleccione </option>
                                                </select>
                                            </div>
					 						 <div class="col-md-6"  style="margin-left: -15px;">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted" >Provincia</p>
                                       		<select id="comboProvincia" name="provincia" class="form-control select" data-toggle="select">
                                                    <option>Seleccione</option>
                                                </select>
                                            </div>


					 					  <div class="col-md-6"  style="margin-left: -15px;">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted" >Distrito</p>
                                       		<select id="comboDistrito" name="distrito" class="form-control select" data-toggle="select">
                                                    <option>Seleccione Distrito</option>
                                                </select>
                                            </div><br>
                                            
                                            
                                            <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip03" for="telefonoDna">Tel�fono</label>
                                                <input type="text" class="form-control" id="id_telefono" name="telefono" placeholder="Tel�fono" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese una Tel�fono.
                                                </div>
                                            </div>
                                            
                                              <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip03" for="diaDna">D�as</label>
                                                <input type="text" class="form-control" id="id_dias" name="dia" placeholder="D�as" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un D�a.
                                                </div>
                                            </div>
                                            
                                              <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip03" for="ambienteDna">N� Ambiente</label>
                                                <input type="text" class="form-control" id="id_ambiente" name="ambiente" placeholder="Ambiente" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Ambiente.
                                                </div>
                                            </div>
                                            
                                              <div class="form-group position-relative mb-3">
                                                <label for="validationTooltip03" for="ambientePrivDna">Ambiente Privado</label>
                                                <input type="text" class="form-control" id="id_ambientePriv" name="ambientePriv" placeholder="Ambiente Privado" required>
                                               
                                                <div class="invalid-tooltip">
                                                    Por favor ingrese un Ambiente Privado.
                                                </div>
                                            </div>
                                            


					 							 <div class="col-md-6" style="margin-left: -15px;">
                                                <p class="mb-1 mt-3 font-weight-bold text-muted">Promotor </p>
                                       		<select id="comboPromotor" class="form-control select" name="promotor" data-toggle="select">
                                                    <option>Seleccione </option>
                                                    
                                                </select>
                                            </div>
	<br>

                                           <button class="btn btn-primary" type="submit" style="background-color: rgba(56,102,147,0.94);" ><img src="<c:url value="/resources/img/116-user-plus.png"/>">&nbsp REGISTRAR</button>
                                       
                                        </form>
                                        
                                    </div> <!-- end card-body-->
                                </div> <!-- end card-->
                            </div> <!-- end col-->
                   </div>


       
              
</div></div></div></div>
            <!-- ============================================================== -->
            <!-- End Page content -->
            <!-- ============================================================== -->



        <!-- App js -->
        <script src="<c:url value="/resources/js/app.min.js"/>"></script>
<t:footer></t:footer>
    </body>
  </t:menu>

 <script type="text/javascript">

$(document).ready( function(){
	
	$.getJSON("listaPromotor",{}, function (data){
		console.log(data);
		
		$.each(data.dataProm, function(index, item){
			
			$("#comboPromotor").append("<option value="+item.codigoPromotor+">"+ item.nombrePromotor +"</option>");
			
		});
		
	});


	///////////////////////
	$("#comboDepartamento").change(function(e){
		//valor del combo
		cod=$(this).val();
		//limpiar el combo tipo
		$("#comboProvincia").empty();
		$.ajax({
			url:'listaProvinciaXDep',
			type:'POST',
			data:{codigo:cod},
			success:function(response){
				$.each(response.dataTipos,function(index,item){
					//validar
					if(codigoTipo==item.codDistrito)
						$("#id_tipo").append("<option value='"+
								item.codDistrito+"' selected>"+
							item.nomDistrito+"</option>");
					else
						$("#id_tipo").append("<option value='"+
								item.codDistrito+"'>"+
							item.nomDistrito+"</option>");
					
					
				})
				
			}
		})
	});
	
	
	$("#comboProvincia").change(function(e){
		//valor del combo
		cod=$(this).val();
		//limpiar el combo tipo
		$("#comboDistrito").empty();
		$.ajax({
			url:'listaDistXProv',
			type:'POST',
			data:{codigo:cod},
			success:function(response){
				$.each(response.dataTipos,function(index,item){
					//validar
					if(codigoTipo==item.codDistrito)
						$("#id_tipo").append("<option value='"+
								item.codDistrito+"' selected>"+
							item.nomDistrito+"</option>");
					else
						$("#id_tipo").append("<option value='"+
								item.codDistrito+"'>"+
							item.nomDistrito+"</option>");
					
					
				})
				
			}
		})
	});
	
	////////////////////////////////////////////////////////
	
});
</script>
  
<script type="text/javascript">
var varInicio = function() {
	//-- carga el combo de sede
	$.getJSON("listaDepartamentos",{}, function (data){
		$.each(data.dataDepartamentos, function(index, item){
			$("#comboDepartamento").append("<option value="+ item.idDepartamento +">"+ item.nombreDepartamento +"</option>");
		});
	});
	
}

var varProvincia = function(){
	//--Se obtiene el Departamento seleccionada
	var sel = $(this).val();
	console.log("Departamento seleccionado : " + sel);
	
	//-- limpiar de opciones el combo cancha
	$("#comboProvincia").empty();
	
	//-- le agregamos una opcion vacia
	$("#comboProvincia").append("<option value=' '>[Seleccione]</option>");
	
	//-- carga el combo de cancha  
	$.getJSON("listaProvincias",{idDepartamento:sel}, function (data){
		
		$.each(data.dataProvincias, function(index, item){
	
			$("#comboProvincia").append("<option value="+item.idProvincia+">"+ item.nombreProvincia +"</option>");
			
		});
	});
	
}

//-- genera el evento onChange
$("#comboDepartamento").change(varProvincia);
$(document).ready(varInicio);

</script>  

<script type="text/javascript">
var varInicioD = function() {
	//-- carga el combo de sede  
	$.getJSON("listaProvincias",{}, function (data){
		$.each(data.dataProvincias, function(index, item){
			$("#comboProvincia").append("<option value="+ item.idProvincia +">"+ item.nombreProvincia +"</option>");
		});
	});
}

var varDistrito = function(){
	//--Se obtiene el Departamento seleccionada
	var sel = $(this).val();
	console.log("Provincia seleccionada : " + sel);
	
	//-- limpiar de opciones el combo cancha
	$("#comboDistrito").empty();
	
	//-- le agregamos una opcion vacia
	$("#comboDistrito").append("<option value=' '>[Seleccione]</option>");
	
	//-- carga el combo de cancha  
	$.getJSON("listaDistritos",{idProvincia:sel}, function (data){
		
		$.each(data.dataDistritos, function(index, item){
	
			$("#comboDistrito").append("<option value="+item.idDistrito+">"+ item.nombreDistrito +"</option>");
			
		});
	});
	
}

//-- genera el evento onChange
$("#comboProvincia").change(varDistrito);
$(document).ready(varInicioD);

</script>  
  
  
  
 <script type="text/javascript">
 function registrar(){	
		$('#idModalRegistra').modal("show");
	}
 </script> 
</html>
