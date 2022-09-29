/*
Project 0
Author: Luiz Felipe Lemos
Date: 02/16/2022
*/

import javax.swing.*;

/**
 * Simple class testing J Option Panels w/ user inputs and CS111 concepts.
 * Reads a user-input string and outputs the number of upper case and lower case
 * e's in a window.
 */
public class Project0 {
    public static void main (String[] args){
        String input; // User input 
        int num_e, num_E; // numbers of lower case and upper case e's respectively

        // controls program runtime
        while (true){
            input = JOptionPane.showInputDialog("Please enter a sentence."); // user input
            num_e = 0; // 'e' counter
            num_E = 0; // 'E' counter

            // exits program if user inputs a variation of "stop"
            if (input.equalsIgnoreCase("stop")){
                System.exit(0);
            }
            else{
                // Checks if char is either 'E' or 'e' and increments the proper counter
                for (int i = 0; i < input.length(); i++){
                    if (input.charAt(i) == 'e')
                        num_e++;
                    else if (input.charAt(i) == 'E')
                        num_E++;
                }

                // output window
                JOptionPane.showMessageDialog(null, "Number of lower case e's: " + num_e + "\n" 
                    + "Number of upper case e's: " + num_E);
            }
        }
    }
}