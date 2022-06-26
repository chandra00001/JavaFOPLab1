package com.bharath.spring.springorm.product.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bharath.spring.springorm.product.dao.ProductDao;
import com.bharath.spring.springorm.product.entity.Product;

public class Test {

	public static void main(String[] args) {

		String configFilename="com/bharath/spring/springorm/product/test/config.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(configFilename);
		ProductDao productDao = (ProductDao)context.getBean("productDao");
		Product product = new Product();
		product.setName("Iphone");
		product.setDesc("It's awesome");
		product.setPrice(7);
		int result = productDao.create(product);
		System.out.println("No of records inserted is "+result);
		context = null;
	}
}

