
public class RegularExp2 {

	public static void main(String[] args) {
		//Remove special character
		String str="abBc@g$T#";
		System.out.println(str.replaceAll("[a-zA-z0-9]", ""));
		//Remove extra Spaces
		String d="     abc     efg     ijk";
		System.out.println(d.replaceAll("\\s+", " ").trim());
		//Find no. of words
		String str1="   mk you nus   sim  ran";
		str1=str1.replaceAll("\\s+", " ").trim();
		String words[]=str1.split("\\s");
		System.out.println(words.length);
		
		
		

	}

}
