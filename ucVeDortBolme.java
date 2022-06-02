import java.awt.*;
import java.util.Scanner;

public class ucVeDortBolme {
    public static void main(String[] args) {
        int i,k,j=0,sum;
        Scanner in = new Scanner(System.in);
        sum=0;

        System.out.print("Sayi Gir: ");
        k= in.nextInt();

        for(i=0;i<=k;i++) {

            if (i % 3 == 0 && i % 4 == 0) {


                    System.out.println(i);
                    sum += i;



                }


            }
            System.out.println("Toplami:");
            System.out.println(sum);

            System.out.println("Ortalama:");
            System.out.println(sum/(sum/12));



    }
}
