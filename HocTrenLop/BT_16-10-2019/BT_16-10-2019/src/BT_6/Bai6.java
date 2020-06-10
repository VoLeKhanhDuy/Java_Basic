package BT_6;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập vào số lượng phần tử của mảng: ");
		int size = scan.nextInt();
		int a[] = new int[size];
		for(int i = 0; i< a.length; i++)
		{
			System.out.print("Nhập vào giá trị thứ " + i + ": ");
			a[i] = scan.nextInt();
		}
		System.out.print("Mảng vừa nhập là: ");
		for(int i = 0; i< a.length; i++)
		{
			System.out.print(a[i] + "  ");
		}
		
		System.out.print("\nNhập vào giá trị cần tìm: ");
		int k = scan.nextInt();
		Bai6 bai6 = new Bai6();
		int kq = bai6.find(a, k);
		if(kq == -1) System.out.println("Không tìm thấy!!");
		else System.out.println("Gía trị vừa nhập nằm ở phần tử thứ: " + bai6.find(a, k));
		
		System.out.print("Nhập vào số dòng: ");
		int soDong = scan.nextInt();
		System.out.print("Nhập vào số cột: ");
		int soCot = scan.nextInt();
		int b[][] = new int[soDong][soCot];
		
		for (int i = 0; i < soDong; i++)
		{
	        for (int j = 0; j < soCot; j++) {
	            System.out.print("Nhập phần tử thứ [" + i + ", " + j + "]: ");
	            b[i][j] = scan.nextInt();
	        }
	    }
		
		 System.out.println("Mảng vừa nhập: ");
		 for (int i = 0; i < soDong; i++)
		 {
		     for (int j = 0; j < soCot; j++) 
		     {
		         System.out.print(b[i][j] + "\t");
	         }
			 System.out.println("\n");   
		 }
		 System.out.print("Nhập vào giá trị cần tìm vị trí: ");
		 int k2 = scan.nextInt();
		 int kq2[] = bai6.find2(b, k2);
		 if(kq2[0] == -1) System.out.println("Không tìm thấy giá trị trong mảng!!");
		 else System.out.println("Gía trị trong mảng nằm ở vị trí: [" + kq2[0] + ", " + kq2[1] + "]");
	}
	
	public int find(int mang[], int value)
	{
		for(int i = 0; i < mang.length; i++)
		{
			if(mang[i] == value)
				return i;
		}
		return -1;
	}
	
	public int[] find2(int mang[][], int value)
	{
		int mangViTri[] = {-1, -1};
		for(int i = 0; i < mang.length; i++)
		{
			for(int j = 0; j < mang[i].length; j++)
			{
				if(mang[i][j] == value)
				{
					mangViTri[0] = i;
					mangViTri[1] = j;
					return mangViTri;
				}
			}
		}
		return mangViTri;
	}

}
