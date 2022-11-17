import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();
        int primeTest=2;
        for (int i = 0; i < number; i++) {
            boolean Prime = false;
            while (Prime==false){
                if (isPrime(primeTest)){
                    Prime=true;
                    System.out.print(primeTest+",");
                }
                primeTest++;
            }
        }
        }
        public static boolean isPrime ( int num){
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            return prime;
        }
}
