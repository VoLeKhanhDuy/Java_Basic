package BT_1;

public class Bai1 {

	public static void main(String[] args) {
		System.out.println("Tong 2 so a va b: " + add(5,2));
		System.out.println("Tich 2 so a va b: " + mult(5,2));
		System.out.println("So lon nhat la: " + max(5,2));
		System.out.println("So nho nhat la: " + min(5,2,8));
		

	}
	
	
	public static int add(int a, int b)
	{
		return a + b;
	}
	
	public static int mult(int a, int b)
	{
		return a * b;
	}
	
	public static int max(int a, int b)
	{
		int max;
		if(a > b) 
			max = a;
		else 
			max = b;
		
		return max;
	}
	
	public static int min(int a, int b, int c)
	{
		int min;
		min = a;
		if(min > b)
			min = b;
		if(min > c)
			min = c;
		
		return min;
	}
	/*
	public static int gcdt(int a, int b)
	{
		return a * b;
	}
	 */
}
