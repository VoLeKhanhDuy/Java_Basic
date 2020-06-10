/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

import java.util.Scanner;

/*
Khai báo biến toàn cục là 1 arr chứa các đối tượng Employee

Viết phương thức nhập 1 Nhân viên từ bàn phím. Phương thức trả về nhân viên vừa nhập

Viết phương thức nhập vào 1 mảng chứa các đối tượng nhân viên 

Viết phương thức tìm kiếm nhân viên tham số là 1 mảng chứa nhân viên, tham số thứ 2 là 1 giá trị số integer. 
Phương thức trả về đối tượng nhân viên đầu tiên có trong mảng mà có id = với tham số 2

Viết phương thức sắp xếp mảng, phương thức này nhận tham số là 1 mảng chứa các nhân viên. 
Phương thức sẽ sắp xếp các nhân viên trong mảng này theo id tăng dần 

 */
class EmployeeService {

    
    private Employee arrEmployee[];
    
    int soLuongNhanVien;
     
     
    public Employee[] getArrEmployee() {
        return arrEmployee;
    }
    
    public Employee nhapNhanVien()
    {
        Employee employ = new Employee();
        employ.nhapEmployee();
        return employ;
    }
    
    public void nhapMangNhanVien()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập vào số lượng nhân viên: ");
        soLuongNhanVien = scan.nextInt();
        arrEmployee = new Employee[soLuongNhanVien];
        for(int i = 0; i < soLuongNhanVien; i++)
        {
            System.out.println("Nhập vào thông tin nhân viên thứ " + (i+1));
            arrEmployee[i] = new Employee();
            arrEmployee[i].nhapEmployee();
        }
    }
    
    public void xuatMangNhanVien()
    {
        for(int i = 0; i < soLuongNhanVien; i++)
        {
            arrEmployee[i].xuatEmployee(arrEmployee[i]);
        }
    }
        
   
    
    public Employee timKiemNhanVien(Employee arrEmployee[], int id)
    {
        for(int i = 0; i < arrEmployee.length; i++)
        {
            if(arrEmployee[i].getId() == id)
                return arrEmployee[i];
        }
        return null;
    }
    
    public void sapXepMang(Employee arrEmployee[])
    {
        for(int i = 0; i < arrEmployee.length - 1; i++)
        {
            for(int j = i + 1; j < arrEmployee.length; j++)
            {
                if(arrEmployee[i].getId() > arrEmployee[j].getId())
                {
                    Employee tam = new Employee();
                    tam = arrEmployee[i];
                    arrEmployee[i] = arrEmployee[j];
                    arrEmployee[j] = tam;
                }
            }
        }
       // return arrEmployee;
    }
}
