package soap.cibertec.jasperView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import soap.cibertec.interfaces.Dna;
import soap.cibertec.servicio.DnaService;

public class PDFReportDnaView {
	private String url;
	private DnaService soap;
	
	public PDFReportDnaView() {
		soap = new DnaService();
	}
	
	public PDFReportDnaView(String url) {
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
	
	public List<Dna> getJRBeanCollectionDataSource() {
		
		List<Dna> lstDna = soap.listaDna();
		return lstDna;
		
	}
	
}
