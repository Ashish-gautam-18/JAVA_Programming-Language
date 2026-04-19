package com.handling.file;
import java.io.*; 
          // one file data to another file data copy 
public class CopyDataFile {

	public static void main(String[] args) throws IOException {
		
		FileInputStream r = new FileInputStream ("C:\\Users\\delll\\Desktop\\xyz.txt");
		FileOutputStream n = new FileOutputStream ("C:\\Users\\delll\\Desktop\\ah.txt");
		
		int i=0;
		while ((r.read())!=-1) {
			n.write((char)i);
		}
		System.out.println("copy all data to another file ..");
	}

}
                    // please watch learn coding of vedeo to chek i initialize problem

