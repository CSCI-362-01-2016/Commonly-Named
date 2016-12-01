package testCaseExecutables;


import project.src.User;

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

public class ToStringUserDriver
{

        public static void main(String[] args) throws Exception
    {
       String[] caseInfo = args;
       String[] fields = args[0].split(":");
       
       String fileName = "temp/" + fields[3] + ".txt";
       
       User testUser = new User(fields[0],fields[1],fields[2]);
       
       
       
       
       
       FileWriter fw = new FileWriter(fileName);
       BufferedWriter bw = new BufferedWriter(fw);
        
       bw.write("" + testUser.toString() );
  
       bw.close();
        
    }
}
