
public class StringMethods {

	public static void main(String[] args) {
		String str = "Mr.Mohammed Yunus karadi";
		System.out.println(str.startsWith("Mr."));
		System.out.println(str.endsWith("karadi"));
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.trim());
		System.out.println(str.substring(3, 9));
		System.out.println(str.charAt(5));
		String str1="China wall";
		String str2=new String("china all");
		//System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1.compareTo(str2));

	}

}
