package Operators;

public class IncDec {

	public static void main(String[] args) {
		int x = 5, y = 4, z;
		z = 2 * x++ + ++y;
		System.out.println(z);
		float a=3.4f;
		a++;
		System.out.println(a);
		char ch='A';
		ch++;
		System.out.println(ch);
	}

}
