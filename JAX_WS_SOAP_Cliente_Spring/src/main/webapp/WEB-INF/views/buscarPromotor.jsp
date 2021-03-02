<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar Promotor</title>
</head>
<body>

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

<tbody>
 
<tr>		
 <td>
 
</td>
 </tr>

 </tbody> 
 </table>
 <script type="text/javascript">
function listaPromotores(){
	var tablaPromotor="",filaTabla="";
	$.getJSON("listaPromotorOrigin",{},function(response){
				$.each(response.dataPromotor,function(index,item){
					
					console.log("Codigos a ver : "+item.departamento);
					console.log("Codigos a chequear : "+item.odistrito.idDistrito);	
					
					var selec='<a href="#seleccionarProm" class="select" onclick="seleccionar('+item.codigoPromotor+","+
					"'"+item.nombrePromotor+"',"+
					"'"+item.apellidoPromotor');"><i class="flaticon-rubbish-bin-delete-button" data-toggle="tooltip" title="Eliminar">&#xE872;</i></a>';
	                   
				  
				   filaTabla+="<tr><td>"+item.codigoPromotor+
					"</td><td>"+item.nombrePromotor+"</td><td>"+
						item.apellidoPromotor+"</td><td>"+
						item.direccionPromotor+"</td><td>"+
						item.dniPromotor+"</td><td>"+
						item.telefonoPromotor+"</td><td>"+
						item.emailPromotor+"</td><td>";					
				});
			$("#tablaPromotor tbody").append(filaTabla);
	});
}

function seleccionar(codigo,nom,ape){	
	$('input[id=id_elimina]').val(codigo);
	$('#idFormElimina').submit();
}
</script>  
 </body>
 </html>
 

 