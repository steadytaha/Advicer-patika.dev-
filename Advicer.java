import java.util.Scanner;
public class Advicer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int c;
        System.out.print("Dereceyi giriniz(C): ");
        c = input.nextInt();
        if (c<5){
            System.out.println("Kayak yapmaya gidebilirsin!");
        }else if(c>=5 && c<15){
            System.out.println("Sinemaya gidebilirsin!");
        }else if(c>=15 && c<25){
            System.out.println("Piknik yapmaya gidebilirsin!");
        }else if(c>=25){
            System.out.println("Yüzmeye gidebilirsin!");
        }
    }
}
