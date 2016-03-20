/**
 * 
 */
package com.web.services.soap.impl;

import javax.jws.WebService;

import com.web.services.soap.UserService;

/**
 * @author mitul
 *
 */
@WebService(endpointInterface="com.web.services.soap.UserService")
public class UserServiceImpl implements UserService {

	/* (non-Javadoc)
	 * @see com.web.services.soap.UserService#getUserByUserId(java.lang.String)
	 */
	@Override
	public String getUserByUserId(String userId) {
		if("rbonigi".equalsIgnoreCase(userId))
			return "Ramesh Bonigi";
		return "Invalid User";
	}

}
