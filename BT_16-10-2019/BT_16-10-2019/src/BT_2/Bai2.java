package BT_2;

public class Bai2 {

	public static void main(String[] args) {
		

	}
	
	
	//Tra ve gia tri nho nhat luu tru trong mang
	public static int min(int mang[], int n)
	{
		 int min = mang[0];
		 for(int i = 0; i < n; i++)
		 {
			 if(mang[i] < min)
				 min = mang[i];
		 }
		 return min;
	}
	
	//Tra ve vi tri xuat hien dau tien cua gia tri trong mang
	public static int find(int mang[], int value, int n)
	{
		for(int i = 0; i < n; i++)
		{
			if(mang[i] == value) 
				return i;
			break;
		}
		return -1;
		
	}
	
	//Tra ve tong cua tat ca phan tu trong mang
	public static int sumArray(int mang[], int n)
	{
		int tong = 0;
		for(int i = 0; i < n; i++)
		{
			tong += mang[i];
		}
		return tong;
	}
	
	// In cac gia tri duoc luu trong mang
	
	// Tra ve 1 mang moi luu tru cac phan tu cua mang duoc dua lam doi so
	

}
