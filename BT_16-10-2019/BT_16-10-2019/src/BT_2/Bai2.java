package BT_2;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int size;
		System.out.print("Nhập vào số lượng phần tử: ");
		size = scan.nextInt();
		int a[] = new int[size];
	
		for(int i = 0; i < a.length; i++)
		{
			System.out.print("Nhập vào phần tử thứ " + i + " : ");
			a[i] = scan.nextInt();
		}
		
		Bai2 sn = new Bai2();
		System.out.println("Gía trị nhỏ nhất trong mảng là: " + sn.min(a));
		System.out.print("Nhập vào giá trị cần tìm phần tử trong mảng: ");
		int k = scan.nextInt();
		if(find(a, k) == 0) System.out.println("Không tìm thấy giá trị xuất hiện đầu tiên trong mảng");
		else System.out.println("Gía trị phần tử xuất hiện đầu tiên trong mảng của "  + k + " là " + sn.find(a, k));
		
		System.out.print("Tổng của tất cả phần tử trong mảng: " + sn.sumArray(a));
		System.out.print("\nMảng có các giá trị là: ");
		sn.printArray(a);
		System.out.print("\nMảng đối xứng: ");
		sn.reverseArray(a);
	}
	
	
	//Tra ve gia tri nho nhat luu tru trong mang
	public static int min(int mang[])
	{
		 int min = mang[0];
		 for(int i = 0; i < mang.length; i++)
		 {
			 if(mang[i] < min)
				 min = mang[i];
		 }
		 return min;
	}
	
	//Tra ve vi tri xuat hien dau tien cua gia tri trong mang
	public static int find(int mang[], int value)
	{
		int flag = 1;
		for(int i = 0; i < mang.length; i++)
		{
			if(mang[i] == value) 
			{
				flag = i;
				break;
			}
		}
		return flag;
	}
	
	//Tra ve tong cua tat ca phan tu trong mang
	public static int sumArray(int mang[])
	{
		int tong = 0;
		for(int i = 0; i < mang.length; i++)
		{
			tong += mang[i];
		}
		return tong;
	}
	
	// In cac gia tri duoc luu trong mang
	public void printArray(int mang[])
	{
		for(int i = 0; i < mang.length; i++)
		{
			System.out.print(mang[i] + "  ");
		}
	}
	
	// Tra ve 1 mang moi luu tru cac phan tu cua mang duoc dua lam doi so
	public void reverseArray(int mang[])
	{
		for(int i = 0, j = mang.length - 1; i <= j; i++, j--)
		{
			int tam = mang[i];
			mang[i] = mang[j];
			mang[j] = tam;
		}
		
		for(int i = 0; i < mang.length; i++) {
			System.out.print(mang[i] + "  ");
		}
	
	}
	

}
