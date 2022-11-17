import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check");
        int num= scanner.nextInt();
        int firstTerm = 0;
        int secondTerm = 1 ;
        int thrirdTerm= 0;
        while(thrirdTerm<num){
            thrirdTerm=firstTerm+secondTerm;
            firstTerm= secondTerm;
            secondTerm=thrirdTerm;
        }
            if(num == thrirdTerm) {
                System.out.println("the number is from Fibonacci series");
        }
            else
                System.out.println("the num is not from fibonaci series");
    }
}
