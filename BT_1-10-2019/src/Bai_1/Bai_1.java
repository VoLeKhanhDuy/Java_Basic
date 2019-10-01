package Bai_1;

public class Bai_1 {

	/*
	 Thiết kế lớp Employee với các thuộc tính: id(int), name(string), basic_sal, email, phone
	 a) Viết các get, set
	 b) Viết phương thức nhập thông tin Employee từ bàn phím
	 c) Viết phương thức tính lương tổng: "Sum_of_sal". Phương thức nhận một tham số nguyên 
	 	index: Lương tổng = basic_sal*index. Phương thức trả về lương tổng
	 d) Viết phương thức in thông tin 1 employee ra màn hình. Phương thức có tham số là employee cần in
	 e) Viết thêm 1 constructor cho phép thiết lập tất cả các giá trị thuộc tính của employee
	 		
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Employee employee2 = new Employee();
		
		System.out.println("Nhap thong tin Nhan Vien");
		employee.Nhap();

		System.out.println("Xuat thong tin Nhan Vien");
		employee.Xuat(employee);
		System.out.println("Tong luong: "+ employee.sum_Of_Sal(15000));
	
	
		
	}

}


