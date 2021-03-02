package soap.cibertec.controller;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import soap.cibertec.interfaces.BoletaBean;
import soap.cibertec.interfaces.Date;
import soap.cibertec.interfaces.Departamento;
import soap.cibertec.interfaces.DetalleBoletaBean;
import soap.cibertec.interfaces.Distrito;
import soap.cibertec.interfaces.Dna;
import soap.cibertec.interfaces.Genero;
import soap.cibertec.interfaces.Grado;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.interfaces.Provincia;
import soap.cibertec.servicio.DnaService;
import soap.cibertec.servicio.PromotorService;
@Controller
@RequestMapping("/boleta")
public class BoletaController {
	private PromotorService soap=null;
	private DnaService soapd=null;
	private List<Dna> boleta = null;
	int[] codigos=null;
	int i;
	int b;

	public BoletaController() {
		soap=new PromotorService();
		soapd= new DnaService();
		i=0;
		b=0;
		codigos= new int[10];
		boleta= new ArrayList<Dna>();
	}
	
	@RequestMapping(value="/")
	public String inicio() {
		return "RegistrarBoleta";
	}
	@RequestMapping(value="/listaDNAJsp")
	public String jspListaDna() {
		return "redirect:/dna/";
	}
	@RequestMapping(value="/loginjsp")
	public String loginjsp() {
		return "redirect:/login/";
	}
	
	@RequestMapping(value="/boletajsp")
	public String boletajsp() {
		return "redirect:/boleta/";
	}
	@RequestMapping(value="/listPromotorjsp")
	public String jspListaProm() {
		return "redirect:/promotor/";
	}
	
	@RequestMapping(value="seleccioneD")
	private void seleccioneD(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("codigo");
		String nom = request.getParameter("dna");
		
		String dna = id +":" + nom;
		
		HttpSession session = request.getSession();
		session.setAttribute("datoPromotor", dna);
		
		request.getRequestDispatcher("/RegistrarBoleta.jsp").forward(request, response);	
	}
	
	@RequestMapping(value="seleccioneP")
	private void seleccioneP(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String id = request.getParameter("codigo");
		String nom = request.getParameter("nom");
		String ape = request.getParameter("ape");
		
		String cliente = id +":" + nom+ " " + ape;
		
		HttpSession session = request.getSession();
		session.setAttribute("datoCliente", cliente);
		
		request.getRequestDispatcher("/RegistrarBoleta").forward(request, response);	
	}
	
	/*
	@RequestMapping(value="seleccioneD")
	public @ResponseBody Map<String, Object> seleccioneD(@RequestParam("codigo") String cod,
			@RequestParam("nom") String nom,
			@RequestParam("ape") String ap){
		
		String id = cod;
		String nomb = nom;
		String ape = ap;
		
		String cliente = id +":" + nomb+ " " + ape;
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("datoDNA", cliente);
		return map;
	}*/
	
	///////////////////////////////////////////////////////
	@RequestMapping(value="/buscaPromotor")
	public @ResponseBody Map<String, Object>  buscaPromotor(@RequestParam("txt_nom") String nm) {
		
		String filtro = nm;
		
		if(filtro == null) filtro ="";
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("clientes",soap.listaPromotorCaracteres(filtro));
		return map;
	}
	
	@RequestMapping(value="/listaPromotor")
	public @ResponseBody Map<String, Object>  listaPromotor() {
		
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("clientesx",soap.listaPromotores());
		return map;
	}
	
	@RequestMapping(value="/listaDna")
	public @ResponseBody Map<String, Object>  listaDna() {
		
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dnax",soapd.listaDna());
		return map;
	}
	
	@RequestMapping(value="/buscarDNAProm")
	public @ResponseBody Map<String, Object> buscarDNAProm(
							@RequestParam("cod") int cod){
		//String co = dna;
		//cod= 
		//if(filtro == null) filtro ="";
		
		
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dnas",soapd.listDnaXPromotor(cod));
		return map;
	}
	///////////////////////////////////////////////////////////


	//FUNCIONAL - REGISTRO
	
	@RequestMapping(value="/ingresa")
	public 	void ingresa(@RequestParam("cod") int cod, HttpServletRequest request){
		String nom="";
		ArrayList<Dna> boleta;
		
		//Se verifica si existe en sesion
		HttpSession session = request.getSession();
		if(session.getAttribute("boleta") == null){
			boleta = new ArrayList<Dna>();
		}else{
			boleta = (ArrayList<Dna>)session.getAttribute("boleta");
		}
		
		//Se crear el objeto
				Dna p = new Dna();
				p.setCodigoDna(cod);
				p.setNombreDna(nom);
				p.setPrecio("70");
				
				boolean noExiste = true;
				//se verifica los repetidos
				for (int i = 0; i < boleta.size(); i++) {
					if(boleta.get(i).getCodigoDna() == cod){
						boleta.set(i, p);
						noExiste = false;
						break;
					}
				}
				
				//Si no existe se agrega
				if(noExiste){
					boleta.add(p);
				}
				session.setAttribute("boleta", boleta);
		
	}
	
	//public void addi()
	
	
	//CARGAR DNA SEGUN EL CODIGO DE DNA
	@RequestMapping(value="/ingresa2")
	public @ResponseBody Map<String, Object> ingresa2 (@RequestParam("cod") int cod){
		//Se verifica si existe en sesion

		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dnasx",soapd.listaDnaCaracteres(cod));
		b=cod;
		codigos[i]=b;
		i++;
		Dna p = new Dna();
		p.setCodigoDna(cod);
		p.setNombreDna("");
		p.setPrecio("70");
		boleta.add(p);
		return map;
		
	}
	
	
	//
	
	@RequestMapping(value="/registra")
	public 	String registraPromotor(
			@RequestParam("nombre_prom") int prom,
			@RequestParam("nombre_dna") int dna
			){
		//list = new ArrayList<Dna>();
			try {
				
				//dna = 
				
				BoletaBean bean = new BoletaBean();
				bean.setIdUsuario(1);
				bean.setIdCliente(prom);
				
				
				List<DetalleBoletaBean> detalles = new ArrayList<DetalleBoletaBean>();
				for (Dna x: boleta) {
					DetalleBoletaBean det = new DetalleBoletaBean();
					det.setIdDNA(x.getCodigoDna());
					det.setPrecio(70);
					detalles.add(det);
					i++;
				}
				
				soap.saveBoleta(bean, detalles);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		
		return "RegistrarBoleta";
		
	}
	
	
	
	
	@RequestMapping(value="elimina")
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
		return "RegistrarBoleta";
	}
	
	
}




