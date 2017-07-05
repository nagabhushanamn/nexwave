package com;

import java.io.FileWriter;

public class WriterDemo {
	
	public static void main(String[] args) {
		
		
		try {
			
			FileWriter fw=new FileWriter("d:/FO/xyz.txt",true);
			
			String s1="Hello";
			
			fw.write(s1);
			
			fw.close();
			
			System.out.println("-- Writing is Done");
			
			
			
		} catch (Exception e) {
			System.out.println("Failed Due to "+e);
		}
		
		
	}

}
