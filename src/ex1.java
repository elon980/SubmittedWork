import java.util.Scanner;

public class ex1 {

    public static Scanner reader = new Scanner(System.in);
    public static void main (String[]args){
        double a,b,c,x1,x2;
        System.out.print("הקלד את איבר א: ");
        a = reader.nextDouble();
        System.out.println("");
        System.out.print("הקלד את איבר ב: ");
        b = reader.nextDouble();
        System.out.println("");
        System.out.print("הקלד את איבר ג: ");
        c = reader.nextDouble();
        System.out.println("");
        double d = b*b-4*a*c;
        if(d<0)
            {
                System.out.print("למשוואה אין פיתרון");
            }
            if (d == 0) {
                System.out.print("למשוואה יש פתרון אחד");
                double oneAnswer;
                oneAnswer = (b * -1) / (2 * a);
                System.out.print("");
                System.out.print(oneAnswer);

            }
            if(d>0) {
                System.out.print("למשוואה יש 2 פתרונות");
                double e = Math.sqrt(d);
                x1 = (-b + e) / (2*a);
                x2 = (-b - e) / (2*a);
                System.out.println("x1=" + x1);
                System.out.println("");
                System.out.print("x2=" + x2);
            }
    }
}