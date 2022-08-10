package junittesting;
import java.util.Scanner;

public class SwapNibble {
	public static void main(String[] args) {
		System.out.println("enter number to conert in binary: ");
		Scanner sc = new Scanner(System.in);
		int decimal = sc.nextInt();
		int binary[] = new int[1000];
		int index = 0;
		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}
		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		int[] arr1 = new int [index];
		int arr[]= {binary[i]};
		int p = 0;
		int q = 4;
		for (int j = 0; j <= index; j++)
			if (j <= 3) {
				arr1[q]=arr[j];
				q++;
			}
			else {
				arr1[p]=arr[j];
				p++;
			}
			for (int z : arr) {
				System.out.println(z);
			}
		}
	}
}