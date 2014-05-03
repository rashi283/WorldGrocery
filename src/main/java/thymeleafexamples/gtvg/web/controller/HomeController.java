/*
 * =============================================================================
 * 
 *   Copyright (c) 2011, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package thymeleafexamples.gtvg.web.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.Calendar;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import thymeleafexamples.gtvg.business.services.CustomerService;
import thymeleafexamples.gtvg.business.entities.Customer;

public class HomeController implements IGTVGController {

    
    public HomeController() {
        super();
    }
    
    
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final TemplateEngine templateEngine) 
            throws Exception {
        
    	final String username = String.valueOf(request.getParameter("username"));
    	final String password = String.valueOf(request.getParameter("password"));
    	String tempString = "John";
    	
    	CustomerService customerService = new CustomerService();
    	ArrayList<Customer> tempCustomers = (ArrayList<Customer>) customerService.findAll();

    	WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
    	
    	for (Customer cust : tempCustomers)
    	{
    		if(cust.getUsername() == username && cust.getPassword() == password)
    		{
    			ctx.setVariable("username",cust.getUsername());
    			System.out.println("xyzabc: " + cust.getUsername());
    		}	
    		else
    			ctx.setVariable("username", tempString);
    	}	
    	
        
        ctx.setVariable("today", Calendar.getInstance());
        
        templateEngine.process("home", ctx, response.getWriter());
        
    }

}
