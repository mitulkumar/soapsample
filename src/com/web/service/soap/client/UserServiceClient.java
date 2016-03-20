/**
 * 
 */
package com.web.service.soap.client;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.web.services.soap.UserService;

/**
 * @author mitul
 *
 */
public class UserServiceClient {

	/**
	 * 
	 */
	public UserServiceClient() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws MalformedURLException 
	 */
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://localhost:9999/ws/user?wsdl");
		
        QName qname = new QName("http://impl.soap.services.web.com/", "UserServiceImplService");

        Service service = Service.create(url, qname);

        UserService user = service.getPort(UserService.class);
        System.out.println(user.getUserByUserId("rbonigi"));
	}

}
