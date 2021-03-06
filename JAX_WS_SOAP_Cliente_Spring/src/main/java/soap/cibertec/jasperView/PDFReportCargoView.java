package soap.cibertec.jasperView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import soap.cibertec.interfaces.Cargo;
import soap.cibertec.servicio.UsuarioService;

public class PDFReportCargoView {
	private String url;
	private UsuarioService soap;
	
	public PDFReportCargoView() {
		soap = new UsuarioService();
	}
	
	public PDFReportCargoView(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}

	public Map<String, Object> generateParameterMap(){
		Map<String, Object> parameterMap = new HashMap<String, Object>();
		
		JRBeanCollectionDataSource jrBeanCollectionDataSource = new JRBeanCollectionDataSource(getJRBeanCollectionDataSource());		
		parameterMap.put("datasource", jrBeanCollectionDataSource);
		
		return parameterMap;
	}
	
	public List<Cargo> getJRBeanCollectionDataSource() {
		
		List<Cargo> lstCargo = soap.listaCargo();
		return lstCargo;
		
	}
}
