package BaiTap1;

import java.util.Scanner;

public class BaiTap {
	/*
	  -------------------------------------------------------------------------------
		Viết chuong trình liệt kê các số nguyên tố trong khoảng (m - n) (m < n < 1000)
	  -------------------------------------------------------------------------------
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startNumber, endNumber, dem = 0;
		Scanner scan = new Scanner (System.in);
		
		do{
			System.out.println("Nhap vao gia tri bat dau: ");
			startNumber = scan.nextInt();
			if(startNumber > 1000) 
				System.out.println("Vui long nhap lai!!");
		}while(startNumber > 1000);
			
		
		do{
			System.out.println("Nhap vao gia tri ket thuc: ");
			endNumber = scan.nextInt();
			if(endNumber > 1000 || startNumber > endNumber) 
				System.out.println("Vui long nhap lai!!");
		}while(endNumber > 1000 || startNumber > endNumber);
			
		System.out.print("Cac so nguyen to trong khoang (" + startNumber + " - " + endNumber + ") la : ");
		for(int i = startNumber; i < endNumber; i++)
		{
			if(KTSNT(i) == true)
			{
				dem++;
				System.out.print(i + "  ");
			}
		}
		
	}
	
	public static boolean KTSNT(int n)
	{
		if(n < 2)	return false;
			
		for (int i = 2; i < n; i++)
		{
			if(n % i == 0) return false;
		}
		return true;
	}

}
