
public class Rectangle {
   	private double width;
	private double length;
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	// add a constructor
	public Rectangle() {
		width = 0.0;
		length = 0.0;	
		}
	
	//add a get method
	public double getArea()  {
		double area;    
		return area = length * width;
	}
	//create it as a string
	public String getAreaAsString()  {
		Long area;
		area = Math.round(length * width * 100)/ 1000;
		return  String.valueOf(area) ;
	}
	
	//add another method
	public double getPerimeter()  {
		double perimeter;
		return perimeter = 2 * (length + width);
	}
		public String getPerimeterAsString() {
			Long perimeter;
			perimeter = Math.round((length + width) * 2 * 100)/ 1000;
			return  String.valueOf(perimeter) ;
		}
	
		
	
		//public double setArea() {
			//area = length * width;
	//double getArea()  {
       // double area = width * length;
        //double perimeter = 2 * width + 2 * length;
		
	}	

