package util;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

//输入输出重定向
public class InputAndOutputRedirect {
		static InputStream in = System.in;
		static PrintStream out = System.out;
        static FileInputStream fis=null;
        static Scanner scanner=null;
        static FileOutputStream fos=null;
        static PrintStream ps=null;
        
     public static Scanner fopenIn(String filename) throws IOException{
    	 fis=new FileInputStream(filename);
    	 System.setIn(fis);	        
	     scanner = new Scanner(System.in);
	     return scanner;
     }
     
     public static void fopenOut(String filename) throws IOException{
    	 fos=new FileOutputStream(filename);
    	 ps=new PrintStream(fos);
    	 System.setOut(ps);
     }
     public static void close() throws IOException{
    	 if(scanner!=null)
    		 scanner.close();
    	 if(fis!=null)
    		 fis.close();   	 
    	 if(ps!=null)
    		 ps.close();
    	 if(fos!=null)
    		 fos.close();
    	 System.setIn(in);
    	 System.setOut(out);
     }   
//	 public static void main(String[] args) throws IOException {
//		    Scanner scanner=InputAndOutputRedirect.fopenIn("file/input.txt");
//	        int a=scanner.nextInt();
//	        int b=scanner.nextInt();
//	        System.out.print(a+" "+b);
//	        InputAndOutputRedirect.close();
//
//	        InputAndOutputRedirect.fopenOut("file/output.txt");
//	        System.out.print(a+" "+b);	       
//	        InputAndOutputRedirect.close();
//	        System.out.print("aaa");	  
//	    }
}
