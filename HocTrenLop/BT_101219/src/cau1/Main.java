
package cau1;

import java.util.Scanner;

/**
 *
 * @author WIN10
 * 
 * Viết chương trình cho phép nhập vào một số nguyên dương N và thực hiện các yêu cầu sau:
 *  a/ Tính tổng các phần tử của N. Vd: 123 = 1+2+3 = 6
 *  b/ Liệt kê các ước số của N. Vd: N=6 => US = 6,3,2,1
 *  c/ Tìm các số Fibonacci nhỏ hơn N và là số nuyên tố.
 */
public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Nhập vào số nguyên bất kì: ");
        int n = scanner.nextInt();
        
        System.out.println("- Tổng các phần tử của n: " + tongCacPhanTuCuaN(n));
        System.out.print("- Các ước số của n: "); 
        lietkeCacUocSo(n);
        System.out.print("- Các số Fibonacci nhỏ hơn n và là SNT: ");
        tinhFibonacci(n);
        
        //index: 0 1 2 3 4 5 6  7  8  9
        //value: 1 1 2 3 5 8 13 21 34 55
        
    }
    
    // functions
    // a
    public static int tongCacPhanTuCuaN(int n){
        int sum = 0;
        while(n != 0){
            sum += n%10;
            n = n/10;
        }
        return sum;
    }
    
    // b
    public static void lietkeCacUocSo(int n){
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                System.out.print(" " + i);
            }
        }
    }
    
    // c
    public static int tinhFibonacci(int n){
        int arrF[] = new int[1000];
        arrF[0] = arrF[1] = 1;
        for(int i=2; i<arrF.length; i++){
            arrF[i] = (arrF[i-1])+(arrF[i-2]);
            if(soNguyenTo(arrF[i]) == true && arrF[i] < n){
                System.out.print(" " + arrF[i]);
            }
        }
        return 0;
    }
       
    public static boolean soNguyenTo(int n){
        int count=0;
        for(int i=1; i<=n; i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count == 2){
            return true;
        }
        return false;
    }
}
