package htc.com.model;

import java.util.HashMap;

public class Product {
	HashMap<String,Double> hmap = new HashMap<String,Double>();
	public Product()
	{
		hmap.put("pen",4.76);
		hmap.put("pencil",5.00);
		hmap.put("BMW",52000000.00);
	}
	public double itemSearch (String key)
	{
//		System.out.println(key);
	System.out.println(hmap.get(key));
	return hmap.get(key);
	}
	
}


