package BT_3;

import java.util.Scanner;

public class BT_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c;
		float delta = 0;
		Scanner scan = new Scanner (System.in);
		System.out.println("Nhap vao a: ");
		a = scan.nextInt();
		System.out.println("Nhap vao b: ");
		b = scan.nextInt();
		System.out.println("Nhap vao c: ");
		c = scan.nextInt();
		if(a == 0)
		{
			if(b == 0)
				System.out.printf("Phuong trinh vo nghiem!!");
			else System.out.printf("Phuong trinh co 1 nghiem x = " + (float)((-c)/b));
		}
		else
		{
				delta = b * b - 4*a*c;
				if(delta < 0)
					System.out.println("Phuong trinh vo nghiem!!");
				else if (delta > 0)
					System.out.println("Phuong trinh co 2 nghiem phan biet x1 = " + (float)(((-b)+Math.sqrt(delta))/(2*a)) + "\tx2 = " + (float)(((-b)-Math.sqrt(delta))/(2*a)));
				else 
					System.out.println("Phuong trinh co nghiem kep x1 = x2 = " +(float)((-b)/(2*a)));
		
		}
	}
}

