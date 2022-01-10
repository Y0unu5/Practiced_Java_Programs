
public class StringEx {

	public static void main(String[] args) {
		String str = "mkyounus541@gmail.com";
		int i = str.indexOf("@");
		String uname = str.substring(0, i);
		String domain = str.substring(i + 1, str.length());
		System.out.println("Username is " + uname + " " + "Domain is " + domain);

	}

}
