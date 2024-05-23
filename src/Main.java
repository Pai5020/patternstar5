import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i, j;
        int count, N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows : ");
        N=sc.nextInt();

        for (i = 1; i <= N; i++) {

            for (count = 0; count <  i * 4 ; count++) {

                System.out.print("*");
            }
            System.out.println();
            if(i<N) {
                for (j = 1; j <= i + 1; j++) {
                    System.out.print("*");

                }
            }
            System.out.println();
        }

    }
}