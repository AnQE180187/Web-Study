import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        int a =0;
        try{
            a = sc.nextInt();
            System.out.println(a);

        }catch ( Exception e){
            System.out.println("invalid");
        }
        finally {
            System.out.println(a);
        }
    }
}
