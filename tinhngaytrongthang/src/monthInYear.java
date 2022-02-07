import java.util.Scanner;

public class monthInYear {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chọn tháng");
        int month =scanner.nextInt();
        switch (month){
            case 2:
                System.out.println("Tháng có 28 hoặc 29 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng có 30 ngày");
                break;
            default:
                System.out.println("Không có tháng đã chọn");
                break;
        }
    }
}
