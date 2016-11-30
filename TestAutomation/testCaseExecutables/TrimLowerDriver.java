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


public class TrimLowerDriver
{

    public TrimLowerDriver()
    {

    }
    
    public static void main(String[] args) throws Exception                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
    {
        
        String[] fields = args[0].split(":");
        String testString = fields[0];
        
        String fileName = "temp/" + fields[1] + ".txt";
        
       /////////////////////////////////////////////////////////
       //NOTE: if above is not working try using commented out version 
       //bellow this OR change "/" to "\" although that may cause problems
       /////////////////////////////////////////////////////////
       
       //String fileName = "temp/" + fields[2];
       
       FileWriter fw = new FileWriter(fileName);
       BufferedWriter bw = new BufferedWriter(fw);
        
       bw.write("" + runTest(testString));
  
       bw.close();
        

        //runTest(testString);
        
        //TODO write results to file located in temp with name of the test case. 
    }
    
    public static String runTest(String testString)
    {
        
        String rtrnVal;
        //if string value is empty "" should return null
        
        if((testString == null) || (testString == ""))
        {
            rtrnVal = "null";
        }
        
        else
        {
            rtrnVal = StringUtil.trimToNullLower(testString);
        }
        
        return rtrnVal;
    }


}

