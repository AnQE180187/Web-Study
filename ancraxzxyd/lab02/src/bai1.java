import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();
        try{
            System.out.println(x/y);
        }catch( ArithmeticException ex){
            System.out.println("Error: Division by zero is not allowed.");
            ex.printStackTrace();
        }
        finally {
            System.out.println(x/y);
        }
    }
}
