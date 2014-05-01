///*
// * =============================================================================
// * 
// *   Copyright (c) 2011, The THYMELEAF team (http://www.thymeleaf.org)
// * 
// *   Licensed under the Apache License, Version 2.0 (the "License");
// *   you may not use this file except in compliance with the License.
// *   You may obtain a copy of the License at
// * 
// *       http://www.apache.org/licenses/LICENSE-2.0
// * 
// *   Unless required by applicable law or agreed to in writing, software
// *   distributed under the License is distributed on an "AS IS" BASIS,
// *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// *   See the License for the specific language governing permissions and
// *   limitations under the License.
// * 
// * =============================================================================
// */
//package thymeleafexamples.gtvg.business.entities.repositories;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.List;
//import java.util.Map;
//
//import thymeleafexamples.gtvg.business.entities.Customer;
//import thymeleafexamples.gtvg.business.entities.Order;
//import thymeleafexamples.gtvg.business.entities.OrderLine;
//import thymeleafexamples.gtvg.business.entities.Product;
//import thymeleafexamples.gtvg.business.util.CalendarUtil;
//
//
//public class ResultRepository {
//
//    
//    private static final ResultRepository INSTANCE = new ResultRepository();
//    private final Map<Integer,Product> productsByName;
//    //private final Map<Integer,List<Order>> ordersByCustomerId;
//    
//    
//    public static ResultRepository getInstance() {
//        return INSTANCE;
//    }
//       
//    private ResultRepository() {
//        
//        super();
//        
//        this.productsByName = new LinkedHashMap<Integer, Product>();
//        this.ordersByCustomerId = new LinkedHashMap<Integer, List<Order>>();
//
//        final Product prod1 = ProductRepository.getInstance().findById(Integer.valueOf(1));
//        final Product prod2 = ProductRepository.getInstance().findById(Integer.valueOf(2));
//        final Product prod3 = ProductRepository.getInstance().findById(Integer.valueOf(3));
//        final Product prod4 = ProductRepository.getInstance().findById(Integer.valueOf(4));
//        
//        final Order order1 = new Order();
//        order1.setId(Integer.valueOf(1));
//        order1.setCustomer(cust4);
//        order1.setDate(CalendarUtil.calendarFor(2009, 1, 12, 10, 23));
//        this.ordersById.put(order1.getId(), order1);
//        this.ordersByCustomerId.get(cust4.getId()).add(order1);
//
//        final OrderLine orderLine11 = new OrderLine();
//        orderLine11.setProduct(prod2);
//        orderLine11.setAmount(Integer.valueOf(2));
//        orderLine11.setPurchasePrice(new BigDecimal("0.99"));
//        order1.getOrderLines().add(orderLine11);
//        
//        final Result result1 = new Result();
//        vendor1.
//
//      
//    }
//    
//    
//    
//    public List<Order> findAll() {
//        return new ArrayList<Order>(this.ordersById.values());
//    }
//    
//    public Order findById(final Integer id) {
//        return this.ordersById.get(id);
//    }
//    
//    
//    public List<Order> findByCustomerId(final Integer customerId) {
//        final List<Order> ordersForCustomerId = this.ordersByCustomerId.get(customerId);
//        if (ordersForCustomerId == null) {
//            return new ArrayList<Order>();
//        }
//        return ordersForCustomerId;
//    }
//    
//    
//}
