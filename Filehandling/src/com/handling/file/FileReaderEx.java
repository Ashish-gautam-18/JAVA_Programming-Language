package com.handling.file;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderEx {
public static void main(String [] args)throws IOException{
	FileReader reader= new FileReader("saru.jpg)");
	FileWriter writer=new FileWriter("ash.jpg");
System.out.println("Channel created successfully.....");

int c ;
while ((c=reader.read())!=-1) {
	writer.write(c);
}
  System.out.println("Read & write operations are completed .....");

   reader.close();
   writer.close();
  System.out.println("Channel released successfully....."); 

 }
}



// cheak all condition and statement 