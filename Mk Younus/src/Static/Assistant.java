package Static;
import java.util.*;

/*Instructions:-
--> Enter your name
-->Enter the command in the Second line
(Hi,Hello,Calculate,Date &time)
Hit the Enter button
*/

class AssistantHelper
{
	String userName;
	boolean c_command=false;
	public AssistantHelper(String userName) {
		
		this.userName = userName;
		
		System.out.println("Assistant SetUp is completed....");
		System.out.println("Welcom to the java assistant:"+ userName);
	}
	public void doTask(String command)
	{
		String c=command.toLowerCase();
		if((c.indexOf("hello") !=-1)||(c.indexOf("hi")!=-1))
        {
	       greet();
	       this.c_command=true;
        }
		if((c.indexOf("date")!=-1)||(c.indexOf("time")!=-1))
		{
			get_Date_and_Time();
			this.c_command=true;
		}
		if((c.indexOf("calculate")!=-1))
		{
			calculate();
			this.c_command=true;
		}
		if(!(this.c_command))
		{
			System.out.println("Invalid Command");
		}
	}
	public void calculate() {
		System.out.println("Currently under construction...");
		System.out.println("Sorry from Java Assistant's Developer");
		
	}
	public void get_Date_and_Time() {
		Calendar cal=Calendar.getInstance();
		Date date=cal.getTime();
		System.out.println("Current Date & time is:");
		System.out.println(date.toLocaleString());
		
	}
	public void greet() {
		int random_choice=(int)(100*Math.random());
		if(random_choice<=40)
		{
			System.out.println("Hi "+ userName);
		}
		else if(random_choice>40 && random_choice<=80){
			System.out.println("Hello "+ userName);
		}
		else if(random_choice>80) {
			System.out.println("Hello and Hi from Yunus!.");
		}
		
		
	}
	
}
public class Assistant {

	public static void main(String[] args ) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("What can I do for you?");
		String command=sc.nextLine();
		System.out.println("Commnad:"+ command);
		    

			System.out.println("Thanks for using java assistant");
			

	}

}
