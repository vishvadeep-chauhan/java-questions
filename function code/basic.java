import java.util.Scanner;

public class basic {
    public static int calculateSum(int num1 , int num2) {
        int sum = num1 + num2;
        
        System.out.println("Sum is :" +sum);
        return sum ;

    }


    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int sum = calculateSum(a, b);
        
    }
    
}
