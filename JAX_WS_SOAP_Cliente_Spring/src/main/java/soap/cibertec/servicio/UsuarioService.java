package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.Cargo;
import soap.cibertec.interfaces.Usuario;

public class UsuarioService {

	private WsImplementadoService ws = null;
	
	/*** CRUD DE CARGO INICIO ***/
	public List<Cargo> listaCargo(){
		List<Cargo> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaCargos();
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	public List<Cargo> listaCargoXCaracter(String cadena){
		List<Cargo> lista = null;
		try {
			ws = new WsImplementadoService();
			Servicio servi = ws.getServicioProyectoPort();
			lista = servi.listaXCaracter(cadena);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista;
	}
	public int saveCargo(Cargo bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			estado=servi.insertaCargo(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int updateCargo(Cargo bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio ser=ws.getServicioProyectoPort();
			estado=ser.actualizaCargo(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}	
	public int deleteCargo(int codigo) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio ser=ws.getServicioProyectoPort();
			estado=ser.eliminaCargo(codigo);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	/*** CRUD DE CARGO FIN ***/
	
	/*** REPORTE CARGO INICIO ***/
	public List<Cargo> listaCargoReporte(){
		List<Cargo> lista = null;
		try {
			ws = new WsImplementadoService();
			Servicio servicio = ws.getServicioProyectoPort();
			lista = servicio.listaCargo();
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista;
	}
	/*** REPORTE CARGO FIN ***/
	
	/*** CRUD DE USUARIO INICIO ***/
	public List<Usuario> listaUsuario(){
		List<Usuario> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaUsuario();
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	public List<Usuario> listaUsuarioXCaracter(String letra){
		List<Usuario> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaUsuarioPorCaracteres(letra);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	public List<Usuario> listaXCargo(int idCargo){
		List<Usuario> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaUsuarioPorCargo(idCargo);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	public int saveUsuario(Usuario bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			estado=servi.insertaUsuario(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	public int updateUsuario(Usuario bean) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio ser=ws.getServicioProyectoPort();
			estado=ser.actualizaUsuario(bean);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}	
	public int deleteUsuario(int codigo) {
		int estado=-1;
		try {
			ws=new WsImplementadoService();
			Servicio ser=ws.getServicioProyectoPort();
			estado=ser.eliminaUsuario(codigo);
		} catch (ExceptionInInitializerError e) {
			e.printStackTrace();
		}
		return estado;
	}
	
	public Usuario login(Usuario bean) throws Exception{
		Usuario u=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			u=servi.login(bean);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return u;
	}
	
	public Usuario loginId(String id, String pass) throws Exception{
		Usuario u=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			u=servi.loginId(id, pass);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return u;
	}
	
	
	/*** POR EVALUAR ***/
	public List<Usuario> listaLogUsuario(String cod){
		List<Usuario> lista=null;
		try {
			ws=new WsImplementadoService();
			Servicio servi=ws.getServicioProyectoPort();
			lista=servi.listaLogUsuario(cod);
		} catch (ExceptionInInitializerError e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}		
		return lista;
	}
	/*** CRUD DE USUARIO FIN ***/
}
