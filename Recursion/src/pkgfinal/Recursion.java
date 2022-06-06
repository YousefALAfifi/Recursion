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
public class Recursion {
 static int fact(int n){    
  if (n == 0)    
    return 1;    
  else    
    return(n * fact(n-1));    
 }    
 public static void Recursion(){  
  int i,fact=1;
 Scanner in = new Scanner(System.in);
     System.out.println("enter number of n");
 int number = in.nextInt();   
  fact = fact(number);   
  System.out.println("Fact of "+number+" = "+fact);    
 }    
}
