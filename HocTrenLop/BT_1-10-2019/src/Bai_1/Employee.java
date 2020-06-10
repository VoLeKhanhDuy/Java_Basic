package Bai_1;

import java.util.Scanner;

public class Employee {
	private int ID;
	private String name;
	private double basic_Sal;
	private String email;
	private int phone;
	
	public void Nhap() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhap vao  ID: ");
		ID = Integer.parseInt(scan.nextLine());
		
		System.out.println("Nhap vao  Name: ");
		name = scan.nextLine();
		
		System.out.println("Nhap vao  Basic Sal: ");
		basic_Sal =  Double.parseDouble(scan.nextLine());
		
		System.out.println("Nhap vao  Email: ");
		email = scan.nextLine();
		
		System.out.println("Nhap vao  Phone: ");
		phone = scan.nextInt();
	}
	
	public void Xuat(Employee NhanVien) {
		System.out.println("---------------------------------");
		
		System.out.println("ID: " + NhanVien.getID());
		
		System.out.println("Name: " + NhanVien.getName());
		
		System.out.println("Basic Sal: "+ NhanVien.getBasic_Sal());

		System.out.println("Email: " + NhanVien.getEmail());
		
		System.out.println("Phone: " + NhanVien.getPhone());
	}
	
	public double sum_Of_Sal(int index)
	{
		return (basic_Sal * index);
	}
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public double getBasic_Sal() {
		return basic_Sal;
	}
	public void setBasic_Sal(double basic_Sal) {
		this.basic_Sal = basic_Sal;
	}
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}
