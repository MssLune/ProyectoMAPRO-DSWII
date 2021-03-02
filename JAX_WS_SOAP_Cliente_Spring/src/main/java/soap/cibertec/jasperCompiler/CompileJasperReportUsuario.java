package soap.cibertec.jasperCompiler;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;

public class CompileJasperReportUsuario {

	public static void main(String[] args) {
		System.out.println("Compiling the jasper xml");
		
		CompileJasperReportUsuario compileReport = new CompileJasperReportUsuario();
		compileReport.compileTheJasperXml();
		
		System.out.println("Compilation done");
	}

	
	private void compileTheJasperXml() {
		// TODO Auto-generated method stub
		String jasperXmlFile = getClass().getClassLoader()
										 .getResource("reports/reportUsuario.jrxml")
										 .getFile();
						try {
						JasperCompileManager.compileReportToFile(jasperXmlFile);
						} catch (JRException e) {
						e.printStackTrace();
						}
	}
	
}
