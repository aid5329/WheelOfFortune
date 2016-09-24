package wheeloffortune;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Phil O'Connell 
* ID: pxo4
 */
public class WheelOfFortune {

    private static final Scanner _keyboard = new Scanner(System.in);

    private static final List<String> _menuChoices = Arrays.asList(
            "==============================="
            + "=       Wheel of Fortune      ="
            + "===============================",
            "1.  Spin the wheel",
            "2.  Buy a vowel",
            "3.  Solve the puzzle",
            "4.  Quit the game",
            "9.  Test letter input"
    );

    private static final int _quitChoiceNumber = 4;

    private static boolean isValidMenuChoice(int choice) {
        if (choice < 1 || choice > _menuChoices.size()) {
            return false;
        }

        int index = choice - 1;
        String menuText = _menuChoices.get(index);

        return !menuText.equals("");
    }

    private static char inputLetter() {
        char letter = ' ';
        boolean finished = false;

        while (!finished) {
            System.out.print("Enter a letter: ");

            String line = _keyboard.nextLine();
            if (line.length() != 1) {
                System.out.println("Enter just one letter");
            } else {
                letter = line.charAt(0);
                if (!Character.isLetter(letter)) {
                    System.out.println("That is not a letter");
                } else {
                    finished = true;
                }
            }
        }

        return letter;
    }

    private static void gameMenu() {
        int choice = 0;
        String line = "";
        boolean quit = false;

        while (!quit) {
            System.out.println("\n===============================================================================");
            for (String menuChoice : _menuChoices) {
                if (!menuChoice.equals("")) {
                    System.out.println(menuChoice);
                }
            }
            System.out.print("Enter choice: ");
            line = _keyboard.nextLine();
            try {
                choice = Integer.parseInt(line);
            } catch (NumberFormatException nfe) {
                System.out.println("Invalid input");
                continue;
            }

            if (!isValidMenuChoice(choice)) {
                System.out.println("Not a menu choice");
                continue;
            }

            System.out.println("You chose: " + _menuChoices.get(choice - 1));
            switch (choice) {
                case _quitChoiceNumber:
                    quit = true;
                    break;
                case 9:
                    System.out.println("Your letter is: " + inputLetter());
                    break;
            }
        }

        // As a user i want to guess the letter
        String secretPhrase = "THE QUICK BROWN FOX JUMPS COVER THE LAZE DOG";
        String guesses = " "; //the user's guess
        Scanner keyboard = new Scanner(System.in);

        boolean notDone = true;
        while (notDone) {
            notDone = false;
            for (char secretletter : secretPhrase.toCharArray()) {
                if (guesses.indexOf(secretletter) == -1) {
                    System.out.println("_");
                    notDone = true;
                } else {
                    System.out.println(secretletter);
                }
            }
            System.out.print("\nEnter your lettr: ");
            String letter = keyboard.next();
            guesses += letter;
        }
        System.out.println("You guesses right!");

    }

    /*
    if(player_menu == 1) {
    player_menu++;
    spin = rand() % 25;
    cout<<endl<<"The wheel landed on: $" <<wheel[spin] << " . " << endls;

     */
    public static void main(String[] args) {
        gameMenu();

    }

    private static final int _spinChoiceNumber = 1;

    {

        Integer[] wheel = new Integer[22];

        wheel[0] = 300;
        wheel[1] = 300;
        wheel[2] = 300;
        wheel[3] = 300;
        wheel[4] = 300;
        wheel[5] = 350;
        wheel[6] = 400;
        wheel[7] = 400;
        wheel[8] = 450;
        wheel[9] = 500;
        wheel[10] = 500;
        wheel[11] = 500;
        wheel[12] = 550;
        wheel[13] = 600;
        wheel[14] = 600;
        wheel[15] = 600;
        wheel[16] = 700;
        wheel[17] = 800;
        wheel[18] = 800;
        wheel[19] = 900;
        wheel[20] = 900;
        wheel[21] = 5000;

        List<String> letterwheel = new ArrayList<>();
        letterwheel.add("You lost turn");
        letterwheel.add("Bankrupt!");

    }

    public static int getRandom(int[] array) {
        Integer wheel = new Random().nextInt(array.length);
        return array[wheel];
    }
}

