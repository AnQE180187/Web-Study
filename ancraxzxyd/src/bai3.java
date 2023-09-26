import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scd = new Scanner(System.in);
        System.out.print("NHập điểm chuyên cần: ");
        double d = scd.nextDouble();
        System.out.print("NHâp điểm giữa kỳ: ");
        double e = scd.nextDouble();
        System.out.print("Nhập điểm cuối kỳ: ");
        double f = scd.nextDouble();
        double diemhocphan = (d*1 + e*2 + f*7)/10;
        if(d < 0|| d >10|| e<0||e>10||f<0||f>10){
            System.out.println("Điểm Không hợp lệ");
        }else{
            System.out.println("Diểm học phần của fen: "+ diemhocphan);
        }
    }
}
