<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>">
<link rel="shortcut icon" href="<c:url value="https://fonts.googleapis.com/css?family=Roboto|Varela+Round"/>">


<title>Iniciar Sesión</title>
<link rel="stylesheet" href="<c:url value="/resources/css/text.css"/>">

<link rel="stylesheet" href="<c:url value="/resources/css/icon.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/font-awesome.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>">
<link rel="stylesheet" href="<c:url value="/resources/css/txtcrud.css"/>">

 <script type="text/javascript" src="<c:url value="/resources/js/jquery.min.js" />"></script>
  <script type="text/javascript" src="<c:url value="/resources/bootstrap.min.js" />"></script>

</head>

<body style="background-image:url('../resources/img/dif.png');" >

<!-- Modal HTML -->

<div id="myModal" class="modal show" data-toggle="modal" >
 				
	<div id="editEmployeeModal" class="modal-dialog modal-login ">
		<div class="modal-content">
			
			<div class="modal-header">
					<c:if test="${requestScope.mensaje != null}">
               		<div class="alert alert-danger fade in" id="success-alert">
				        <a href="#" class="close" data-dismiss="alert">&times;</a>
				        <strong>${requestScope.mensaje}</strong>
				    </div>
				    </c:if>	
				<h4 class="modal-title">Iniciar sesión</h4>
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
			</div>
			<div class="modal-body">
				
				<form action="logUsuarioId" method="post" class="login-form" id="idFormLogin">
				
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"></span>
							<input type="text" class="form-control" name="usuario" id="id_usuario"  placeholder="Usuario" required="required">
						</div>
					</div>
					<div class="form-group">
						<div class="input-group">
							<span class="input-group-addon"></i></span>
							<input type="password" class="form-control" name="password" id="id_password" placeholder="Contraseña" required="required">
						</div>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-primary btn-block btn-lg" style="background-color: rgba(56,102,147,0.94);border-radius:8px;">Iniciar sesión</button>
					</div>
					
				</form>
				
			</div>
			
		</div>
	</div>
</div> 



<script type="text/javascript">
/*$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
    $("#success-alert").slideUp(500);
});*/

$(document).ready(function(){
	/*$('.open-modal').ready(function(){
		$('#editEmployeeModal').modal('show');
		
	});
	$('#myModal').modal({backdrop: 'static', keyboard: false});
	*/
	
});

function log(usuario,password){	
	
	$('input[id=id_usuario]').val(usuario);
	$('input[id=id_password]').val(password);
	$('#idFormLogin').submit();
}

</script>   



<script type="text/javascript">


$(document).ready(function() {
    $('#myModal').bootstrapValidator({
        message: 'This value is not valid',
        feedbackIcons: {
            valid: 'glyphicon glyphicon-ok',
            invalid: 'glyphicon glyphicon-remove',
            validating: 'glyphicon glyphicon-refresh'
        },
        fields: {
        	usuario: {
                validators: {
                    notEmpty: {
                        message: 'El usuario es un campo obligatorio'
                    }
                }
            },
                password: {
                    notEmpty: {
                        message: 'El password es un campo obligatorio'
                    }
                }
            
        }   
    });

});
</script>
 
</body>
</html>