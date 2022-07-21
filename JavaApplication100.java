/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;
import java.util.Arrays;
/**
 *
 * @author HP
 */
public class JavaApplication100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] A = { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
 
        rightRotate(A, k);
 
        System.out.println(Arrays.toString(A));
    }
     public static void rightRotateByOne(int[] A)
    {
        int last = A[A.length - 1];
        for (int i = A.length - 2; i >= 0; i--) {
            A[i + 1] = A[i];
        }
 
        A[0] = last;
    }
     public static void rightRotate(int[] A, int k)
    {
        for (int i = 0; i < k; i++) {
            rightRotateByOne(A);
        }
    }
}
