import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter number:-");
        int x = s.nextInt();

        // System.out.println("enter a string:-");
        // String y=s.next();

        System.out.println("enter second string:-");
        String z = s.nextLine();

        System.out.println("enter a byte:-");
        Byte a = s.nextByte();

        System.out.println("enter short:-");
        Short b = s.nextShort();

        System.out.println("enter a long:-");
        Long c = s.nextLong();

        System.out.println("enter a float:-");
        Float d = s.nextFloat();

        System.out.println("enter a double:-");
        Double e = s.nextDouble();

        System.out.println("here is integer:-" + x + " here is a string:-"  + z + "here is byte :-" + a + "enter short:-"
                + b + "enter a long:-" + c + "enter a float:-"+d + "enter a double:-" +e );

    }
}
