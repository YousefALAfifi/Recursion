/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class recavg {
    
    static double avgRec(int a[], int i, int n)
    {
        // Last element
        if (i == n-1)
            return a[i];
      
        // When index is 0, divide sum computed so
        // far by n.
        if (i == 0)
            return ((a[i] + avgRec(a, i+1, n))/n);
      
        // Compute sum
        return (a[i] + avgRec(a, i+1, n));
    }
      
    // Function that return average of an array.
    static double average(int a[], int n)
    {
         return avgRec(a, 0, n);
    }
     
    // main function
    public static void recavg () 
    { 
             Scanner in = new Scanner(System.in);
             
             System.out.println("enter size of arry");
             int size = in.nextInt();
             int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter index to array");
            arr[i] = in.nextInt();
        }
        System.out.println("array numbers");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        int n = arr.length;
        System.out.println(" ");
        System.out.println("average of the array= "+average(arr, n));
    }
}


