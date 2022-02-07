import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	private int rollNo;
	private String name;
	private float avg;
	private String dept;
	public static int Data=10;
	public transient int t;
	public Student() {
		
	}
	public Student(int rollNo, String name, float avg, String dept) {
		
		this.rollNo = rollNo;
		this.name = name;
		this.avg = avg;
		this.dept = dept;
		Data=500;
		t=500;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", avg=" + avg + ", dept=" + dept + ", t=" + t + "]";
	}
	
	
	
	
}
public class Serialization {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos=new FileOutputStream("C:\\CT2C\\Student.txt");
		ObjectOutputStream os=new ObjectOutputStream(fos);
		Student s=new Student(101,"Yunus",80.5f,"Mech");
		os.writeObject(s);
		
		os.close();
		fos.close();

	}

}
