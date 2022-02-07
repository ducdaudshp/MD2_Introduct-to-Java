import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        float width;
        float height;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Chiều dài: ");
        width=scanner.nextFloat();
        System.out.print("Chiều rộng: ");
        height= scanner.nextFloat();
        float area=width*height;
        System.out.println("Diện tích HCN = "+area);
    }
}
