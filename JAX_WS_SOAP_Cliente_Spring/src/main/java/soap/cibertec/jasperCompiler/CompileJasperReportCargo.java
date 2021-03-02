package soap.cibertec.jasperCompiler;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileJasperReportCargo {

	public static void main(String[] args) {
		System.out.println("Compiling the jasper xml");
		
		CompileJasperReportCargo compileReport = new CompileJasperReportCargo();
		compileReport.compileTheJasperXml();
		
		System.out.println("Compilation done");
	}

	private void compileTheJasperXml() {
		// TODO Auto-generated method stub
		String jasperXmlFile = getClass().getClassLoader()
										 .getResource("reports/RCargo.jrxml")
										 .getFile();
						try {
						JasperCompileManager.compileReportToFile(jasperXmlFile);
						} catch (JRException e) {
						e.printStackTrace();
						}
	}
	
}
