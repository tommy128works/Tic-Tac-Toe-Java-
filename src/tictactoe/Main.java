package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String gameInput = scanner.nextLine();
//        String gameInput = "XXXOOOXXX";
//        String gameInput = "XXXOO__O_";
//        String gameInput = "XOXOXOXXO";
//        String gameInput = "XOOOXOXXO";
//        String gameInput = "XOXOOXXXO";
//        String gameInput = "XO_OOX_X_";
//        String gameInput = "XO_XO_XOX";
//        String gameInput = "_O_X__X_X";
        String gameInput = "_OOOO_X_X";
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

        int XWins = 0;
        int OWins = 0;

        // check win conditions
        for (String line : conditions) {
            switch (line) {
                case "XXX":
                    XWins++;
                    break;
                case "OOO":
                    OWins++;
                    break;
            }
        }

        int XInputs = 0;
        int OInputs = 0;
        int emptyInputs = 0;

        // check inputs
        for (char c : gameInput.toCharArray()) {
            switch (c) {
                case 'X':
                    XInputs++;
                    break;
                case 'O':
                    OInputs++;
                    break;
                default:
                    emptyInputs++;
            }
        }

        System.out.println("XWins: " + XWins);
        System.out.println("OWins: " + OWins);
        System.out.println("XInputs: " + XInputs);
        System.out.println("OInputs: " + OInputs);
        System.out.println("emptyInputs: " + emptyInputs);

        // Analyze game state
        if (XWins + OWins > 1 || Math.abs(XInputs - OInputs) > 1) {
            System.out.println("Impossible");
        } else if (XWins == 1) {
            System.out.println("X wins");
        } else if (OWins == 1) {
            System.out.println("O wins");
        } else if (emptyInputs > 0) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }


    }
}