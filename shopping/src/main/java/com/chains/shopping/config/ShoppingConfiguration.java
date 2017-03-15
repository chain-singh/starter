/**
 * 
 */
package com.chains.shopping.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Chain
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.chains.shopping")
public class ShoppingConfiguration {

}
