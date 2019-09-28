package BaiTap4;

import java.util.Scanner;

public class BT_4 {
	/*
	 * VIET CHUONG TRINH TINH GIA TRI F:F(0) = 1, F(1) = 1
	 * F(n) = F(n-1) + F(n-2)
	 */
	public static void main(String[] args) {
		int giaTriCanTinh;
		Scanner scan = new Scanner(System.in);
		
		do{
			print("Nhap vao gia tri can tinh Fibonaci: ");
			giaTriCanTinh = scan.nextInt();
			if (giaTriCanTinh < 0) print("Vui long nhap lai!!");
		}while(giaTriCanTinh < 0);
		
		

		print("F(" + giaTriCanTinh +") = " + fibonaci(giaTriCanTinh));
	

	}
	
	public static int fibonaci(int viTri)
	{
		int giaTriTruoc = 1, giaTriSau= 1, tam = 0;
		if(viTri == 0 || viTri == 1)
			return 1;
		for(int i = 2 ; i <= viTri; i++)
		{
			tam = giaTriTruoc + giaTriSau;
			giaTriTruoc = giaTriSau;
			giaTriSau = tam;
		}
		return tam;
		
	}

	public static void print (String content)
	{
		System.out.println(content);
	}

}
