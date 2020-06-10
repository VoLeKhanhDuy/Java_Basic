/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhTong;

import java.util.Scanner;

/**
 *
 * @author WIN10
 */
public class tinhTong {
    public static void main(String [] args)
    {
        int m,n, dem = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nhập m: ");
        m = scan.nextInt();
        System.out.println("Nhập n: ");
        n = scan.nextInt();
        
        
        for(int i = m + 1; i < n; i++)
        {
            if(KTSNT(i) == true)
            System.out.println(i + "  ");
        }
        
        
    }
    public static boolean KTSNT(int num)
    {
        if(num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++)
        {
            if(num % i == 0) return false;
        }
        return true;
    }
}
