import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukan nilai N : ");
        int n = input.nextInt();
        
        System.out.println("Deret FizzBuzz dari 0 hingga " + n + ":");
        tampilkanDeretFizzBuzz(n);
    }

    public static void tampilkanDeretFizzBuzz(int n) {
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
