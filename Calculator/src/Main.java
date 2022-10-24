import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter the number:");

        Scanner inp = new Scanner(System.in);

        int n = inp.nextInt();

        int sum;

        if(0 <= n && n <= 10000){
            for (int i = 1; i <= 10; i++) {

                System.out.println(i + "*" + n + "=" + (sum = n * i));

            }

        }


    }
}