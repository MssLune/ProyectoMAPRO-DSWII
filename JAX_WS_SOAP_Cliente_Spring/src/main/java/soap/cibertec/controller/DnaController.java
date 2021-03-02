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
import soap.cibertec.interfaces.Dna;
import soap.cibertec.interfaces.Genero;
import soap.cibertec.interfaces.Grado;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.interfaces.Provincia;
import soap.cibertec.servicio.DnaService;

@Controller
@RequestMapping("/dna")
public class DnaController {

	private DnaService soap = null;
	
	private DnaController() {
		soap=new DnaService();
	}
	
	@RequestMapping(value="/")
	public String inicio() {
		return "ListDNA";
	}
	
	@RequestMapping(value="/listDNAJsp")
	public String jspLista() {
		return "Registrar DNA";
	}
	
	@RequestMapping(value="/crudDNAjsp")
	public String jspCrud() {
		return "CrudDna";
	}
	
	@RequestMapping(value="/listaDNAJsp")
	public String jspListaDna() {
		return "ListDNA";
	}
	
	@RequestMapping(value="/listPromotorJsp")
	public String jspListaProm() {
		return "Registrar Promotor";
	}
	
	@RequestMapping(value="/crudPromotorjsp")
	public String jspCrudProm() {
		return "CrudPromotor";
	}
	
	@RequestMapping(value="/listPromotorjsp")
	public String jspList() {
		return "redirect:/promotor/";
	}
	
	@RequestMapping(value="/loginjsp")
	public String loginjsp() {
		return "redirect:/login/";
	}
	@RequestMapping(value="/boletajsp")
	public String boletajsp() {
		return "redirect:/boleta/";
	}
/*
 * 	
	@RequestMapping(value="listaDNA")
	public @ResponseBody Map<String, Object> listaDNA(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDNA", soap.buscarDNA());
		return map;
	 *
	}*/
	
	@RequestMapping(value="listaDNA")
	public @ResponseBody Map<String, Object> listaDNA(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDNA", soap.buscarDNA());
		return map;
	}
	
	
	@RequestMapping(value="/buscarDNA")
	public @ResponseBody Map<String, Object> buscarDNA(
							@RequestParam("codigo") int cod){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataBuscar",soap.buscarDNA());
		return map;
	}
	
	@RequestMapping(value="listaDNAXDepartamento")
	public String listaPromotorXDepartamento(@RequestParam("codigo") int codigo){
		Map<String, Object> map=new HashMap<String,Object>();
		
		if(codigo==-1) {
			map.put("dataDnaxD", soap.listaDna());
		}
		else {
		map.put("dataDnaxD", soap.listDnaXDepartamento(codigo));}
		return "ListDNA";
	}
	
	@RequestMapping(value="listaDepartamentos")
	public @ResponseBody Map<String, Object> listaDepartamentos(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataDepartamentos", soap.listaDepartamentos());
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
	
	@RequestMapping(value="listaPromotor")
	public @ResponseBody Map<String, Object> listaPromotor(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataProm", soap.listaPromotor());
		return map;
	}
	
	//FUNCIONAL - REGISTRO
	
		@RequestMapping(value="/registraDNA")
		public 	String registraDNA(
				@RequestParam("nombre") String nom,
				@RequestParam("documento") String docu,
				@RequestParam("direccion") String dire,
				@RequestParam("departamento") int de,
				@RequestParam("provincia") int pro,
				@RequestParam("distrito") int dis,
				@RequestParam("telefono") int telef,
				@RequestParam("dia") int dia,
				@RequestParam("ambiente") int ambi,
				@RequestParam("ambientePriv") int ambPrix,
				@RequestParam("promotor") int prom
				){
			
				try {
					Dna bean = new Dna();
					bean.setNombreDna(nom);
					bean.setDocumentoDna(docu);
					bean.setDireccionDna(dire);
					Departamento beanP = new Departamento();
					beanP.setIdDepartamento(de);
					bean.setDepartamento(beanP);
					
					Provincia beanPr = new Provincia();
					beanPr.setIdProvincia(pro);
					bean.setProvincia(beanPr);
					
					Distrito beanD = new Distrito();
					beanD.setIdDistrito(dis);
					bean.setDistrito(beanD);
					
					bean.setTelefonoDna(telef);
					bean.setDiasDna(dia);
					bean.setAmbienteDna(ambi);
					bean.setAmbienteprivDna(ambPrix);					
					
					Promotor beanProm = new Promotor();
					beanProm.setCodigoPromotor(prom);
					bean.setPromotor(beanProm);
					//bean.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fec));
					
					
					soap.saveDna(bean);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			
			
				return "CrudDna";
			
		}
		
	
	
	
		@RequestMapping(value="/actualizarDna")
		public 	String actualizarDna(
				@RequestParam("codigo") int cod,
				@RequestParam("nombre") String nom,
				@RequestParam("documento") String docu,
				@RequestParam("direccion") String dire,
				@RequestParam("departamento") int de,
				@RequestParam("provincia") int pro,
				@RequestParam("distrito") int dis,
				@RequestParam("telefono") int telef,
				@RequestParam("dias") int dia,
				@RequestParam("ambiente") int ambi,
				@RequestParam("ambientePriv") int ambPrix,
				@RequestParam("promotor") int prom
				){
			
			try {
				Dna bean = new Dna();
				bean.setCodigoDna(cod);
				bean.setNombreDna(nom);
				bean.setDocumentoDna(docu);
				bean.setDireccionDna(dire);
				
				Departamento beanP = new Departamento();
				beanP.setIdDepartamento(de);
				bean.setDepartamento(beanP);
				
				Provincia beanPr = new Provincia();
				beanPr.setIdProvincia(pro);
				bean.setProvincia(beanPr);
				
				Distrito beanD = new Distrito();
				beanD.setIdDistrito(dis);
				bean.setDistrito(beanD);
				
				bean.setTelefonoDna(telef);
				bean.setDiasDna(dia);
				bean.setAmbienteDna(ambi);
				bean.setAmbienteprivDna(ambPrix);					
				
				Promotor beanProm = new Promotor();
				beanProm.setCodigoPromotor(prom);
				bean.setPromotor(beanProm);
				//bean.setFecha(new SimpleDateFormat("yyyy-MM-dd").parse(fec));
				
				
				soap.updateDna(bean);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
			return "CrudDna";
		
	}
	
	
		
		@RequestMapping(value="borrarDna")
		public String //@ResponseBody Map<String, Object> 
		borrarDna(@RequestParam("codigo") int codigoDna){
			Map<String, Object> map=new HashMap<String,Object>();
			try {
				Dna bean = new Dna();
				bean.setCodigoDna(codigoDna);
				soap.deleteDna(codigoDna);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return "CrudDna";
		}
		
		@RequestMapping(value="deleteDna")
		public @ResponseBody Map<String, Object> 
		deleteDna(@RequestParam("codigo") int cod){
			Map<String, Object> map=new HashMap<String,Object>();
			try {
				soap.deleteDna(cod);
				map.put("dataMensaje", 1);
			} catch (Exception e) {
				map.put("dataMensaje", -1);
				e.printStackTrace();
			}
			return map;
		}
		
		
		@RequestMapping(value="updateDna")
		public @ResponseBody Map<String, Object> 
		updateDna(@RequestBody Dna bean){
			Map<String, Object> map=new HashMap<String,Object>();
			try {
				soap.updateDna(bean);
				map.put("dataMensaje", 1);
			} catch (Exception e) {
				map.put("dataMensaje", -1);
				e.printStackTrace();
			}
			return map;
		}
	
	
	
	
	
	
	
}
