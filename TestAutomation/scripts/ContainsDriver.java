
import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class ContainsDriver
{
    // instance variables - replace the example below with your own
    private Collection x;


    public ContainsDriver()
    {


    }
    

    
    public static boolean runTest(String testCase)throws Exception
    {
                
        String filename = testCase;
        File file = new File(filename);
        File results = new File("Results.txt");
        
        Scanner scanner = null;
        String str = null;
        
        scanner = new Scanner( new FileInputStream( file ));
        
        String[] caseInfo = new String[9];
        
        int i = 0;
        while( (scanner.hasNextLine()) && (i < 9))
        {
            
            str = scanner.nextLine();
            caseInfo[i] = str;
            i++;
        }

        str = caseInfo[5];
        ArrayList testCollection = new ArrayList<String>();
        String[] fields = str.split(",");
        
        int j = 0;
        while (j < fields.length)
        {
            testCollection.add(fields[j]);
            j++;
        }
        
        String testValue = caseInfo[7];
        
        if(testValue == "null")
        {
            testValue = null;
            
        }
        
        if (str == "null")
        {
            testCollection = null;
        }
        
        return StringUtil.contains(testCollection, testValue);
    }



}
