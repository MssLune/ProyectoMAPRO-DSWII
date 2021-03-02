
package soap.cibertec.servicio;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://interfaces.cibertec.soap/")
public class Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private soap.cibertec.interfaces.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception(String message, soap.cibertec.interfaces.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception(String message, soap.cibertec.interfaces.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: soap.cibertec.interfaces.Exception
     */
    public soap.cibertec.interfaces.Exception getFaultInfo() {
        return faultInfo;
    }

}
