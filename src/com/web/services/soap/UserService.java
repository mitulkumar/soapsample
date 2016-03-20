/**
 * 
 */
package com.web.services.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author mitul
 *
 */
@WebService
@SOAPBinding(style=Style.RPC)
public interface UserService {
	@WebMethod
	String getUserByUserId(String userId);

}
