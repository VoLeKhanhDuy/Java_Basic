package BT_4;
import java.util.Scanner;


public class BT_4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner scan = new Scanner(System.in);
		System.out.printf("Nhap vao n: ");
		n = scan.nextInt();
		
		if(KTSNT(n) == true)
			System.out.println("La so nguyen to");
		else
			System.out.println("Khong la so nguyen to");

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


