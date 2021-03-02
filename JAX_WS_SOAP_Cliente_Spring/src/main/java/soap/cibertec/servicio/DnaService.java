package soap.cibertec.servicio;

import java.util.List;

import soap.cibertec.interfaces.Departamento;
import soap.cibertec.interfaces.Distrito;
import soap.cibertec.interfaces.Dna;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.interfaces.Provincia;

public class DnaService {

	private WsImplementadoService ws=null;
	
	//Listado de DNA
		public List<Dna> listaDna(){
			List<Dna> lista=null;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				lista=servi.listaDna();
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return lista;
		}
		
		
		public List<Dna> buscarDNA(){
			List<Dna> lista=null;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				lista=servi.buscarDNA();
			} catch (ExceptionInInitializerError e) {
				// TODO: handle exception
				e.printStackTrace();
				
			}		
			return lista;
		}
		
		//Listado de Promotor
		public List<Promotor> listaPromotor(){
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
		//Grabar DNA
		public int saveDna(Dna bean) {
			int estado=-1;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				estado=servi.insertaDna(bean);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return estado;
		}
		//Actualizar DNA
		public int updateDna(Dna bean) {
			int estado=-1;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				estado=servi.actualizaDna(bean);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return estado;
		}
		//Eliminar DNA
		public int deleteDna(int codigo) {
			int estado=-1;
			try {
				ws=new WsImplementadoService();
				Servicio ser=ws.getServicioProyectoPort();
				estado=ser.eliminaDna(codigo);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return estado;
		}
		/*//Buscar DNA
		public Dna findDna(int codigo) {
			Dna bean=null;
			try {
				ws=new WsImplementadoService();
				Servicio ser=ws.getServicioProyectoPort();
				bean=ser."-----"(codigo);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return bean;
			
		}*/
		
		/*Consulta*/
		
		//Departamento
		public List<Dna> listDnaXDepartamento(int departamento){
			List<Dna> lista=null;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				lista=servi.listaDnaPorDepartamento(departamento);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return lista;
		}
		
		//Promotor
		public List<Dna> listDnaXPromotor(int promotor){
			List<Dna> lista=null;
			try {
				ws=new WsImplementadoService();
				Servicio servi=ws.getServicioProyectoPort();
				lista=servi.listaDnaPorPromotor(promotor);
			} catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			return lista;
		}	
		
		/*Combos*/
		
		//Listado de Departamento
			public List<Departamento> listaDepartamentos(){
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
			//Listado de Provincia
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
			//Listado de Distrito
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
			
			/*Anidados*/
			
			//Lista Provincia por Departamento
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
			
			
			//Listado de Dna por caracteres
			public List<Dna> listaDnaCaracteres(int letra){
				List<Dna> lista=null;
				try {
					ws=new WsImplementadoService();
					Servicio servi=ws.getServicioProyectoPort();
					lista=servi.listaDnaPorCaracteres(letra);
				} catch (ExceptionInInitializerError e) {
					e.printStackTrace();
				}
				return lista;
			}



}