package com;

@FunctionalInterface
interface StringToIntMapper {
	int map(String s);
}

public class Lambda_Ex {

	public static void main(String[] args) {

		// StringToIntMapper mapper1 = new StringToIntMapper() {
		// @Override
		// public int map(String s) {
		// return s.length() + 10;
		// }
		// };
		//
		// StringToIntMapper mapper2 = new StringToIntMapper() {
		// @Override
		// public int map(String s) {
		// return s.length() + 20;
		// }
		// };
		//
		// StringToIntMapper mapper3 = new StringToIntMapper() {
		// @Override
		// public int map(String s) {
		// return s.length() + 30;
		// }
		// };
		//
		// StringToIntMapper mapper4 = new StringToIntMapper() {
		// @Override
		// public int map(String s) {
		// return s.length() + 40;
		// }
		// };
		//
		// StringToIntMapper mapper1 = (s) -> s.length() + 10;
		// StringToIntMapper mapper2 = (s) -> s.length() + 20;
		// StringToIntMapper mapper3 = (s) -> s.length() + 30;
		// StringToIntMapper mapper4 = (s) -> s.length() + 40;
		// StringToIntMapper mapper5 = (s) -> s.length() + 50;
		//
		// System.out.println(mapper1.map("abc"));
		
		
		
		//--------------------------------------------------------
		
		StringToIntMapper mapper1=s->s.length();
		StringToIntMapper mapper2=String::length;
		
		
		
		

		
		
	}

}
