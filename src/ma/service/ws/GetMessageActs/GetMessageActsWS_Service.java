
package ma.service.ws.GetMessageActs;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;

import ma.service.exploit.SafeEchangeExploitWs;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebServiceClient(name = "GetMessageActsWS", targetNamespace = "http://***************", wsdlLocation = "https://***************/getMessageActs?WSDL")
public class GetMessageActsWS_Service
    extends Service
{

    private final static URL GETMESSAGEACTSWS_WSDL_LOCATION;
    private final static WebServiceException GETMESSAGEACTSWS_EXCEPTION;
    private final static QName GETMESSAGEACTSWS_QNAME = new QName("http://***************", "GetMessageActsWS");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = SafeEchangeExploitWs.makeConnection("https://***************/getMessageActs?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        GETMESSAGEACTSWS_WSDL_LOCATION = url;
        GETMESSAGEACTSWS_EXCEPTION = e;
    }

    public GetMessageActsWS_Service() {
        super(__getWsdlLocation(), GETMESSAGEACTSWS_QNAME);
    }

    public GetMessageActsWS_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    /**
     * 
     * @return
     *     returns GetMessageActsWS
     */
    @WebEndpoint(name = "GetMessageActsWSImplPort")
    public GetMessageActsWS getGetMessageActsWSImplPort() {
        return super.getPort(new QName("http://***************", "GetMessageActsWSImplPort"), GetMessageActsWS.class);
    }

    private static URL __getWsdlLocation() {
        if (GETMESSAGEACTSWS_EXCEPTION!= null) {
            throw GETMESSAGEACTSWS_EXCEPTION;
        }
        return GETMESSAGEACTSWS_WSDL_LOCATION;
    }

}
