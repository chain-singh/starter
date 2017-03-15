/**
 * 
 */
package com.chains.shopping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chain
 *
 */
@RestController
public class LoginController {

	@RequestMapping(value = "/login")
	public String index() {
		return "Hello World!";
	}
}
