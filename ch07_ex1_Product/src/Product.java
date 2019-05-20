import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;

    public Product() {
    	code = "";
    	description = "";
    	price = 0;
    }
        
        public Product(String p_code, String p_description, double p_price ) {
            code = p_code;
            description = p_description;
            price = p_price;

    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }
    
    public String getPriceNumberFormat() {
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        return number.format(price);
    }
}