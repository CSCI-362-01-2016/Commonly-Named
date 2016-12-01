package testCaseExecutables;

import project.src.Course;

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


public class ToStringCourseDriver
{

    public static void main(String[] args) throws Exception
    {
       String[] caseInfo = args;
       String[] fields = args[0].split(":");
       
       String fileName = "temp/" + fields[2] + ".txt";
       
       Course testCourse = new Course(fields[0],fields[1]);
       
       
       
       
       
       FileWriter fw = new FileWriter(fileName);
       BufferedWriter bw = new BufferedWriter(fw);
        
       bw.write("" + testCourse.toString() );
  
       bw.close();
        
    }
}
