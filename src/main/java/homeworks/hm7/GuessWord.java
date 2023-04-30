package homeworks.hm7;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public void guessRandomWord(String[] words) {
        Random random = new Random();
        String secretWord = words[random.nextInt(words.length)];

        boolean isGuessed = false;
        System.out.println("System guessed the word, try to find it out! Use lowercase only!");

        char[] hashes = new char[15];
        for (int i = 0; i < hashes.length; i++) {
            hashes[i] = '#';
        }

        while (!isGuessed) {
            Scanner scan = new Scanner(System.in);
            String userInput = scan.nextLine();

            for (int i = 0; i < userInput.length(); i++) {
                char c = userInput.charAt(i);
                if (c >= 'A' && c <= 'Z') {
                    System.out.println("Please, do not use Uppercase letters!");
                }
            }

            if (userInput.equals(secretWord)) {
                System.out.println("Congratulations! You guessed the word!");
                isGuessed = true;
            } else {
                for (int i = 0; i < secretWord.length(); i++) {
                    if (i < userInput.length() && userInput.charAt(i) == secretWord.charAt(i)) {
                        hashes[i] = secretWord.charAt(i);
                    }
                }
                System.out.println(new String(hashes));
                System.out.println("Incorrectly! Try again");
            }
        }
    }


    public static void main(String[] args) {
        GuessWord player = new GuessWord();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", " pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        player.guessRandomWord(words);
    }
}
