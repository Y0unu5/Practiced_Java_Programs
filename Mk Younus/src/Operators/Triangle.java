package Operators;

public class Triangle {

	public static void main(String[] args) {
		int a=3, b=6, c=8;
		float s;
		double area;
		s=(a+b+c)*0.5f;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Triangle is:"+s);
		System.out.println("Area is:"+area);
	}

}
