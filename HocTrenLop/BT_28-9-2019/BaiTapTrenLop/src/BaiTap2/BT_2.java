package BaiTap2;

import java.util.Scanner;

public class BT_2 {
	/*
	 	Viết chương trình tính giai thừa n
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soDeTinhGiaiThua, tich = 1;
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Nhap vao so de tinh giai thua: ");
			soDeTinhGiaiThua = scan.nextInt();
			if(soDeTinhGiaiThua < 0) 
				System.out.println("Giai thua khong am!!");
		}while(soDeTinhGiaiThua < 0);
		
			
		
		if(soDeTinhGiaiThua == 0 || soDeTinhGiaiThua == 1)
			tich = 1;
		else{
			for(int i = soDeTinhGiaiThua; i > 1; i--)
			{
				tich *= i;
			}
		}
		System.out.println(soDeTinhGiaiThua + "! = " + tich);
	}

}
