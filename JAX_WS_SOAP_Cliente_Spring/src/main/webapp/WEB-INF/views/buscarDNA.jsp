<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Buscar DNA</title>
</head>
<body>

<table class="bordered2" width="100%" border="2">

 <tr style="font:bold">
<td style="width:80px">ID</td>
 <td style="width:95px">NOMBRE</td>
 <td style="width:95px">DOCUMENTO</td>
 <td style="width:70px">DIRECCION</td>
 <td style="width:120px">DEPARTAMENTO</td>
<td style="width:120px">PROMOTOR</td>
 <td style="width:20px"></td>
 </tr>

<tbody>
 <c:forEach  var="x" items="${requestScope.dnas}">
<tr>
						<td>${x.codigoDna }</td>
                		<td>${x.nombreDna }</td>
                		<td>${x.documentoDna }</td>
                		<td>${x.direccionDna }</td>
                		<td>${x.departamento.nombreDepartamento }</td>
                		<td>${x.promotor.nombrePromotor }</td>
 <td>
 <a href="boleta?metodo=seleccioneD&codigo=${x.codigoDna }&dna=${x.nombreDna }">
...</a></td>
 </tr>
</c:forEach> 
 </tbody> 
 </table>

 </body>
 </html>