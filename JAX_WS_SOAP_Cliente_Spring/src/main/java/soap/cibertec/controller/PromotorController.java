package soap.cibertec.controller;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import soap.cibertec.interfaces.Departamento;
import soap.cibertec.interfaces.Distrito;
import soap.cibertec.interfaces.Genero;
import soap.cibertec.interfaces.Grado;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.interfaces.Provincia;
import soap.cibertec.servicio.PromotorService;
@Controller
@RequestMapping("/promotor")
public class PromotorController {
	private PromotorService soap=null;
	
	public PromotorController() {
		soap=new PromotorService();
	}
	
	@RequestMapping(value="/")
	public String inicio() {
		return "ListPromotor";
	}
	@RequestMapping(value="/loginjsp")
	public String loginjsp() {
		return "redirect:/login/";
	}
	@RequestMapping(value="/listPromotorJsp")
	public String jspLista() {
		return "Registrar Promotor";
	}
	
	@RequestMapping(value="/crudPromotorjsp")
	public String jspCrud() {
		return "CrudPromotor";
	}
	
	@RequestMapping(value="/listPromotorjsp")
	public String jspList() {
		return "ListPromotor";
	}
	
	@RequestMapping(value="/listDNAJsp")
	public String jspRegistraaDna() {
		return "Registrar DNA";
	}
	
	@RequestMapping(value="/crudDNAjsp")
	public String jspCrudDna() {
		return "CrudDna";
	}
	
	@RequestMapping(value="/listaDNAJsp")
	public String jspListaDna() {
		return "redirect:/dna/";
	}
	
	@RequestMapping(value="/boletajsp")
	public String boletajsp() {
		return "redirect:/boleta/";
	}
	
	
	@RequestMapping(value="listaPromotor")
	public @ResponseBody Map<String, Object> listaPromotor(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataPromotor", soap.buscarPromotor());
		return map;
	}
	
	@RequestMapping(value="listaPromotorOrigin")
	public @ResponseBody Map<String, Object> listaPromotorOrigin(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataPromotor", soap.listaPromotorOrigin());
		return map;
	}
	
	///////////////////////////////////////////////////////
	@RequestMapping(value="/buscarPromotor")
	public @ResponseBody Map<String, Object> buscarPromotor(
							@RequestParam("codigo") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataBuscar",soap.buscarPromotor());
		return map;
	}
	///////////////////////////////////////////////////////////
	
	@RequestMapping(value="listaPromotorXDepartamento")
	public String listaPromotorXDepartamento(@RequestParam("codigo") int codigo){
		Map<String, Object> map=new HashMap<String,Object>();
		
		if(codigo==-1) {
			map.put("dataPromDep", soap.listaPromotores());
		}
		else {
		map.put("dataPromDep", soap.listaPromotorXDepartamento(codigo));}
		return "ListPromotor";
	}
	
	
	
	//DEPARTAMENTO
	
	@RequestMapping(value="listaDepartamentos")
	public @ResponseBody Map<String, Object> listaDepartamentos(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDepartamentos", soap.listaDepartamento());
		return map;
	}
	
	
	
	
	//PROVINCIA
	@RequestMapping(value="listaProvincias")
	public @ResponseBody Map<String, Object> listaProvincias(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataProvincias", soap.listaProvincia());
		return map;
	}
	
	//DISTRITO
	@RequestMapping(value="listaDistritos")
	public @ResponseBody Map<String, Object> listaDistritos(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDistritos", soap.listaDistrito());
		return map;
	}
	
	//GENERO
	@RequestMapping(value="listaGeneros")
	public @ResponseBody Map<String, Object> listaGeneros(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataGeneros", soap.listaGenero());
		return map;
	}
	
	//GRADO
	@RequestMapping(value="listaGrados")
	public @ResponseBody Map<String, Object> listaGrados(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataGrados", soap.listaGrado());
		return map;
	}
	
	@RequestMapping(value="/listaProvinciaXDep")
	public @ResponseBody Map<String, Object> listaProvinciaXDep(
							@RequestParam("codigo") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataProXDep",soap.listProvinciaXDepartamento(cod));
		return map;
	}
	
	@RequestMapping(value="/listaDistXProv")
	public @ResponseBody Map<String, Object> listaDistXProv(
							@RequestParam("codigoDis") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDistXProv",soap.listDistritoXProvincia(cod));
		return map;
	}
	
	
	@RequestMapping(value="savePromotor")
	public String
			savePromotor(@RequestBody Promotor bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.savePromotor(bean);	
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return "CrudPromotor";
	}
	
	//FUNCIONAL - REGISTRO
	
	@RequestMapping(value="/registraPromotor")
	public 	String registraPromotor(
			@RequestParam("nombre") String nom,
			@RequestParam("apellido") String ap,
			@RequestParam("departamento") int de,
			@RequestParam("provincia") int pro,
			@RequestParam("distrito") int dis,
			@RequestParam("direccion") String dir,
			@RequestParam("dni") int dni,
			@RequestParam("genero") int ge,
			@RequestParam("telefono") int tel,
			@RequestParam("email") String em,
			@RequestParam("grado") int g
			){
		
			try {
				Promotor bean = new Promotor();
				bean.setNombrePromotor(nom);
				bean.setApellidoPromotor(ap);
				Departamento beanP = new Departamento();
				beanP.setIdDepartamento(de);
				bean.setDepartamento(beanP);
				
				Provincia beanPr = new Provincia();
				beanPr.setIdProvincia(pro);
				bean.setProvincia(beanPr);
				
				Distrito beanD = new Distrito();
				beanD.setIdDistrito(dis);
				bean.setDistrito(beanD);
				
				bean.setDireccionPromotor(dir);
				bean.setDniPromotor(dni);
				

				Genero beanGene = new Genero();
				beanGene.setIdGenero(ge);
				bean.setGenero(beanGene);
				bean.setTelefonoPromotor(tel);
				bean.setEmailPromotor(em);
				
				Grado beanGr = new Grado();
				beanGr.setIdGrado(g);
				bean.setGrado(beanGr);
				//bean.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fec));
				
				
				soap.savePromotor(bean);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
			return "CrudPromotor";
		
	}
	

	@RequestMapping(value="/actualizaPromotor")
	public 	String actualizaPromotor(
			@RequestParam("codigo") int cod,
			@RequestParam("nombre") String nom,
			@RequestParam("apellido") String ap,
			@RequestParam("departamento") int de,
			@RequestParam("provincia") int pro,
			@RequestParam("distrito") int dis,
			@RequestParam("direccion") String dir,
			@RequestParam("dni") int dni,
			@RequestParam("genero") int ge,
			@RequestParam("telefono") int tel,
			@RequestParam("email") String em,
			@RequestParam("grado") int g
			){
		
			try {
				Promotor bean = new Promotor();
				bean.setCodigoPromotor(cod);
				bean.setNombrePromotor(nom);
				bean.setApellidoPromotor(ap);
				Departamento beanP = new Departamento();
				beanP.setIdDepartamento(de);
				bean.setDepartamento(beanP);
				
				Provincia beanPr = new Provincia();
				beanPr.setIdProvincia(pro);
				bean.setProvincia(beanPr);
				
				Distrito beanD = new Distrito();
				beanD.setIdDistrito(dis);
				bean.setDistrito(beanD);
				
				bean.setDireccionPromotor(dir);
				bean.setDniPromotor(dni);
				

				Genero beanGene = new Genero();
				beanGene.setIdGenero(ge);
				bean.setGenero(beanGene);
				bean.setTelefonoPromotor(tel);
				bean.setEmailPromotor(em);
				
				Grado beanGr = new Grado();
				beanGr.setIdGrado(g);
				bean.setGrado(beanGr);
				//bean.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fec));
				
				
				soap.updatePromotor(bean);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		return "CrudPromotor";
		
	}
	
	
	
	
	@RequestMapping(value="borrarPromotor")
	public String //@ResponseBody Map<String, Object> 
	borrarPromotor(@RequestParam("codigo") int codigoPromotor){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			Promotor bean = new Promotor();
			bean.setCodigoPromotor(codigoPromotor);
			soap.deletePromotor(codigoPromotor);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return "CrudPromotor";
	}
	
	
	
	
	
	@RequestMapping(value="deletePromotor")
	public @ResponseBody Map<String, Object> 
	deletePromotor(@RequestParam("PromotorCod") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.deletePromotor(cod);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}
	
	
	@RequestMapping(value="updatePromotor")
	public @ResponseBody Map<String, Object> 
			updatePromotor(@RequestBody Promotor bean){
		Map<String, Object> map=new HashMap<String,Object>();
		try {
			soap.updatePromotor(bean);
			map.put("dataMensaje", 1);
		} catch (Exception e) {
			map.put("dataMensaje", -1);
			e.printStackTrace();
		}
		return map;
	}
	

	
	
	
	
}




