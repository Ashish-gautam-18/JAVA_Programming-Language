package com.handling.file;
import java.io.FileReader;
import java.io.IOException;
//import java.util.*;
public class FileReadOperation {

	public static void main(String[] args) {
		try {
		FileReader r= new FileReader("C:\\Users\\delll\\Desktop\\ash.txt");
		
         try {
        	  int i;
        	  while ((i = r.read())!=-1) {
        		  System.out.println((char)i);
        	  }
        	  
         }finally {
        	 r.close();
        	 System.out.println("file closed");
         }			
	}catch(IOException e) {
		System.out.println("exception handling..");
	}

}
}
