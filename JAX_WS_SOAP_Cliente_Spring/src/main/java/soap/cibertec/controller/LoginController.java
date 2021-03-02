package soap.cibertec.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import soap.cibertec.interfaces.Cargo;
import soap.cibertec.interfaces.Usuario;
import soap.cibertec.servicio.UsuarioService;
@Controller
@RequestMapping("/login")
public class LoginController {
	private UsuarioService soap=null;
	
	public LoginController() {
		soap=new UsuarioService();
	}
	
	@RequestMapping(value="/")
	public String inicio() {
		return "Login";
	}
	
	
	
	@RequestMapping(value="listarUsuario")
	public @ResponseBody Map<String, Object> listarUsuario(){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUsu", soap.listaUsuario());
		return map;
	}
	
	
	@RequestMapping(value="/Inicio")
	public String jspCrud() {
		return "Inicio";
	}
	
	///////////////////////////////////////////////////////

	@RequestMapping(value="listaLogUsuario")
	public @ResponseBody Map<String, Object> listaLogUsuario(@RequestParam("codigo") String codigo){
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("dataListaUXLog", soap.listaLogUsuario(codigo));
		return map;
	}
	///////////////////////////////////////////////////////////
	@RequestMapping(value="logUsuario")
	public String logUsuario(HttpSession session,@RequestParam("usuario") String usuario,@RequestParam("password") String password) throws soap.cibertec.servicio.Exception{
		String id = usuario;
		String pas = password;
		//@ResponseBody Map<String, Object>
		Usuario bean=new Usuario();
		bean.setIdUsuario(id);
		bean.setPasswordUsuario(pas);
		bean.setNombreUsuario("");
		String m="";
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("login", soap.login(bean));
		try {
			session.setAttribute("objUsuario", bean);
			
			if(soap.login(bean)==null){
				
				return m="redirect:/login/";
				
			} 
			else{
				
				return m="redirect:/login/";
				 
				}

		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return m;
		
	}
	
	//OTRO LOGIN
	@RequestMapping(value="logUsuarioId")
	public String logUsuarioId(HttpSession session,@RequestParam("usuario") String usuario,@RequestParam("password") String password) throws soap.cibertec.servicio.Exception{
		//String id = usuario;
		//String pas = password;
		//@ResponseBody Map<String, Object>
		//Usuario bean=new Usuario();
		//bean.setIdUsuario(id);
		//bean.setPasswordUsuario(pas);
		//bean.setNombreUsuario("");
		String m="";
		Map<String, Object> map=new HashMap<String,Object>();
		map.put("loginId", soap.loginId(usuario, password));
		try {
			
			
			if(soap.loginId(usuario,password)==null){
				
				return m="redirect:/login/";
				
			} 
			else{
				String nombreCompleto = null;
				Map<String, Object> map1=new HashMap<String,Object>();
				Usuario bean=new Usuario();
				//bean.setIdUsuario(usuario);
				//map1.put("loginI", soap.login(bean));	
				if(bean.getIdUsuario()==usuario) 
				nombreCompleto = bean.getNombreCompleto();
				session.setAttribute("objUsuario", nombreCompleto);
				
				if(soap.loginId(usuario, password).getCargo().getIdCargo() == 1)
					return m="redirect:/usuario/";
				else 
					return m="redirect:/promotor/";
				
				}

		
	} catch (Exception e) {
		e.printStackTrace();
	}
		return m;
		
	}
	
	
	
	
}




