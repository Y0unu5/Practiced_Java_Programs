import java.io.*;

public class IOStreams {

	public static void main(String[] args) {

		byte b[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i' };
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		/*
		 * int x; while ((x = bis.read()) != -1) { System.out.print((char) x+ " "); }
		 */
		String str=new String (bis.readAllBytes());
		System.out.println(str);
		try {
			bis.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
