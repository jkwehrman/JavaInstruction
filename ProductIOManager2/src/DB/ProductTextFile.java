



/*
 * 
 * 

package DB;

import java.io.*;
import java.nio.file.*;  // to import everything from the file - creating connection
import java.util.ArrayList;
import java.util.List;

import Business.Product;

//set this up p.481 Instance Variables
public class ProductTextFile implements DAO<Product>{
	private List<Product> products = null;
	private Path productsPath = null;
	private File productsFile = null;
	private final String FIELD_SEP = "\t";


	//empty constructor  // called when substantiated an instance use "new" - from main application class
	//reference the file, start by finding path
	//replace super()
	public ProductTextFile() {
		//define the path to the file
		productsPath = Paths.get("products.txt");
		//define the file
		productsFile = productsPath.toFile();
		//initialize out list of products
		products = getAll();  //sets products path and products file

	}



	@Override
	public Product get(String code) {
		for (Product p: products)  {
			if (p.getCode().equalsIgnoreCase(code))  {
				return p;
			}
		}
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		//if the products file has already been read, don't read again
		//if this app supported multiple users this may be dangerout
		if (products != null) {
			return products;
		}
		products = new ArrayList<>();

		if (Files.exists(productsPath)) {
			try (BufferedReader in = new BufferedReader(
					new FileReader(productsFile))) {
				//read a line from products.txt
				String line = in.readLine();
				while (line != null) {
					String[] fields = line.split(FIELD_SEP);  //separate into an array from a line
					String code = fields[0];
					String desc = fields[1];
					double price = Double.parseDouble(fields[2]);
					//create a product
					Product p = new Product(code,desc,price);  // new instance of product

					products.add(p);

					line = in.readLine();
				}


				//		IOException will handle			
				//		} catch (FileNotFoundException e) {
				//			// TODO Auto-generated catch block
				//			e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		else {
			System.out.println(productsPath.toAbsolutePath()+" does not exist.");
		}
		return products;
	}

	@Override
	public boolean add(Product t) {
		products.add(t);
		return saveAll();
		//need to save to text file
		//need save all


	}

	@Override
	public boolean update(Product t) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean delete(Product t) {
		// TODO Auto-generated method stub
products.remove(t);
return this.saveAll();
	}

	//save all
	// when processing text files we will re-
	//save the entire file every time we add, update or delete
	private boolean saveAll() {
		try (PrintWriter out = new PrintWriter(
				new BufferedWriter(
						new FileWriter(productsFile)))) {
	
				// loop through products list and
				//write a record for every product
				for (Product p: products) {
					out.print(p.getCode()+FIELD_SEP);	
					out.print(p.getDescription()+FIELD_SEP);	
					out.println(p.getPrice());
				}
				return true;
	} catch (IOException e) {

		System.out.println(e);
		return false;
	}
//483
}
}
*/
