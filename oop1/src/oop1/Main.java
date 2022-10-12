package oop1;

public class Main {

	public static void main(String[] args) {
		 
		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setImageUrl("product1.jpg");
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setUnitPrice(7500);	
		
		Product product2 = new Product();
		product2.setName("B Makinesi");
		product2.setImageUrl("product2.jpg");
		product2.setDiscount(8);
		product2.setUnitsInStock(5);
		product2.setUnitPrice(6500);
		
		Product product3 = new Product();
		product3.setName("C Kahve Makinesi");
		product3.setImageUrl("product3.jpg");
		product3.setDiscount(6);
		product3.setUnitsInStock(8);
		product3.setUnitPrice(3500);
		Product[] products = {product1,product2,product3};
		
		System.out.println("<ul>");
		for (Product product : products) {
			System.out.println("<li>" + product.getName() + "</li>");
		}
		System.out.println("</ul>");
		IndividualCustomers individualCustomer = new IndividualCustomers();
		individualCustomer.setId(1);
		individualCustomer.setCustomrNumber("12345");
		individualCustomer.setPhoneNumber("05457849653");
		individualCustomer.setFirstName("Gunef");
		individualCustomer.setLastName("ŞAHİN");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCustomrNumber("67894");
		corporateCustomer.setPhoneNumber("05459654123");
		corporateCustomer.setCustomrNumber("Migros");
		corporateCustomer.setTaxNumber("6547996");
		
		Customer [] customers = {individualCustomer,corporateCustomer};
		
	}
		
}
