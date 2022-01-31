
public class Practicing {

	public static void main(String[] args) {
		int arr[] = { 34, 78, 89, 54, 2, 6, 10 };
		int temp = 0;

		System.out.println("Elements of original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

			for (i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[i] > arr[j]) { //just change the < to get descending order
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}

				}
			}
			System.out.println(" ");
			System.out.println("Elements of array sorted in ascending");
			for (i = 0; i < arr.length; i++) {
				System.out.println(arr[i] + " ");
			}

		}
	}

}
