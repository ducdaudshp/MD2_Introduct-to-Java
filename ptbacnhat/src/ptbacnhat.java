import java.util.Scanner;

public class ptbacnhat {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("a= ");
        double a=scanner.nextDouble();
        System.out.print("b= ");
        double b= scanner.nextDouble();
        System.out.print("c= ");
        double c= scanner.nextDouble();
        if (a!=0){
            double answer=(c-b)/a;
            System.out.printf("Kết quả x=%f\n",answer);
        }
        else if (b==c){
            System.out.print("PT đúng với mọi x");
        }
        else{
            System.out.println("Vô nghiệm");
        }
    }
}
