import java.util.ArrayList;
import java.util.Scanner;

public class bai4 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Hoàng Lê Quý An");
        names.add("Lương Gia Khánh");
        names.add("Nguyễn Tuấn Kiệt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        String inputName = scanner.nextLine();
        if (names.contains(inputName)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
