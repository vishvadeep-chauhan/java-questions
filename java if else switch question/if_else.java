import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int reminder=n%2;

        if(reminder==0){
            System.out.println("even");
        }

        else{
            System.out.println("odd");
        } 

        System.out.println();
    }
}
