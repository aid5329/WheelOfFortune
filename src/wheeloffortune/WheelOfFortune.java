/*
* CMPSC 261, Section 1
* Fall 2016
* Instructor: Phil O'Connell
* Student: Phil O'Connell 
* ID: pxo4
*/
package wheeloffortune;

import java.util.Scanner;

public class WheelOfFortune {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
        String userInput = " ";

        System.out.println("Please enter Spin The Wheel, Buy a Vowel, Solve the Puzzle, or Quit The Game");
        userInput = keyboard.nextLine();

        System.out.println("You selected: " + userInput);

        System.out.println("Enter a letter");
        userInput = keyboard.nextLine();

        System.out.println("You Entered: " + userInput);

        System.out.print("Enter a letter: ");
        String s = " ";

        char ch = Character.toUpperCase(s.charAt(0));
        if (ch > 'Z' || ch < 'A') {
            System.out.println(s + " is an invalid input");
          System.exit(1);
        }
        
        System.out.println("If you would like to test, enter TEST");
        userInput = keyboard.nextLine();
    
        if (ch > 'Z' || ch < 'A') {
            System.out.println(s + " is an invalid input");
            System.exit(1);
        }
    }
  }
  

