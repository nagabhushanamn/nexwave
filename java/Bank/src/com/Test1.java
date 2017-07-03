package com;

public class Test1 {
	
	static class C1{
		private class Private{
			public void f1(){
				System.out.println("-- Test");
			}
		}
	}
	
	public static void main(String[] args) {
		
		C1.Private p= new Test1.C1().new Private();
		
		System.out.println(p.getClass());
		p.f1();
		
		
		
	}

}
