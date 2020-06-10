/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemSoKhacNhau;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class DemSo {
    public static void main(String[] args)
    {
        int size;  
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào độ dài của mảng: ");
        size= scanner.nextInt();

        int[] array = new int[size];


        for (int i = 0; i < size; i++) {
            System.out.println("Nhập vào phần tử thứ " + i + ": ");
            array[i] = scanner.nextInt();   
        }
        
        System.out.println("Các phần tử có trong mảng là: ");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + "\t");
        } 
        
    }
    
    int DemPhanTu(int array[], int size) {
            int i, j;
            int dem=1;
            int tam=2;
            for(i=1; i<size; i++) 
            {
                for(j=0; j<i; j++) 
                {
                    if(array[j]==array[i])
                    {
                        tam = 0;
                        break;
                    } else
                        tam = 1;
                    }
                    if(tam == 1)
                        dem++;
            }
            return dem;
}

 
    
     
}
