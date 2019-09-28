package Bai_1;
import java.util.Scanner;

public class Bai_1 {
	public static void main(String[] args) {
		int a, b, c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao so thu nhat: ");
		a = scan.nextInt();
		System.out.println("Nhap vao so thu hai: ");
		b = scan.nextInt();
		System.out.println("Nhap vao so thu ba: ");
		c = scan.nextInt();

		
		if (a > b && a > c)
			System.out.println("So lon nhat trong 3 so vua nhap la: " + a);
		else if (b > a && b > c)
			System.out.println("So lon nhat trong 3 so vua nhap la: " + b);
		else
			System.out.println("So lon nhat trong 3 so vua nhap la: " + c);

	}
}
