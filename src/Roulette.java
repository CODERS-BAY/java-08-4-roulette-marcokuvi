import java.util.Scanner;
import java.util.Random;

public class Roulette {

    public static void menuQuestion() {
        System.out.println("Choose your Option: ");
    }

    public static int menu() {

        Scanner input = new Scanner(System.in);
        int menuOption = input.nextInt();

        switch (menuOption) {

            case 1 -> System.out.println("Choose red: ");
            case 2 -> System.out.println("Choose black: ");
            case 3 -> System.out.println("Choose a third -> 1-12: ");
            case 4 -> System.out.println("Choose a third -> 13-24 ");
            case 5 -> System.out.println("Choose a third -> 25-36 ");
            case 6 -> System.out.println("Choose a Number");

        }
        return menuOption;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("You have 1000 Coins at the beginning ");
        int chips = 1000;
        do {


            System.out.println("How much do you want to put in");
            int chipsOutput = input.nextInt();
            chips = chips - chipsOutput;
            menuQuestion();
            int guess = menu();


            switch (guess) {

                case 1 -> {

                    Random dice = new Random();
                    int diceNumber = 1 + dice.nextInt(2);
                    if (diceNumber == 1) {
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 2;
                        System.out.println("Your guess was right you choose red your current Chips: " + chips);
                    } else {
                        System.out.println("It was black current Chips: " + chips);
                    }
                }


                case 2 -> {

                    Random dice = new Random();
                    int diceNumber = 1 + dice.nextInt(2);
                    if (diceNumber == 2) {
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 2;
                        System.out.println("Your guess was right you choose black your current Chips: " + chips);
                    } else {
                        System.out.println("It was red current Chips: " + chips);
                    }
                }


                case 3 -> {
                    Random dice = new Random();
                    int diceNumber = 0;
                    for (int i = 0; i < 1; i++) {
                        diceNumber = 1 + dice.nextInt(36);
                        System.out.printf("Your Number is %d\n", diceNumber);
                    }
                    if (diceNumber >= 1 && diceNumber <= 12) {
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 3;
                        System.out.println("Current Chips " + chips);
                    } else {
                        System.out.println("Current Chips " + chips);
                    }
                }


                case 4 -> {
                    Random dice = new Random();
                    int diceNumber = 0;
                    for (int i = 0; i < 1; i++) {
                        diceNumber = 1 + dice.nextInt(36);
                        System.out.printf("Your Number is %d\n", diceNumber);
                    }
                    if (diceNumber >= 13 && diceNumber <= 24) {
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 3;
                        System.out.println("Current Chips " + chips);
                    } else {
                        System.out.println("Current Chips " + chips);
                    }
                }


                case 5 -> {
                    Random dice = new Random();
                    int diceNumber = 0;
                    for (int i = 0; i < 1; i++) {
                        diceNumber = 1 + dice.nextInt(36);
                        System.out.printf("Your Number is %d\n", diceNumber);
                    }
                    if (diceNumber >= 25 && diceNumber <= 36) {
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 3;
                        System.out.println("Current Chips " + chips);
                    } else {
                        System.out.println("Current Chips " + chips);
                    }
                }


                case 6 -> {
                    int guessNumber = input.nextInt();
                    Random dice = new Random();
                    int diceNumber = 0;
                    for (int i = 0; i < 1; i++) {
                        diceNumber = 1 + dice.nextInt(36);
                        System.out.printf("Your Number is %d", diceNumber);
                    }
                    System.out.println();
                    if (guessNumber == diceNumber) {
                        guessNumber = diceNumber;
                        System.out.println("You are lucky");
                        chips = chips + chipsOutput * 36;
                        System.out.println("Current Chips " + chips);
                    } else {
                        System.out.println("Current Chips: " + chips);
                    }
                }

                case 7 -> {
                    System.out.println("You quit with current Chips: " + chips);
                    chips = chips - chips;
                }
            }

        } while (!(chips == 0));
    }
}