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

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import thymeleafexamples.gtvg.business.entities.Product;
import thymeleafexamples.gtvg.business.services.VendorService;

public class AvailabilityController implements IGTVGController {
	
	private Map<Integer,ArrayList<Product>> m = new HashMap<Integer,ArrayList<Product>>();
	private ArrayList<String> availablestore=new ArrayList<String>();
	static int s=0;
    public AvailabilityController() {
        super();
    }
    
    VendorService vendorService1=new VendorService();
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            
            final ServletContext servletContext, final TemplateEngine templateEngine) 
            throws Exception {
    	
    	final String prodValue = String.valueOf(request.getParameter("product"));
    	WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        //ctx.setVariable("product_name",prodValue);
        
      
       
        if(s==1)
        	availablestore.clear();
        
        method1(prodValue);
        
        ctx.setVariable("storeName", availablestore);
        templateEngine.process("availability", ctx, response.getWriter());
        System.out.println("value is" + prodValue);
    }
        public void method1(String prodValue)
        { 
        for(int i=1;i<6;i++)
        {
         m.put(i,vendorService1.findById(i).getProducts());	
        
         for(Product product:m.get(i))
         {
        	 if(product.getName().equalsIgnoreCase(prodValue))
        	 {
        		 availablestore.add(vendorService1.findById(i).getName());
        		 
        	 }
        		 
         }
        s=1;
        }
        }
       
    }


