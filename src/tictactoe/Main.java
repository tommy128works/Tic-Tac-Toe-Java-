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

        // Print gameboard
        System.out.println("---------");
        System.out.println("| " + gameInput.charAt(0) + " " + gameInput.charAt(1) + " " + gameInput.charAt(2) + " |");
        System.out.println("| " + gameInput.charAt(3) + " " + gameInput.charAt(4) + " " + gameInput.charAt(5) + " |");
        System.out.println("| " + gameInput.charAt(6) + " " + gameInput.charAt(7) + " " + gameInput.charAt(8) + " |");
        System.out.println("---------");

        // win conditions
        String[] conditions = new String[8];
        // 3 rows
        conditions[0] = String.valueOf(gameInput.charAt(0)) + gameInput.charAt(1) + gameInput.charAt(2);
        conditions[1] = String.valueOf(gameInput.charAt(3)) + gameInput.charAt(4) + gameInput.charAt(5);
        conditions[2] = String.valueOf(gameInput.charAt(6)) + gameInput.charAt(7) + gameInput.charAt(8);
        // 3 columns
        conditions[3] = String.valueOf(gameInput.charAt(0)) + gameInput.charAt(3) + gameInput.charAt(6);
        conditions[4] = String.valueOf(gameInput.charAt(1)) + gameInput.charAt(4) + gameInput.charAt(7);
        conditions[5] = String.valueOf(gameInput.charAt(2)) + gameInput.charAt(5) + gameInput.charAt(8);
        // 2 diagonals
        conditions[6] = String.valueOf(gameInput.charAt(0)) + gameInput.charAt(4) + gameInput.charAt(8);
        conditions[7] = String.valueOf(gameInput.charAt(6)) + gameInput.charAt(4) + gameInput.charAt(2);

        int XWins;
        int XInputs;
        int OWins;
        int OInputs;
        int emptyInputs;

        for (String line : conditions) {
            // check win conditions

            // check inputs
        }


    }
}