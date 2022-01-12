

public class RegularExp {

	public static void main(String[] args) {
		int b = 10110101;
		String str = String.valueOf(b);
		System.out.println(str.matches("[01]*"));
		String d = "234AB";
		System.out.println(d.matches("[1-9A-F]*"));
		String f = "23/10/1995";
		System.out.println(f.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
	}

}
