import java.util.Scanner;

public class largestOfThree {
    public static void main(String[] args) {
        System.out.println("enter three number");

        Scanner s=new Scanner(System.in);

        int x=s.nextInt();
        int y=s.nextInt();
        int z=s.nextInt();

        if (x >= y && x>= z){
            System.out.println("x is the largest number");
        }

        else if ( y>=x && y>=z ){

            System.out.println("y is the largest number");
        }

        else{

            System.out.println("z is the largest number");
        }
    }
}
