
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadCSVFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		
		Scanner scr = new Scanner(new File ("C:\\Users\\HP\\eclipse-workspace\\Automation\\src\\filehandling\\sampledata.csv"));
		scr.useDelimiter(",");
		
		while (scr.hasNext())
		{
			System.out.print(scr.next()+ " ");
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
