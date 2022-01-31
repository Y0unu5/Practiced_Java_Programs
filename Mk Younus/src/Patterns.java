import java.util.Scanner;

public class Patterns {

	public static void main(String[] args) {
		/* Right Triangle 
		int i, j;

		int row = 6;
		for (i = 0; i < row; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();*/
		//Left pattern
		int i,j,row=6;
		for(i=0;i<row;i++) {
			for(j=2*(row-i);j>=0;j--) {
				System.out.println("");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
