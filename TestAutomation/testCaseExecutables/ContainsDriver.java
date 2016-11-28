package testCaseExecutables;


import java.util.Vector;
import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;
import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import project.src.StringUtil;

public class ContainsDriver
{
    // instance variables - replace the example below with your own
    private Collection x;


    public ContainsDriver()
    {


    }
    
    public static void main(String[] args) throws Exception
    {
       String[] caseInfo = args;
       String[] fields = args[0].split(":");

       String testValue = fields[0];
       String contents[] = fields[1].split(",");
       
       String fileName = "temp/" + fields[2] + ".txt";
       
       /////////////////////////////////////////////////////////
       //NOTE: if above is not working try using commented out version 
       //bellow this
       /////////////////////////////////////////////////////////
       
       //String fileName = "temp/" + fields[2];
       
       File results = new File(fileName);
       
       ArrayList testCollection = new ArrayList<String>();
       
       for(int i = 0; i< contents.length;i++)
       {
           
           testCollection.add(contents[i]);
           
       }
       
       if(testValue == "null")
       {
           testValue = null;
            
       }
        
       if (fields[1] == "null")
       {
           testCollection = null;
       }
       
       
       FileWriter fw = new FileWriter(fileName);
       BufferedWriter bw = new BufferedWriter(fw);
        
       bw.write("" + runTest(testCollection, testValue) );
  
       bw.close();

       //runTest(testCollection, testValue);
       
       //write each result to its own temp file in the temp folder
        
    }
    

    
    public static boolean runTest(ArrayList<String> testCollection, String testValue)
    {
                
        //String filename = testCase;
        //File file = new File(filename);
        //File results = new File("Results.txt");
        
        //Scanner scanner = null;
        //String str = null;
        
        //scanner = new Scanner( new FileInputStream( file ));
        
        //String[] caseInfo = new String[2];
        //String[] caseInfo = args;
        
        //int i = 0;
        //while( (scanner.hasNextLine()) && (i < 9))
        //{
            
            //str = scanner.nextLine();
            //caseInfo[i] = str;
            //i++;
        //}
        

        //str = caseInfo[5];
        //ArrayList testCollection = new ArrayList<String>();
        //String[] fields = str.split(",");
        
        //int j = 0;
        //while (j < fields.length)
        //{
        //    testCollection.add(fields[j]);
        //    j++;
        //}
        
        //String testValue = caseInfo[7];
        
//      if(testValue == "null")
//      {
//         testValue = null;
//             
//      }
//         
//      if (testCollectio == "null")
//      {
//         testCollection = null;
//      }
        
        return StringUtil.contains(testCollection, testValue);
    }
}
