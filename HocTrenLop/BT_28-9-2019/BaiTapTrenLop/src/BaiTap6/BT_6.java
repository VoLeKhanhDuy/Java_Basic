package BaiTap6;

import java.util.Scanner;

public class BT_6 {
	/*
	 * Viet chuong trinh tim so lon thu 2 trong mang
	 */
	public static void main(String[] args) {
	int [] mang = new int[20];
	int soPhanTu;
	Scanner scan = new Scanner(System.in);
	do{
		print("Nhap vao so phan tu: ");
		soPhanTu = scan.nextInt();
		if (soPhanTu < 0) print("Vui long nhap lai!!");
	}while(soPhanTu < 0);
	
	nhapMang(mang, soPhanTu);
	xuatMang(mang, soPhanTu);
	
	if(timMax(mang, soPhanTu) == -999)
	{
		print("Mang khong co so lon thu 2!!");
	}else
	print("So lon thu 2 trong mang la: " + timMax(mang, soPhanTu));
}
	
	public static int timMax(int mang[], int soPhanTu)
	{
		
		int max = mang[0];
		for(int i = 0; i<soPhanTu; i++)
		{
			if(max < mang[i])
				max = mang[i];
		}
		
		for(int i = 0; i < soPhanTu; i++)
		{
			for(int j = i+1; j < soPhanTu; j++)
			{
				if(mang[i] != mang[j])
					break;
				if(i == soPhanTu -2 && j == soPhanTu -1)
				{
					if(mang[soPhanTu -2] == mang[soPhanTu-1])
						return -999;
					else
						break;
				}
			}
		}
		
		int max2 = mang[0];
		//Lấy thằng không phải là max để gắn max2
		for(int i = 0; i < soPhanTu; i++)
		{
			if(mang[i] != max)
			{
				max2 = mang[i];
				break;
			}
		}
		
		for(int i = 0; i<soPhanTu; i++)
		{
			if(mang[i] > max2 && mang[i] < max)
				max2 = mang[i];
		}
		return max2;
		
	}
	
	public static void nhapMang(int mang[], int soPhanTu)
	{
		for(int i = 0; i < soPhanTu; i++)
		{
			print("Nhap vao phan tu thu " + i + ": ");
			Scanner scan = new Scanner(System.in);
			mang[i] = scan.nextInt();
		}
	}
	
	
	public static void xuatMang(int mang[], int soPhanTu)
	{
		print("Mang vua nhap la: ");
		for(int i = 0; i < soPhanTu; i++)
		{
			print("A[" + i + "]: " + mang[i]);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void print (String content)
	{
		System.out.println(content);
	}
}
