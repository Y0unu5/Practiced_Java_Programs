import java.util.ArrayList;
import java.util.List;


public class LambdaDemo1 {

	public static void main(String[] args) {
		
		  List<String> l = new ArrayList<String>(); l.add("Mk younus");
		  l.add("Saqlain"); l.add("exp"); l.add("titan");
		  
		  l.forEach((temp) -> System.out.println(temp));
		 
		
	}
}
