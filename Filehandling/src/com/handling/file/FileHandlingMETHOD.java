package com.handling.file;

import java.io.File;

public class FileHandlingMETHOD {

	public static void main(String[] args) {
		
         File f = new File ("C:\\Users\\delll\\Desktop\\ash.txt");
	
	     if (f.exists())
	    	   // so already one file on desktop then perform coz we are just operations
	     {
	    	 System.out.println("file name :" + f.getName());
	    	 System.out.println("file Location :" + f.getAbsolutePath());
	    	 System.out.println("file writable :" + f.canWrite());
	    	 System.out.println("file Radable :" + f.canRead());
	    	 System.out.println("file length :" + f.length());
	         System.out.println("file delete :" + f.delete());
	     }
	     else {
	    	 System.out.println("file dosen't exit...");
	     }
	}

}
