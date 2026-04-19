package com.handling.file;

import java.io.File;
import java.io.IOException;

public class FileCreate {

	public static void main(String[] args) throws IOException {
		
	File f= new File ("C:\\Users\\delll\\Desktop\\ash.txt");
	 
	if(f.createNewFile()) {
		System.out.println("file create successfully");
	}else {
		System.out.println("already file exist..");
	}

}
}