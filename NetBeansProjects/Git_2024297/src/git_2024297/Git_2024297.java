/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package git_2024297;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Aleixo
 */
public class Git_2024297 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        System.out.println("Rafael-2024297");
        
        Scanner myKb = new Scanner(System.in); // declare scanner to get the input
        String userName; // declare a variable to store the 1 input
        int userOption; // declare a variable to store the 2 input
        
        do { // do this piece of code at least one time
            System.out.println("Enter your name(Numbers not allowed!): "); // messege to the user
            userName = myKb.nextLine(); // store the input inside the variable "userName"
            
            if (!userName.matches("[a-zA-Z ]+")){ // check if the input is valid(only text) OBS: there is a space after "Z" inside the regex
                System.out.println("Input invalid! Use text only!"); // error message 
                
            } else {
                // New massage 
                System.out.println("""
                    Now select one of this options:
                    [1] Transform your name to lower case
                    [2] Transform your name to upper case
                    [3] Shuffle your name
                    [4] Separate your name by letters""");
            
                userOption = myKb.nextInt(); // gets teh input from the user and store the value inside "userOption"
                
                // declare a switch for the diffrent options 
                switch (userOption){
                    case 1: 
                        userName = userName.toLowerCase(); // converts the userName to lowercase
                        System.out.println("Lowercase name: "+ userName);
                        break;
                    
                    case 2:
                        userName = userName.toUpperCase(); // converts the userName to uppercase
                        System.out.println("Uppercase name: "+ userName);
                        break;
                    
                    case 3:
                        userName = shuffleString(userName); // use the class shufflestring
                        System.out.println("Shuffled name: "+ userName);
                        break;
                    
                    case 4:
                        String separatedName = String.join(" ", userName.split(""));// combines each character from the "userName.slip("")" array into a sigle string, separated by spaces.
                        System.out.println("Separated name: "+ separatedName);
                        break;
                }
                
            }
         
                                   
        } while (!userName.matches("[a-zA-Z ]+")); // repeat the message("Enter your name") if the input is invalid OBS: there is a space after "Z" inside the regex
    }
    
    
    /*Convert the String to a List:

        input.split("") splits each character of the string into an array of single-character strings.
        Arrays.asList() converts this array to a List<String>, which can then be shuffled.
        Collections.shuffle(characters) randomly shuffles the list.*/
    
    public static String shuffleString(String input) {
            
        List<String> characters = Arrays.asList(input.split(""));
            
        Collections.shuffle(characters);
            
        return String.join("", characters);
    }
}
    

