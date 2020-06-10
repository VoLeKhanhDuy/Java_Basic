/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soNguyenTo;

import java.util.Scanner;

public class soNguyenTo{
   
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
         int dem = 0;
        System.out.println("Nhập m: ");
        int m = scan.nextInt();
        System.out.println("Nhập n: ");
        int n = scan.nextInt();
        
        for(int i = m+1; i < n; i++)
        {
            if(KTSNT(i))
            {
                dem++;
                System.out.print(" " + i);
            }
        }
        if(dem == 0)
            System.out.println("Không có snt nào!!1");
    }
    
    
    
    public static boolean KTSNT(int x)
    {
        if(x <= 1){return false;}
        for(int i = 2; i <= Math.sqrt(x); i++)
        {
            if(x % i == 0)
            {
                return false;
            }
        }return true;
    }
}