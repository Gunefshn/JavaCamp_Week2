package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Casper Laptop",3000,3,"Siyah");
		
		
		/*
		product.setName("Laptop");
		product.setStockAmount(3);
		product.setId(1);
		product.setPrice(7500);
		product.setDescription("Casper Laptop");
		*/
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		
		
		/*System.out.println(product.name);
		System.out.println(product.description);
		*/
		
		
	}

}
