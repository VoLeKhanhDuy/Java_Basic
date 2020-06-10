package BaiTap5;

import java.util.Scanner;

public class BT_5 {
	/*
	 * Viet chuong trinh tinh tong cac phan tu trong 1 so nguyen
	 * so 23456, tong = 2+3+4+5+6
	 */
	public static void main(String[] args) {
		int soNguyen, tong = 0;
		Scanner scan = new Scanner(System.in);
		
		do{
			print("Nhap vao so nguyen: ");
			soNguyen = scan.nextInt();
			if (soNguyen < 0) print("Vui long nhap lai!!");
		}while(soNguyen < 0);
		
		while(soNguyen > 10)
		{
			tong += soNguyen % 10;
			soNguyen /= 10;
		}
		tong += soNguyen;
		print ("Tong cua day vua nhap la: " + tong);

	}
	
	
	
	public static void print (String content)
	{
		System.out.println(content);
	}

}
