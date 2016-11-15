import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;


public class MainDriver
{

    public MainDriver()
    {

    }
    
    public static void main(String[] args) throws Exception
    {
        File results = new File("Results.txt");
        
        
        
        FileWriter fw = new FileWriter(results);
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("Test06: " + ContainsDriver.runTest("Test06.txt"));
		bw.newLine();
		
		bw.write("Test07: " + ContainsDriver.runTest("Test07.txt"));
		bw.newLine();
		
		bw.write("Test08: " + ContainsDriver.runTest("Test08.txt"));
		bw.newLine();
		
		bw.write("Test09: " + ContainsDriver.runTest("Test09.txt"));
		bw.newLine();
		
		bw.write("Test10: " + ContainsDriver.runTest("Test10.txt"));
		bw.newLine();
		
		bw.write("Test11: " + ContainsDriver.runTest("Test11.txt"));
		bw.newLine();
		
		bw.close();
		
		
		

    }
}
