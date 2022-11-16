import java.util.Scanner;

public class ex6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt();
        int sum = 0;
        while (num!=0){
            sum=num%10 + sum;
            num=num/10;
        }
        System.out.println("The sum of numbers is: "+sum);
    }
}
