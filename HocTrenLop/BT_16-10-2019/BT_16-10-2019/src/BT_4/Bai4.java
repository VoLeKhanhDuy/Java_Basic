package BT_4;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soThu1, soThu2;
		int luaChon;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		soThu1 = scan.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		soThu2 = scan.nextInt();
		do {
			System.out.println("1.Cong");
			System.out.println("2.Tru");
			System.out.println("3.Nhan");
			System.out.println("4.Chia");
			System.out.println("0.Thoat");
			
			System.out.println("Lua chon phep tinh cho 2 so vua nhap!!");
			luaChon = scan.nextInt();
			switch (luaChon) {
			case 0: break;
			case 1:
				int tong = 0;
				tong = soThu1 + soThu2;
				System.out.println(soThu1 + " + " + soThu2 + " = " + tong);
				break;
				
			case 2:
				int hieu = 0;
				hieu = soThu1 - soThu2;
				System.out.println(soThu1 + " - " + soThu2 + " = " + hieu);
				break;
				
			case 3:
				int tich= 1;
				tich = soThu1 * soThu2;
				System.out.println(soThu1 + " * " + soThu2 + " = " + tich);
				break;
				
			case 4:
				int thuong = 1;
				thuong = soThu1 / soThu2;
				System.out.println(soThu1 + " / " + soThu2 + " = " + thuong);
				break;
			default:
				System.out.println("Vui long chon lai!!");
				break;
			}
		}while (luaChon != 0);
		
	}



}
