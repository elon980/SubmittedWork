import java.util.Scanner;

public class ex5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check");
        int num= scanner.nextInt();
        int start = 0;
        int start1 = 1 ;
        boolean check = true;
        while(check){

            start=start+start1;
            start1= start+start1;
            if(num == start || num==start1) {
                System.out.println("the number is from Fibonacci row");
                check=false;
            }
        }

    }
}
