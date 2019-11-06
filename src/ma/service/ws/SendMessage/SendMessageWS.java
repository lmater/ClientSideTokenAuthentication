package ma.service.ws.SendMessage;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.0
 * 
 */
@WebService(name = "SendMessageWS", targetNamespace = "http://***************/")
public interface SendMessageWS {

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg5
	 * @param arg4
	 * @param arg1
	 * @param arg0
	 * @param arg7
	 * @param arg6
	 * @param arg8
	 * @return returns byte[]
	 * @throws Exception_Exception
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "sendMessageAct", targetNamespace = "http://***************/", className = "***************.SendMessageAct")
	@ResponseWrapper(localName = "sendMessageActResponse", targetNamespace = "http://***************/", className = "***************.SendMessageActResponse")
	public byte[] sendMessageAct(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") List<String> arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6,
			// @WebParam(name = "arg7", targetNamespace = "")
			ma.service.ws.SendMessage.SendMessageAct.Arg7 arg7,
			@WebParam(name = "arg8", targetNamespace = "") String arg8)
			throws Exception_Exception;

	/**
	 * 
	 * @param arg3
	 * @param arg2
	 * @param arg5
	 * @param arg4
	 * @param arg1
	 * @param arg0
	 * @param arg7
	 * @param arg6
	 * @param arg8
	 * @return returns java.lang.String
	 * @throws Exception_Exception
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "sendMessageCode", targetNamespace = "http://***************/", className = "***************.SendMessageCode")
	@ResponseWrapper(localName = "sendMessageCodeResponse", targetNamespace = "http://***************/", className = "***************.SendMessageCodeResponse")
	public String sendMessageCode(
			@WebParam(name = "arg0", targetNamespace = "") String arg0,
			@WebParam(name = "arg1", targetNamespace = "") List<String> arg1,
			@WebParam(name = "arg2", targetNamespace = "") int arg2,
			@WebParam(name = "arg3", targetNamespace = "") String arg3,
			@WebParam(name = "arg4", targetNamespace = "") String arg4,
			@WebParam(name = "arg5", targetNamespace = "") String arg5,
			@WebParam(name = "arg6", targetNamespace = "") String arg6,
			@WebParam(name = "arg7", targetNamespace = "") ma.service.ws.SendMessage.SendMessageCode.Arg7 arg7,
			@WebParam(name = "arg8", targetNamespace = "") String arg8)
			throws Exception_Exception;

}
