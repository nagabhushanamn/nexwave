package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ByteRead {
	
	public static void main(String[] args) {
		
		
		try {
			
			File file=new File("d:/FO/abc.txt");
			
			FileInputStream fis=new FileInputStream(file);
			
			if(!(file.exists())){
				System.out.println("--- File not Found");
				return;
			}
			
			int l=(int) file.length();
			
			for(int i=0;i<l;i++){
				System.out.print((char)fis.read());
			}
			
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
	}

}
