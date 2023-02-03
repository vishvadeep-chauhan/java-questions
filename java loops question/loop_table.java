import java.util.Scanner;

public class loop_table {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int z=s.nextInt();
        for (int i = 1; i<=10; i++){
            System.out.println( z+ " * " +i+ "=" +(z*i));
        }

    }
}
