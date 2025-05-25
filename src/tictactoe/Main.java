package tictactoe;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String gameInput = scanner.nextLine();
        String gameInput = "XXXOOOXXX";
        scanner.close();

        if (gameInput.length() != 9) {
            System.out.println("Invalid input: incorrect length");
            System.exit(1);
        }

        System.out.println(gameInput);

        System.out.println("---------");
        System.out.println("| " + gameInput.charAt(0) + " " + gameInput.charAt(1) + " " + gameInput.charAt(2) + " |");
        System.out.println("| " + gameInput.charAt(3) + " " + gameInput.charAt(4) + " " + gameInput.charAt(5) + " |");
        System.out.println("| " + gameInput.charAt(6) + " " + gameInput.charAt(7) + " " + gameInput.charAt(8) + " |");
        System.out.println("---------");
    }
}