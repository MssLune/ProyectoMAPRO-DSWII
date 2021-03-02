package soap.cibertec.controller;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import soap.cibertec.interfaces.Cargo;
import soap.cibertec.interfaces.Usuario;
import soap.cibertec.jasperView.PDFReportCargoView;
import soap.cibertec.jasperView.PDFReportDnaView;
import soap.cibertec.jasperView.PDFReportPromotorView;
import soap.cibertec.jasperView.PDFReportUsuarioView;
import soap.cibertec.servicio.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {
	
	private UsuarioService soap=null;
	/** REPORTE I */
	@Autowired
	private ServletContext servletContext;
	@Autowired
	private PDFReportCargoView report;
	@Autowired
	private PDFReportUsuarioView reportUsuarioView;
	@Autowired
	private PDFReportPromotorView reportPromotorView;
	@Autowired
	private PDFReportDnaView reportDnaView;
	/** REPORTE F */
	public UsuarioController() {
		soap = new UsuarioService();
	}
	/** URL'S */
	
	@RequestMapping(value="/")
	public String inicio() {
		return "ListCargo";
	}	
	@RequestMapping(value="/loginjsp")
	public String loginjsp() {
		return "redirect:/login/";
	}	
	@RequestMapping(value="/listUsuariojsp")
	public String jspListaUsu() {
		return "ListUsuario";
	}
	@RequestMapping(value="/listCargojsp")
	public String jspListaCargo() {
		return "ListCargo";
	}
	@RequestMapping(value="/crudCargojsp")
	public String jspCrudCargo() {
		return "CrudCargo";
	}
	@RequestMapping(value="/crudUsuariojsp")
	public String jspCrudUsuario() {
		return "CrudUsuario";
	}
	@RequestMapping(value = "/reporteCargo")
	public String jspReporteCargo() {
		return "ReporteCargo";
	}
	@RequestMapping(value = "/reporteUsuario")
	public String jspReporteUsuario() {
		return "ReporteUsuario";
	}
	@RequestMapping(value = "/reportePromotor")
	public String reportePromotor() {
		return "ReportePromotor";
	}
	@RequestMapping(value = "/reporteDna")
	public String jspreporteDna() {
		return "ReporteDNA";
	}
	
	
	/*** CRUD DE CARGO INICIO ***/
	@RequestMapping(value="listarCargo")
	public @ResponseBody Map<String, Object> listarCargo(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataLista", soap.listaCargo());
		return map;
	}
	@RequestMapping(value="listaCargoXCaracter")
	public @ResponseBody Map<String, Object> listaCargoXCaracter(@RequestParam("cadena") String cadena){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataLXCaracteres", soap.listaCargoXCaracter(cadena));
		return map;
	}
	@RequestMapping(value="saveCargo")
	public @ResponseBody Map<String, Object> 
	saveCargo(@RequestBody Cargo bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.saveCargo(bean);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}
	@RequestMapping(value="updateCargoobj")
	public @ResponseBody Map<String, Object> 
	updateCargo(@RequestBody Cargo bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.updateCargo(bean);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}
	
	@RequestMapping(value="/updateCargo")
	public 	String updateCargo(
			@RequestParam("codigo_car") int cod,			//1
			@RequestParam("nombre_car") String nom			//2
			
			){
		try {
			Cargo bean = new Cargo();
			bean.setIdCargo(cod);
			bean.setNombreCargo(nom);	
			soap.updateCargo(bean);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/usuario/";
		
		
	}
	
	@RequestMapping(value="deleteCargo")
	public @ResponseBody Map<String, Object> 
	deleteCargo(@RequestParam("codigo") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.deleteCargo(cod);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}	
	
	@RequestMapping(value="/registraCargo")
	public 	String registraCargo(
			@RequestParam("id_cargo") String cargo
			){
		try {		
			Cargo bean = new Cargo();
			bean.setNombreCargo(cargo);			
			soap.saveCargo(bean);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/usuario/";
	}
	/*** CRUD DE CARGO FIN ***/
	
	/*** CRUD DE USUARIO INICIO ***/
	@RequestMapping(value="listarUsuario")
	public @ResponseBody Map<String, Object> listarUsuario(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUsu", soap.listaUsuario());
		return map;
	}
	@RequestMapping(value="listarUsuarioXCaracter")
	public @ResponseBody Map<String, Object> listarUsuarioXCaracter(@RequestParam("letra") String letra){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUXCarac", soap.listaCargoXCaracter(letra));
		return map;
	}
	@RequestMapping(value="listarXCargo")
	public @ResponseBody Map<String, Object> listarXCargo(@RequestParam("codigo") int codigo){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUXCargo", soap.listaXCargo(codigo));
		return map;
	}
	@RequestMapping(value="listaLogUsuario")
	public @ResponseBody Map<String, Object> listaLogUsuario(@RequestParam("codigo") String codigo){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUXLog", soap.listaLogUsuario(codigo));
		return map;
	}
	@RequestMapping(value="saveUsuario")
	public @ResponseBody Map<String, Object> 
	saveUsuario(@RequestBody Usuario bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.saveUsuario(bean);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}
	@RequestMapping(value="updateUsuariobjbj")
	public @ResponseBody Map<String, Object> 
	updateUsuario(@RequestBody Usuario bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.updateUsuario(bean);
			map.put("dataUpdate", 1);
		} catch (Exception e) {
			map.put("dataUpdate", -1);
			e.printStackTrace();
		}
		return map;
	}
	@RequestMapping(value="deleteUsuario")
	public @ResponseBody Map<String, Object> 
	deleteUsuario(@RequestParam("codigo") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.deleteUsuario(cod);
			map.put("dataEliminar", 1);
		} catch (Exception e) {
			map.put("dataEliminar", -1);
			e.printStackTrace();
		}
		return map;
	}	
	/*** CRUD DE USUARIO FIN ***/
	@RequestMapping(value="/registraUsuario")
	public 	String registraPromotor(
			@RequestParam("nombre") String nom,
			@RequestParam("apellido") String ap,
			@RequestParam("usuario") String usu,
			@RequestParam("contrasena") String pas,
			@RequestParam("correo") String cor,
			@RequestParam("fecha") String fec,
			@RequestParam("cargo") int car
			){
		try {
			Usuario bean = new Usuario();
			bean.setNombreUsuario(nom);
			bean.setApellidoUsuario(ap);
			bean.setIdUsuario(usu);
			bean.setPasswordUsuario(pas);
			bean.setCorreoUsuario(cor);
			bean.setFechaUsuario(fec);
			
			Cargo c = new Cargo();
			c.setIdCargo(car);
			bean.setCargo(c);			
			soap.saveUsuario(bean);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/usuario/";
	}
	
	
	@RequestMapping(value="/updateUsuario")
	public 	String update(
			@RequestParam("codigo_ac") int cod,			//1
			@RequestParam("nombre_ac") String nom,		//2
			@RequestParam("apellido_ac") String ap,		//3
			@RequestParam("id_ac") String usu,			//4
			@RequestParam("password_ac") String pas,	//5
			@RequestParam("correo_ac") String cor,		//6
			@RequestParam("fecha_ac") String fec,		//7
			@RequestParam("cargo_ac") int car			//8
			){
		try {
			Usuario bean = new Usuario();
			bean.setCodigoUsuario(cod);
			bean.setNombreUsuario(nom);
			bean.setApellidoUsuario(ap);
			bean.setIdUsuario(usu);
			bean.setPasswordUsuario(pas);
			bean.setCorreoUsuario(cor);
			bean.setFechaUsuario(fec);
			
			Cargo c = new Cargo();
			c.setIdCargo(car);
			bean.setCargo(c);			
			soap.updateUsuario(bean);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "redirect:/usuario/";		
	}
	
	/** REPORTE CARGO 
	 * @return 
	 * @return 
	 * @throws IOException */

	@RequestMapping(value = "viewReportPdf")
	public void viewReportPdf(HttpServletRequest request, HttpServletResponse response) {
		OutputStream ouputStream = null;
		String fileName = servletContext.getRealPath(report.getUrl());
		String sourceFileName = fileName;
		
		try {
			ouputStream = response.getOutputStream();
			JasperReport jasreport = (JasperReport)JRLoader.loadObject(new File(sourceFileName));
			JRDataSource source = new JRBeanCollectionDataSource(report.getJRBeanCollectionDataSource());
			
			JasperPrint print = JasperFillManager.fillReport(jasreport, null, source);
			
			JasperExportManager.exportReportToPdfStream(print, ouputStream);
		} catch (JRException jre) {
			// TODO: handle exception
			jre.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		finally {
			if(ouputStream != null) {
				try {
					ouputStream.flush();
					ouputStream.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	@RequestMapping(value = "viewReportPdfUsuario")
	public void viewReportPdfUsuario(HttpServletRequest request, HttpServletResponse response) {
		OutputStream ouputStream = null;
		String fileName = servletContext.getRealPath(reportUsuarioView.getUrl());
		String sourceFileName = fileName;
		
		try {
			ouputStream = response.getOutputStream();
			JasperReport jasreport = (JasperReport)JRLoader.loadObject(new File(sourceFileName));
			JRDataSource source = new JRBeanCollectionDataSource(reportUsuarioView.getJRBeanCollectionDataSource());
			
			JasperPrint print = JasperFillManager.fillReport(jasreport, null, source);
			
			JasperExportManager.exportReportToPdfStream(print, ouputStream);
		} catch (JRException jre) {
			// TODO: handle exception
			jre.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		finally {
			if(ouputStream != null) {
				try {
					ouputStream.flush();
					ouputStream.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	@RequestMapping(value = "viewReportPdfPromotor")
	public void viewReportPdfPromotor(HttpServletRequest request, HttpServletResponse response) {
		OutputStream ouputStream = null;
		String fileName = servletContext.getRealPath(reportPromotorView.getUrl());
		String sourceFileName = fileName;
		
		try {
			ouputStream = response.getOutputStream();
			JasperReport jasreport = (JasperReport)JRLoader.loadObject(new File(sourceFileName));
			JRDataSource source = new JRBeanCollectionDataSource(reportPromotorView.getJRBeanCollectionDataSource());
			
			JasperPrint print = JasperFillManager.fillReport(jasreport, null, source);
			
			JasperExportManager.exportReportToPdfStream(print, ouputStream);
		} catch (JRException jre) {
			// TODO: handle exception
			jre.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		finally {
			if(ouputStream != null) {
				try {
					ouputStream.flush();
					ouputStream.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
	
	@RequestMapping(value = "viewReportPdfDna")
	public void viewReportPdfDna(HttpServletRequest request, HttpServletResponse response) {
		OutputStream ouputStream = null;
		String fileName = servletContext.getRealPath(reportDnaView.getUrl());
		String sourceFileName = fileName;
		
		try {
			ouputStream = response.getOutputStream();
			JasperReport jasreport = (JasperReport)JRLoader.loadObject(new File(sourceFileName));
			JRDataSource source = new JRBeanCollectionDataSource(reportDnaView.getJRBeanCollectionDataSource());
			
			JasperPrint print = JasperFillManager.fillReport(jasreport, null, source);
			
			JasperExportManager.exportReportToPdfStream(print, ouputStream);
		} catch (JRException jre) {
			// TODO: handle exception
			jre.printStackTrace();
		} catch (IOException ioe) {
			// TODO: handle exception
			ioe.printStackTrace();
		}
		finally {
			if(ouputStream != null) {
				try {
					ouputStream.flush();
					ouputStream.close();
				} catch (IOException e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
			}
		}
	}
	
}
