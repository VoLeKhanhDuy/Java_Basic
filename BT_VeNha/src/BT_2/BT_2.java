package BT_2;

import java.util.Scanner;

public class BT_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao n: ");
		int n = scan.nextInt();
		float tong = 0;
		for(int i = 1; i <= n; i++)
		{
			tong += (float)1/i;
		}
		System.out.println("S = " + tong);
	}

}
