package thymeleafexamples.gtvg.business.entities.repositories;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import thymeleafexamples.gtvg.business.entities.Comment;
import thymeleafexamples.gtvg.business.entities.Product;
import thymeleafexamples.gtvg.business.entities.Vendor;

public class VendorRepository 
{
    private static final VendorRepository INSTANCE = new VendorRepository();
    private final Map<Integer,Vendor> vendorsById;
    
    public static VendorRepository getInstance() 
    {
        return INSTANCE;
    }
     
    private VendorRepository() 
    {
        super();
        
        this.vendorsById = new LinkedHashMap<Integer, Vendor>();
        
        //Vendor1
        final Vendor vend1 = new Vendor();
        vend1.setId(Integer.valueOf(1));
        vend1.setName("Safeway");
        
        final Product prod11 = new Product();
        prod11.setId(Integer.valueOf(11));
        prod11.setName("basil");
        prod11.setPrice(new BigDecimal("1.25"));
        prod11.setInStock(true);
        vend1.getProducts().add(prod11);
        
        final Product prod12 = new Product();
        prod12.setId(Integer.valueOf(12));
        prod12.setName("tomato");
        prod12.setPrice(new BigDecimal("2.25"));
        prod12.setInStock(true);
        vend1.getProducts().add(prod12);
        
        final Product prod13 = new Product();
        prod13.setId(Integer.valueOf(13));
        prod13.setName("onion");
        prod13.setPrice(new BigDecimal("0.99"));
        prod13.setInStock(true);
        vend1.getProducts().add(prod13);
        
        
        final Product prod14 = new Product();
        prod14.setId(Integer.valueOf(14));
        prod14.setName("Frozen Food");
        prod14.setPrice(new BigDecimal("6.99"));
        prod14.setInStock(true);
        vend1.getProducts().add(prod14);
        
        final Product prod15 = new Product();
        prod15.setId(Integer.valueOf(15));
        prod15.setName("Dairy Product");
        prod15.setPrice(new BigDecimal("4.99"));
        prod15.setInStock(true);
        vend1.getProducts().add(prod15);
        
        this.vendorsById.put(vend1.getId(), vend1); 
        
        //Vendor2
        final Vendor vend2 = new Vendor();
        vend2.setId(Integer.valueOf(2));
        vend2.setName("Trader Joe");
        
        final Product prod21 = new Product();
        prod21.setId(Integer.valueOf(21));
        prod21.setName("tomato");
        prod21.setPrice(new BigDecimal("3.25"));
        prod21.setInStock(true);
        vend2.getProducts().add(prod21);
        
        final Product prod22 = new Product();
        prod22.setId(Integer.valueOf(21));
        prod22.setName("potato");
        prod22.setPrice(new BigDecimal("4.25"));
        prod22.setInStock(true);
        vend2.getProducts().add(prod22);
        
        final Product prod23 = new Product();
        prod23.setId(Integer.valueOf(23));
        prod23.setName("basil");
        prod23.setPrice(new BigDecimal("1.50"));
        prod23.setInStock(true);
        vend2.getProducts().add(prod23);
       
        
        final Product prod24 = new Product();
        prod24.setId(Integer.valueOf(24));
        prod24.setName("Fresh fruits");
        prod24.setPrice(new BigDecimal("4.99"));
        prod24.setInStock(true);
        vend2.getProducts().add(prod24);
        
        final Product prod25 = new Product();
        prod25.setId(Integer.valueOf(25));
        prod25.setName("Juices");
        prod25.setPrice(new BigDecimal("3.25"));
        prod25.setInStock(true);
        vend2.getProducts().add(prod25);
        
        this.vendorsById.put(vend2.getId(), vend2);   
        
        //Vendor3
        final Vendor vend3 = new Vendor();
        vend3.setId(Integer.valueOf(3));
        vend3.setName("Whole Foods");
        
        final Product prod31 = new Product();
        prod31.setId(Integer.valueOf(31));
        prod31.setName("carrot");
        prod31.setPrice(new BigDecimal("5.25"));
        prod31.setInStock(true);
        vend3.getProducts().add(prod31);
        
        final Product prod32 = new Product();
        prod32.setId(Integer.valueOf(32));
        prod32.setName("basil");
        prod32.setPrice(new BigDecimal("6.25"));
        prod32.setInStock(true);
        vend3.getProducts().add(prod32);
        
        final Product prod33 = new Product();
        prod33.setId(Integer.valueOf(33));
        prod33.setName("tomato");
        prod33.setPrice(new BigDecimal("2.95"));
        prod33.setInStock(true);
        vend3.getProducts().add(prod33);
       
        
        final Product prod34 = new Product();
        prod34.setId(Integer.valueOf(34));
        prod34.setName("chicken");
        prod34.setPrice(new BigDecimal("6.25"));
        prod34.setInStock(true);
        vend3.getProducts().add(prod34);
        
        this.vendorsById.put(vend3.getId(), vend3);    
        
        //Vendor4
        final Vendor vend4 = new Vendor();
        vend4.setId(Integer.valueOf(4));
        vend4.setName("Sprouts");
        
        final Product prod41 = new Product();
        prod41.setId(Integer.valueOf(41));
        prod41.setName("potato");
        prod41.setPrice(new BigDecimal("7.25"));
        prod41.setInStock(true);
        vend4.getProducts().add(prod41);
        
        final Product prod42 = new Product();
        prod42.setId(Integer.valueOf(42));
        prod42.setName("basil");
        prod42.setPrice(new BigDecimal("8.25"));
        prod42.setInStock(true);
        vend4.getProducts().add(prod42);
        
        final Product prod43 = new Product();
        prod43.setId(Integer.valueOf(43));
        prod43.setName("tomato");
        prod43.setPrice(new BigDecimal("8.65"));
        prod43.setInStock(true);
        vend4.getProducts().add(prod43);
        
        final Product prod44 = new Product();
        prod44.setId(Integer.valueOf(44));
        prod44.setName("Sea Food");
        prod44.setPrice(new BigDecimal("9.25"));
        prod44.setInStock(true);
        vend4.getProducts().add(prod44);
        
        this.vendorsById.put(vend4.getId(), vend4);
        
        //Vendor5
        final Vendor vend5 = new Vendor();
        vend5.setId(Integer.valueOf(5));
        vend5.setName("Target");
        
        final Product prod51 = new Product();
        prod51.setId(Integer.valueOf(51));
        prod51.setName("celery");
        prod51.setPrice(new BigDecimal("13.25"));
        prod51.setInStock(true);
        vend5.getProducts().add(prod51);
        
        final Product prod52 = new Product();
        prod52.setId(Integer.valueOf(52));
        prod52.setName("potato");
        prod52.setPrice(new BigDecimal("14.25"));
        prod52.setInStock(true);
        vend5.getProducts().add(prod52);
        
        final Product prod53 = new Product();
        prod53.setId(Integer.valueOf(53));
        prod53.setName("basil");
        prod53.setPrice(new BigDecimal("6.25"));
        prod53.setInStock(true);
        vend5.getProducts().add(prod53);
        
        final Product prod54 = new Product();
        prod54.setId(Integer.valueOf(54));
        prod54.setName("tomato");
        prod54.setPrice(new BigDecimal("7.25"));
        prod54.setInStock(true);
        vend5.getProducts().add(prod54);
        
        final Product prod55 = new Product();
        prod55.setId(Integer.valueOf(55));
        prod55.setName("cloths");
        prod55.setPrice(new BigDecimal("18.25"));
        prod55.setInStock(true);
        vend5.getProducts().add(prod55);
        this.vendorsById.put(vend5.getId(), vend5);    
        
    }
    
    public List<Vendor> findAll() {
        return new ArrayList<Vendor>(this.vendorsById.values());
    }
    
    public Vendor findById(final Integer id) {
        return this.vendorsById.get(id);
    }
    
    public void addVendor(int idVal, String nameVal, Product productVal)
    {
    	final Vendor vendNew = new Vendor();
    	vendNew.setId(Integer.valueOf(idVal));
        vendNew.setName(nameVal);
        vendNew.getProducts().add(productVal);
        this.vendorsById.put(vendNew.getId(), vendNew);  
    }
    
}
