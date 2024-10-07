package kr.co.product;

public class Product implements Comparable<Product> {
	
	private String name;
	private int price;
	
	public Product(){
		this(null,0);
	}
	public Product(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return price;
	}
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Product pro)) {
			return false; 
		}
		return this.price == pro.price;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	@Override
	public int compareTo(Product pro) {
		return this.price - pro.price;
	}
	
	
}
