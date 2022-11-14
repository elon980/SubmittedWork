import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Start number");
        int FirstNum = scanner.nextInt();
        System.out.println("Enter The difference between the numbers");
        int difference = scanner.nextInt();
        System.out.println("Enter amount of numbers ");
        int amount = scanner.nextInt();
        if (amount > 0) {
            System.out.println(FirstNum);
            int raw=FirstNum;

            for(int i=0;i<=amount;i++){
                raw=difference+raw;
                System.out.println(raw);
            }

        }
    }
}