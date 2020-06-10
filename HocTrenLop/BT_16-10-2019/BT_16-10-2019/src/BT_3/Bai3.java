package BT_3;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Kết quả trả về là: " + soNguyen());
	}
	
	
	
	public static int soNguyen()
	{
		int a,b;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập vào a: ");
		a = scan.nextInt();
		System.out.println("Nhập vào b: ");
		b = scan.nextInt();
		if(a %2 == 0 && b %2 == 0)
			return a + b;
		else if (a %2 != 0 && b %2 != 0)
			return a * b;
		else  return (int)Math.pow(a,2) + (int)Math.pow(b,2);
	}

}

