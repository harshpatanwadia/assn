import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int cube = num * num * num;

        System.out.println("Cube  " + num + " is " + cube);
    }
}

