import java.awt.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FileRunner {
	public static void main(String [] args)throws FileNotFoundException {
		File file = new File("C:\\Users\\SagarX360\\Documents\\Dev\\JavaProjects\\File\\src\\Customer.txt");
		ArrayList<String> Employee = new ArrayList();
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			Employee.add(scan.nextLine());
		}
		Collections.sort(Employee);
		try{    
			FileWriter fw=new FileWriter("Output.txt");    
			for(String s: Employee) 
			{
				fw.write(s);
				fw.write("\n");
			}   
			fw.close();    
		}catch(Exception e){System.out.println(e);}    
		System.out.println("Success...");    
	}  



}



