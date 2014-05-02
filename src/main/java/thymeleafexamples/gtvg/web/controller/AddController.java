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

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import thymeleafexamples.gtvg.business.entities.Product;
import thymeleafexamples.gtvg.business.services.ProductService;
import thymeleafexamples.gtvg.business.services.VendorService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class AddController implements IGTVGController {
	
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Product> products1 = new ArrayList<Product>();
	private ArrayList<Product> products2 = new ArrayList<Product>();
	private ArrayList<Product> products3 = new ArrayList<Product>();
	private ArrayList<Product> products4 = new ArrayList<Product>();
  
	
    public AddController() {
        super();
    }
    
    
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            final ServletContext servletContext, final TemplateEngine templateEngine) 
    		throws Exception {
    	WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        final Integer prodId = Integer.valueOf(request.getParameter("prodId"));
        
        VendorService vendorService1=new VendorService();
        ProductService productService1=new ProductService();
        
        products = vendorService1.findById(1).getProducts();
        products1 = vendorService1.findById(2).getProducts();
        products2 = vendorService1.findById(3).getProducts();
        products3 = vendorService1.findById(4).getProducts();
        products4=vendorService1.findById(5).getProducts();
        
        for(Product product:products)
        {
        	if(product.getId() == prodId){
        		ctx.setVariable("product", product);
        	}
        	       	
        	
        }
        for(Product product1:products1)
        	{
        	if(product1.getId() == prodId){
        		ctx.setVariable("product", product1);
        	}
        	}
        
        for(Product product2:products2)
    	{
        	if(product2.getId() == prodId){
        		ctx.setVariable("product", product2);
        	}
    	}
        
        for(Product product3:products3)
    	{
        	if(product3.getId() == prodId){
        		ctx.setVariable("product", product3);
        	}
    	}
        
        for(Product product4:products4)
    	{
        	if(product4.getId() == prodId){
        		ctx.setVariable("product", product4);
        	}
    	}
                
        templateEngine.process("Checkout", ctx, response.getWriter());
        
    }

}
