@FunctionalInterface
interface MyLambda {
	public void display();
}

/*
 * class My implements MyLambda {
 * 
 * @Override public void display() { System.out.println("Hello world");
 * 
 * }
 * 
 * }
 */
public class LambdaDemo {

	public static void main(String[] args) {
		/*
		 * MyLambda m = new MyLambda() { public void display() {
		 * System.out.println("Hello World"); } };
		 * m.display();
		 */
		MyLambda m=
				()->{
					System.out.println("Hi");
				};
				m.display();
	}

}
