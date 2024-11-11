/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inpututils;

import java.util.Scanner;

/**
 *
 * @author Aleixo
 */
public class InputUtils {
    /**
     * Aks user to enter text
     * if not text , repeat prompt
     * @param prompt The question or prompt to the user
     * @return somo valid text form user as a String
     */
    public String askUserForText(String prompt){
        
        Scanner myKb = new Scanner(System.in);
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter text only!");
            userInput = myKb.nextLine();
            
        } while (!userInput.matches("[a-zA-Z!.?', ]+")); // repeat until is true
        
        return(userInput);
    }
    
    /**
     * Aks user to enter int value based on a prompt
     * if not an int then keep asking
     * @param prompt The prompt for the user
     * @return an int value entered by user
     */
    
    public String askUserForInt(String prompt){
        Scanner myKb = new Scanner(System.in);
        String userInput;
        
        do {
            System.out.println(prompt);
            System.out.println("You must enter numbers only!");
            userInput = myKb.nextLine();
           
        } while (!userInput.matches("[0-9]+")); // repeat until is true
        
        int number = Integer.parseInt(userInput); // Converte pra um int
        return("Double that is " + number*2);
    }
    
    public Int askUserForInt(String prompt, int maxValue){
        Scanner myKb = new Scanner(System.in);
      
        int userInput = maxValue +1;
        do {
            System.out.println(prompt);
            System.out.println("Enter some number (max value is: "  + maxValue +")"); // Ask at least 1 time
            
            try{
                userInput = myKb.nextInt();
            }
            catch (Exception e){
                System.out.println("This was not a number!");
                myKb.nextLine(); // to prevents infinite loop
            }
        
        } while (userInput > maxValue);// repeat until is true
        return(userInput);
    }
    
    
}
