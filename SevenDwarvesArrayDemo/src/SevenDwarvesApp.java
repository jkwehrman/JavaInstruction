import java.util.Arrays;

public class SevenDwarvesApp {

	public static void main(String[] args) {
		System.out.println("7 Dwarves App");
		String[] dwarves = new String[7];
		
		dwarves[0] = " Sleepy";
		dwarves[1] = " Grumpy";
		dwarves[2] = " Doc";
		dwarves[3] = " Sneezy";
		dwarves[4] = " Bashful";
		dwarves[5] = " Dopey";
		dwarves[6] = " Happy";
		
		System.out.println("My favorite dwarf is " + dwarves[2]);
		System.out.println(" ");
	 	
		for (int i=0; i < dwarves.length; i++)  {
			System.out.println(i + dwarves[i]);
			
		}
		System.out.println("for each loop...");
		Arrays.sort(dwarves);
		for (String d: dwarves)  {
			System.out.println(d);
		}
		System.out.println("bye");   
		
	
	}}

