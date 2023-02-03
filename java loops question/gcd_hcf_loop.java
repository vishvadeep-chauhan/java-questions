//Write a program to find greatest common divisor (GCD) or lowstest common factor (LCM) of given two numbers

import java.util.*;
public class gcd_hcf_loop {
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);
        int n1 =s.nextInt();
        int n2 =s.nextInt();

        int on1=n1;
        int on2=n2;

        while (n1%n2 !=0){
            int rem =n1%n2;
            n1=n2;
            n2=rem;

        }

        int gcd =n2;
        int lcm=(on1*on2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
}
