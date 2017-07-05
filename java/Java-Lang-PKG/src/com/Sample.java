package com;

public class Sample {

	public static void main(String[] args) {
	
		
		String s1="Abc";  
		String s2=new String("Abc");
		
		System.out.println("S1: "+s1);
		System.out.println("hash Code of S1: "+s1.hashCode());
		System.out.println("S1 Idendentity Code : "+System.identityHashCode(s1));
		
		System.out.println("S2: "+s2);
		System.out.println("hash Code of S1: "+s2.hashCode());
		System.out.println("S2 Idendentity Code : "+System.identityHashCode(s2));
		
	/*	if(s1==s2)
			System.out.println("Equals");
		else
			System.out.println("NE");*/
		
		if(s1.equals(s2)){
			System.out.println("EQ");
		}else{
			System.out.println("NE");
		}
		

	}

}
