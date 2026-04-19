package com.handling.file;

import java.io.File;

public class ReanameFile {

	public static void main(String[] args) {
		File a= new File("C:\\Users\\delll\\Desktop\\abc.txt");
		File n= new File("C:\\Users\\delll\\Desktop\\xyz.txt");
		
		if (a.exists()) {
            System.out.println(a.renameTo(n));			
		}else {
			System.out.println("this file not exist..");
		}
	}
}
