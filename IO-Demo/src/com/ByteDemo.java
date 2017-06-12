package com;

import java.io.FileOutputStream;

public class ByteDemo {
	
	public static void main(String[] args) {
		
		
		try {
			
			
			FileOutputStream fos=new FileOutputStream("d:/FO/abc.txt",false);
			
			String s1="Praven";
		/*	
			byte[] data=s1.getBytes();
			
			fos.write(data);*/
			char[] c=s1.toCharArray();
			for(int i=0;i<c.length;i++){
				int x=(int)c[i];
				fos.write(x);
			}
			
			fos.close();
			
			System.out.println("--- Data Written to the file..");
			
			
			
			
		} catch (Exception e) {
			System.out.println("Failed due to "+e);
		}
		
	}

}
