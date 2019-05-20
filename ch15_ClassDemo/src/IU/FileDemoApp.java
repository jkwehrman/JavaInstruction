//Generating folders and files - use as reference - Sean pushed code

package IU;

import java.io.*;

import java.nio.file.*;

import business.Product;


public class FileDemoApp {

	public static void main(String[] args) {

		System.out.println("Hello");

		try {
			//define folder on harddrive
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Subfolder successfully created.");

			} 
			else {
				System.out.println("Subfolder already created.");


			} 
			
String fileString = "products.txt";
Path filePath = Paths.get(dirString, fileString);
if (Files.notExists(filePath)) {
	Files.createFile(filePath);
	System.out.println(fileString + "successfully created");
	
}
else {
	System.out.println(fileString + "NOT created");
}
		
		System.out.println("File Name:  " + filePath.getFileName());
		System.out.println("Absolute Path:  " +filePath.toAbsolutePath());
		System.out.println("Relative Is writable:  " +Files.isWritable(filePath));
		
		System.out.println("Files in a director...");
		if (Files.deleteIfExists(filePath) && Files.isDirectory(filePath)) {
		
			System.out.println("Directory:  " + dirPath.toAbsolutePath());
			System.out.println("Files:  ");
			DirectoryStream<Path> dirStream = Files.newDirectoryStream(dirPath);
			for (Path p:dirStream) {
				if (Files.isRegularFile(p)) {
					System.out.println("    "+p.getFileName());
				}
			}
			
		}
		Path productsPath = Paths.get("products.txt");
		// Not the same products.txt as examples above
		File productsFiles = productsPath.toFile();
		
		//open an output stream
		PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new FileWriter(productsFiles)));
		//write data to the string
		out.println("java.tMurach's Java Programming\t57.50");
		
		//close stream to avoid a resource leak
		
		BufferedReader in = new BufferedReader(
							new FileReader(productsFiles));
		
		//ORM 
		// read date from the stream and print to console
		String line = in.readLine();
		System.out.println(line);
		
		//Bonus - map this line to a Product
		String[] fields = line.split("\t");
		String code = fields[0];
		String desc = fields[1];
		double price = Double.parseDouble(fields[2]);
		
		Product p = new Product(code, desc, price);
		//end of ORM  
		System.out.println("Just don't know what to write here.");
		
		}catch (IOException e) {
			System.out.println("Bad directory path entered.");
			// TODO Auto-generated catch block
			e.printStackTrace();
			//pointing to an item outside of Java  - add a try catch block - where to put it?
		}  
		System.out.println("Goodbye");
	}
}



/*
 * How to create a directory
 * package IU;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDemoApp {

	public static void main(String[] args) {

		System.out.println("Hello");

		try {
			String dirString = "c:/temp";
			Path dirPath = Paths.get(dirString);
			if (Files.notExists(dirPath)) {
				Files.createDirectories(dirPath);
				System.out.println("Directory successfully created.");
				
			} 
			else {
				System.out.println("Directory already created.");
				
				
			} }
		catch (IOException e) {
				System.out.println("Bad directory path entered.");
				// TODO Auto-generated catch block
				e.printStackTrace();
				//pointing to an item outslde of Java  - add a try catch block - where to put it?
			}  
		System.out.println("Goodbye");
	}






	}
 * 
 * */
