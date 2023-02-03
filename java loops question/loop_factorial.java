
//question :-Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. E.g.-
//        4! = 1*2*3*4 = 24
//        3! = 3*2*1 = 6
//        2! = 2*1 = 2
//        Also,
//        1! = 1
//        0! = 0
//        Write a Java program to calculate factorial of a number.

import java.util.*;

public class loop_factorial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
            System.out.println("Enter a number");
            int x = s.nextInt();
            int fact=1;
            for(int i=x; i>=1 ;i--){
                fact = fact*i;
            }
            System.out.println("Factorial is "+fact);
        }
    }