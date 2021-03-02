
function buscarClienteBoleta() {
    nom=$('#txt_nom').attr('value');
    $.ajax({
    	url: 'boleta',
    	type : "GET",
    	data : "metodo=buscaProm&nom="+nom,
    	success: function(datos){
    		$("#tablaCliente").html(datos);
    	}
    });
}

function buscarPromotorBoleta(){
	nom=$('#dna').attr('value');
	$.ajax({
    	url: '/boleta',
    	type : "GET",
    	data : "tipo=buscaDNA&nom="+nom,
    	success: function(datos){
    		$("#tablaPromotor").html(datos);
    	}
    });
}

