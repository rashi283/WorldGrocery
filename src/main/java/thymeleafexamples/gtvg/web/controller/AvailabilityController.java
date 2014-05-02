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
	private ArrayList<Product> products = new ArrayList<Product>();
	private ArrayList<Product> products1 = new ArrayList<Product>();
	private ArrayList<Product> products2 = new ArrayList<Product>();
	private ArrayList<Product> products3 = new ArrayList<Product>();
	private ArrayList<Product> products4 = new ArrayList<Product>();
	//private Map<Integer,ArrayList<Product>> m = new HashMap<Integer,ArrayList<Product>>();
	//private String[] availablestore=new String[8];
	//private ArrayList<Product> products1 = new ArrayList<Product>();
	//private ArrayList<Product> products2 = new ArrayList<Product>();
   // static String productValue;
    public AvailabilityController() {
        super();
    }
    
    
    public void process(
            final HttpServletRequest request, final HttpServletResponse response,
            
            final ServletContext servletContext, final TemplateEngine templateEngine) 
            throws Exception {
    	
    	final String prodValue = String.valueOf(request.getParameter("product"));
    	WebContext ctx = new WebContext(request, response, servletContext, request.getLocale());
        //ctx.setVariable("product_name",prodValue);
        VendorService vendorService1=new VendorService();
        products = vendorService1.findById(1).getProducts();
        products1 = vendorService1.findById(2).getProducts();
        products2 = vendorService1.findById(3).getProducts();
        products3 = vendorService1.findById(4).getProducts();
        products4=vendorService1.findById(5).getProducts();
        for(Product product:products)
    	{
    		//System.out.println("\n"+product.getName());
    		if(product.getName().equalsIgnoreCase(prodValue))
    		{
    		
    			//System.out.println("hhhhhhh");
    			//availablestore[0]=vendorService1.findById(1).getName();
    			ctx.setVariable("storeName1", vendorService1.findById(1).getName());
    		}
    	}
        for(Product product:products1)
    	{
    		//System.out.println("\n"+product.getName());
    		if(product.getName().equalsIgnoreCase(prodValue))
    		{
    		
    			//System.out.println("hhhhhhh");
    			//availablestore[1]=vendorService1.findById(2).getName();
    			ctx.setVariable("storeName2", vendorService1.findById(2).getName());
    		}
    	}
        for(Product product:products2)
    	{
    		//System.out.println("\n"+product.getName());
    		if(product.getName().equalsIgnoreCase(prodValue))
    		{
    		
    			//System.out.println("hhhhhhh");
    			//availablestore[2]=vendorService1.findById(2).getName();
    			ctx.setVariable("storeName3", vendorService1.findById(3).getName());
    		}
    	}
        for(Product product:products3)
    	{
    		//System.out.println("\n"+product.getName());
    		if(product.getName().equalsIgnoreCase(prodValue))
    		{
    		
    			//System.out.println("hhhhhhh");
    			//availablestore[2]=vendorService1.findById(2).getName();
    			ctx.setVariable("storeName4", vendorService1.findById(4).getName());
    		}
    	}
        for(Product product:products4)
    	{
    		//System.out.println("\n"+product.getName());
    		if(product.getName().equalsIgnoreCase(prodValue))
    		{
    		
    			//System.out.println("hhhhhhh");
    			//availablestore[2]=vendorService1.findById(2).getName();
    			ctx.setVariable("storeName5", vendorService1.findById(5).getName());
    		}
    	}
      //  ctx.setVariable("productName", availablestore);
     //   productValue=response.get
        //for(int i=0;i<5;i++)
        
        /*	products = vendorService1.findById(1).getProducts();
        	//private ArrayList<Product> products = new ArrayList<Product>();
        	for(Product product:products)
        	{
        		//System.out.println("\n"+product.getName());
        		if(product.getName().equalsIgnoreCase(prodValue))
        		{
        		
        			//System.out.println("hhhhhhh");
        			ctx.setVariable("productName", vendorService1.findById(1).getName());
        		}
        	}*/
      /*  int j=1;
        int p=1;
        for(int i=1;i<6;i++)
        {
         m.put(i,vendorService1.findById(i).getProducts());	
        }
         for(Product product:m.get(p))
         {
        	 if(product.getName().equalsIgnoreCase(prodValue))
        	 {
        		 availablestore[j]=vendorService1.findById(p).getName();
        		 j++;
        	 }
        		 p++;
         }
        
        */
       // ctx.setVariable("productName", availablestore);
        templateEngine.process("availability", ctx, response.getWriter());
        System.out.println("value is" + prodValue);
    }

}
