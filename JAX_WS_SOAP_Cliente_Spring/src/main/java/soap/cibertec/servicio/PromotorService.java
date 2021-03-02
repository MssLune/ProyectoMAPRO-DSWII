package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.BoletaBean;
import soap.cibertec.interfaces.Departamento;
import soap.cibertec.interfaces.DetalleBoletaBean;
import soap.cibertec.interfaces.Distrito;
import soap.cibertec.interfaces.Dna;
import soap.cibertec.interfaces.Genero;
import soap.cibertec.interfaces.Grado;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.interfaces.PromotorOrigin;
import soap.cibertec.interfaces.Provincia;

public class PromotorService {
	private WsImplementadoService ws=null;

	public List<Promotor> listaPromotorXDepartamento(int idDep){
		List<Promotor> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaPromotorPorDepartamento(idDep);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	
	public List<Promotor> buscarPromotor(){
		List<Promotor> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.buscarPromotor();
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	
	
	public List<Promotor> listaPromotores(){
		List<Promotor> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaPromotor();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<PromotorOrigin> listaPromotorOrigin(){
		List<PromotorOrigin> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaPromotorOrigin();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Grado> listaGrado(){
		List<Grado> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaGrado();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Genero> listaGenero(){
		List<Genero> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaGenero();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Distrito> listaDistrito(){
		List<Distrito> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaDistrito();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public List<Provincia> listaProvincia(){
		List<Provincia> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaProvincia();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	
	
	
	public List<Departamento> listaDepartamento(){
		List<Departamento> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaDepartamento();
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	public int savePromotor(Promotor bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			estado=servi.insertaPromotor(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int updatePromotor(Promotor bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			estado=servi.actualizaPromotor(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int deletePromotor(int codigo) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio ser=ws.getServicioProyectoPort();
			estado=ser.eliminaPromotor(codigo);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	
	public List<Provincia> listProvinciaXDepartamento(int codigo){
		List<Provincia> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaProvinciaPorDepartamento(codigo);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	//Lista Distrito por Provincia
	public List<Distrito> listDistritoXProvincia(int codigo){
		List<Distrito> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaDistritoPorProvincia(codigo);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}	
	
	//Listado de Promtor por caracteres
	public List<Promotor> listaPromotorCaracteres(String filtro){
		List<Promotor> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaPromotorPorCaracteres(filtro);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return lista;
	}
	
	public int saveBoleta(BoletaBean bean, List<DetalleBoletaBean> obj) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			estado=servi.inserta(bean, obj);

		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}

	
}






