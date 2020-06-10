/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemSoKhacNhau;

/**
 *
 * @author WIN10
 */
public class TimMangCon {
    
    public static void TimMangCon(int arr[], int n)
    {
        int lenght = 1;
        int max = 1;
        int start = 0;
        int end = 0;
        
        for(int i = 0; i < n-1; i++)
        {
            if(arr[i] < arr[i+1])
            {
                lenght++;
                if(lenght > max)
                {
                    max = lenght;
                    start = i+2-lenght;
                    end = i+2;
                }
            }
            else
                lenght = 1;
        }
        
        for(int i = start; i < end; i++)
        {
            System.out.print(arr[i] + "\t");
        }
    }
    
    
    public static void main(String[] args)
    {
        int a[] = {1, 2, 5 , 2, 3, 4};
        TimMangCon(a, 6);
    }
}
