package homeworks.hm7;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    public void guessRandomWord(String[] words) {
        Random random = new Random();
        String guessWord = words[random.nextInt(words.length)];

        boolean isGuessed = false;
        System.out.println("System guessed a word, try to find it out. Use lowercase only!");

        char[] hashes = new char[15];
        Arrays.fill(hashes, '#');

        Scanner scan = new Scanner(System.in);

        while (!isGuessed) {
            String userInput = scan.nextLine();
            boolean hasUppercase = false;

            for (int i = 0; i < userInput.length(); i++) {
                if (userInput.charAt(i) >= 'A' && userInput.charAt(i) <= 'Z') {
                    hasUppercase = true;
                    break;
                }
            }

            if (hasUppercase) {
                System.out.println("Not allowed to use uppercase letters!");
            } else if (guessWord.equals(userInput)) {
                System.out.println("Congratulations! You guessed the word!");
                isGuessed = true;
            } else {
                boolean allLettersOpened = true;
                for (int i = 0; i < guessWord.length(); i++) {
                    if (i < userInput.length() && userInput.charAt(i) == guessWord.charAt(i)) {
                        hashes[i] = userInput.charAt(i);
                    }
                    if (hashes[i] != guessWord.charAt(i)) {
                        allLettersOpened = false;
                    }
                }
                System.out.println("You missed, try again!");
                System.out.println(new String(hashes));
                if (allLettersOpened) {
                    System.out.println("It seems like you open all letters but not guess the word totally, we need to hide it again and set the new word!");
                    guessWord = words[random.nextInt(words.length)];
                    Arrays.fill(hashes, '#');
                }
            }
        }
        scan.close();
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
