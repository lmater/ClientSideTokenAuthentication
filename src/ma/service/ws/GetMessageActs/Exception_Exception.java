
package ma.service.ws.GetMessageActs;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebFault(name = "Exception", targetNamespace = "http://*******************")
public class Exception_Exception
    extends java.lang.Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private ma.service.ws.GetMessageActs.Exception faultInfo;

    /**
     * 
     * @param faultInfo
     * @param message
     */
    public Exception_Exception(String message, ma.service.ws.GetMessageActs.Exception faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param faultInfo
     * @param cause
     * @param message
     */
    public Exception_Exception(String message, ma.service.ws.GetMessageActs.Exception faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: ma.safedemat.products.security.safeexchange.service.ws.Exception
     */
    public ma.service.ws.GetMessageActs.Exception getFaultInfo() {
        return faultInfo;
    }

}
