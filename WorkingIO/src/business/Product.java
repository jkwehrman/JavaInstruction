package business;

public class Product {
	private String code;
	private String description;
	private double price;
	
	//p.220-1 - constructors - name of the class (parameters)
	public Product() {
	// declare - either empty or with constructors - these are empty
		code = "";
		description = "";
		price = 0.0;
	}
// auto created by Eclipse when selected source/generate...for fields/ 
	//it uses code you already put in - notice words in string same as this. words
	public Product(String code, String description, double price) {
		this.code = code;  //sean changed words "code=inCode"
		this.description = description;  //  description = inDesc'
		this.price = price;  // price = inPrice;
	}
	
	//this below was created by eclipse source/generate getters and setters - not changing 
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", description=" + description + ", price=" + price + "]";
	}

}
