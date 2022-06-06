/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import static pkgfinal.CreateList.CircularLinkedList;
import static pkgfinal.LinkedList.LinkedList;
import static pkgfinal.LinkedList1.mixed;
import static pkgfinal.Queue.Queue;
import static pkgfinal.Recursion.Recursion;
import static pkgfinal.rec1234n.rec1234n;
import static pkgfinal.recavg.recavg;

/**
 *
 * @author pc
 */
public class Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("final project ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("by:mohammed yehia ashour");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("id:1301195595");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("please Choose the qustion:");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("1.Array Question ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("2.Stack Questions ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("3.Queue Question ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("4.Recursion Question  A");
        //: compute n!
        TimeUnit.SECONDS.sleep(1);
        System.out.println("5.Recursion Question  B");
        //compute average of array
        TimeUnit.SECONDS.sleep(1);
        System.out.println("6.Recursion Question  C");
        //compute 1+2+3+4+….n
        TimeUnit.SECONDS.sleep(1);
        System.out.println("7. Linked List");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("8.Circular Linked List");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("9.Mixed Question ");
        TimeUnit.SECONDS.sleep(1);
        System.out.println("10.Exit");
        int qustion = in.nextInt();
        switch (qustion) {
            case 1:
                q1();
                break;
            case 2:
                stack();
                break;
            case 3:
                Queue();

                break;
            case 4://: compute n!

                Recursion();
                break;
            case 5://compute average of array 
                recavg();
                break;
            case 6://compute 1+2+3+4+….n

                rec1234n();
                break;
            case 7:
                // LinkedList();
                LinkedList();
                break;
            case 8:

                CircularLinkedList();
                break;
            case 9:
                mixed();
                break;
            case 10:
                System.exit(0);
                break;
            default:
                System.out.println("You Entered a wrong number please select  number from 1 to 10 ");
        }
    }

    public static void q1() {
        //array
        int a[] = {3, 10, 7, 6, 9, 11, 20};
        int sum = 0;
        System.out.println("the array: ");
        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i] + " ");
        }

        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        System.out.println("sum:" + sum);

        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }

        }
        System.out.println("max number: " + max);
        double avg = sum / a.length;
        System.out.println("avarge:" + avg);

        for (int i = 1; i < a.length; i++) {
            if (a[i] % i == 0 || i % 1 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static void stack() {
        //stack
        Stack<Integer> stack = new Stack<Integer>();

        int[] q2 = {23, 93, 56, 92, 39};
        int size = q2.length;
        for (int i = 0; i < size; i++) {
            stack.push(q2[i]);
        }
        int[] rev = new int[size];
        for (int i = 0; i < size; i++) {
            rev[i] = stack.pop();
        }
        System.out.println("Reversed stack is ::" + Arrays.toString(rev));
    }

}
