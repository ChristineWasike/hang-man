
import java.util.Random;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hangman {
    List<String> myWords = Arrays.asList("cow", "silver", "phone", "core");
    Random myRandomGenerator = new Random();

    String word = myWords.get(myRandomGenerator.nextInt(myWords.size()));

    public String findLetter(String word) {

        char[] filler = new char[word.length()];
        int i = 0;

        while (i < word.length()) {
            filler[i] = '-';
            if (word.charAt(i) == ' ') {
                filler[i] = ' ';
            }
            i++;
        }
        return word;

    }

    Scanner scannedInput = new Scanner(System.in);

    ArrayList<Character> usersGuess = new ArrayList<Character>();

    char[] filler = new char[word.length()];

    int i = 0;
    int life = 5;
    
    while(i<word.length())
    {
        filler[i] = '-';
        if (word.charAt(i) == ' ') {
            filler[i] = ' ';
        }
        i++;
    }System.out.print(filler);System.out.println("      life remaining = "+life);

    Scanner s = new Scanner(System.in);

    ArrayList<Character> l = new ArrayList<Character>();

    while(life>0)
    {
        char x = s.next().charAt(0); //character input by user

        if (l.contains(x + "")) {
            System.out.println("Already entered");
            continue; //while loop continues            
        }

        l.add(x);

        if (word.contains(x + "")) {
            for (int y = 0; y < word.length(); y++) {
                if (word.charAt(y) == x) {
                    filler[y] = x;
                }

            }
        } else {
            life--; //life decreases
        }

        if (word.equals(String.valueOf(filler))) { //checking if the filler equals word
            System.out.println(filler);
            System.out.println("You won mate  !!!");
            break;
        }

        System.out.print(filler);
        System.out.println("  life remaining = " + life);

    }if(life==0)
    {
        System.out.println("You lose mate");
    }
}}
