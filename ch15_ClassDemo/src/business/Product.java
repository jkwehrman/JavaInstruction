package business;

public class Product implements ProductReader{

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
		return "Product [code=" + code + ", description=" + description + ", price  //  there is more here"]
	}
	@Override
	public Product get(String code) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String getAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//please please put curser where they need to go
	//p220 - signature of the conductor
	
	//p223 - write getters and setters - public - will return the code
	//I wrote this getter/setter
	/*public String getCode() {
		return code;
		//this is the getter
	}
	
	public void setCode(String c) {
		code = c;
		//this is the setter
		 */
		 */
	}
}
