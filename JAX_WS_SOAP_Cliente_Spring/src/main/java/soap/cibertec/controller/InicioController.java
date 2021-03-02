package soap.cibertec.controller;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import soap.cibertec.interfaces.Usuario;
import soap.cibertec.servicio.UsuarioService;
@Controller
@RequestMapping("/inicio")
public class InicioController {
	private UsuarioService soap=null;
	
	public InicioController() {
		soap=new UsuarioService();
	}
	
	@RequestMapping(value="/")
	public String inicio() {
		return "Menu";
	}
	
	
	
	
}




