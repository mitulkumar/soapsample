/**
 * 
 */
package com.web.services.soap.publisher;

import javax.xml.ws.Endpoint;

import com.web.services.soap.impl.UserServiceImpl;

/**
 * @author mitul
 *
 */
public class UserServicePublisher {

	/**
	 * @param arg
	 */
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9999/ws/user", new UserServiceImpl());
	}

}
