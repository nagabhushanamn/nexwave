package com;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		try {
			
			File f=new File("d:/FO/Praveen/a1/a2/a3/a4");
			/*if(!(f.exists())){
				f.createNewFile();
			}
			
			System.out.println("Length is "+f.length());
			System.out.println(f.canRead());
			System.out.println(f.canWrite());*/
			
			
		//	System.out.println(f.getParent());
			//f.mkdirs();
			
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed Due to "+e);
		}
		
	}

}
