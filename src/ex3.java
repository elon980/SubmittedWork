import java.util.Scanner;

public class ex3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num;
        boolean check=true;
        do{
            System.out.println("Enter Number");
            num= scanner.nextInt();
            if(num>3 && num%2 != 0)
                 break;
        } while (check=true);
        for (int i=1;i<=num;i++){

            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            i++;
            System.out.println(" ");
        }
        for (int i=num*2;i>num;i--){
            for (int j=num;j<i;j++){
                System.out.print("*");

            }
            i--;
            System.out.println(" ");
        }

    }
}
