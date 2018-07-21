/**
 * Created by JoRanda Chapman 
 * Date: 07/20/2018 
 *
 */

package Captstone1;

import java.util.Scanner;

public class Capstone1 {
	public static void main(String[] args) {   

        //Declare Variables 
		Scanner scnr = new Scanner(System.in);
        String[] word; 
        String vowels = ("aeiou");
        String choice;

        System.out.println("Welcome to the Pig Latin Translator!");

        do {  
        	//Prompt and read user for user to import a word to be translated 
        	System.out.println("Enter a line to be translated: "); 
            String sentence = scnr.nextLine();
            word = sentence.split(" ");
           
            
            for (int i = 0; i < word.length; i++) {    // Puts word to Lower Case  
                word[i] = word[i].toLowerCase();
            }
            
          //Validates if the first letter of the word starts with a vowel  
            char firstChar = '0';
            boolean startsWithVowel = false; 
            
            for (int j = 0; j < word.length; j++) {  
                firstChar = word[j].charAt(0);
                int vowelIndex = vowels.indexOf(firstChar);  //Find where the vowels are 
                startsWithVowel = (vowelIndex >= 0);
            }
            
            for (int i = 0; i < word.length; i++) {  
                  
                // If the English word begins with a,e,i,o,u, add way to the end of the word 
                if (startsWithVowel) {
                    System.out.println(word[i] + "way");
                
                } else { //If the English word begins with a consonant, the consonant goes to the end of the word and ay is added 
                    String restOfWord = word[i].substring(1);
                    System.out.println("" + restOfWord + firstChar + "ay");
                }
            }
            System.out.println("Translate another line? (y/n)"); //Ask user if they would like to translate another line
                 choice = scnr.nextLine();
        
        } while (choice.equalsIgnoreCase("y")); //If user input is equal to y, the program will continue  
        
      System.out.println("Have a good day, Goodbye!"); //The output that will print if user inputs n or any other character other than y
        
        scnr.close();
    }

}

//Notes to Self 
//String split separates letters, regular strings separate words ...subtrings 

/**
 * 
 * .gitignore
 * .classpath
 * .project
 * .settings
 * bin 
 *
 *
 */

