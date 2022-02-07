import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,BMI;
        System.out.println("Nhập cân nặng");
        weight= scanner.nextDouble();
        System.out.println("Nhập chiều cao");
        height= scanner.nextDouble();
        BMI= weight/Math.pow(height,2);
        System.out.printf("%-20s%s","BMI","Kết quả\n");
        if (BMI <18){
            System.out.printf("%-20.2f%s",BMI,"Gầy");
        }
        else if(BMI<25){
            System.out.printf("%-20.2f%s",BMI,"Bình thường");
        }
        else if (BMI<30){
            System.out.printf("%-20.2f%s",BMI,"Thừa cân");
        }
        else{
            System.out.printf("%-20.2f%s",BMI, "Béo phì");
        }
    }

}
