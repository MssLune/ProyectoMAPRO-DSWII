package soap.cibertec.jasperView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import soap.cibertec.interfaces.Promotor;
import soap.cibertec.servicio.PromotorService;

public class PDFReportPromotorView {
	private String url;
	private PromotorService soap;
	
	public PDFReportPromotorView() {
		soap = new PromotorService();
	}
	
	public PDFReportPromotorView(String url) {
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
	
	public List<Promotor> getJRBeanCollectionDataSource() {
		
		List<Promotor> lstPrmotor = soap.listaPromotores();
		return lstPrmotor;
		
	}
}
