package homeworks.hm7;

import java.util.Random;
import java.util.Scanner;

public class GuessWord {

    public void guessRandomWord(String[] words) {
        Random random = new Random();
        String guessedWord = words[random.nextInt(words.length)];

        boolean isGuessed = false;
        final int HASHES_LENGTH = 15;
        StringBuilder hashes = new StringBuilder();
        for (int i = 0; i < HASHES_LENGTH; i++) {
            hashes.append('#');
        }

        Scanner scan = new Scanner(System.in);
        while (!isGuessed) {
            String userInput = scan.nextLine();
            boolean hasUppercase = false;

            for (char c : userInput.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    hasUppercase = true;
                    break;
                }
            }

            if (hasUppercase) {
                System.out.println("Not allowed to use uppercase letters!");
            } else if (guessedWord.equals(userInput)) {
                System.out.println("Congratulations! You guessed the word!");
                isGuessed = true;
            } else {
                boolean allLettersOpened = true;
                for (int i = 0; i < guessedWord.length(); i++) {
                    if (i < userInput.length() && userInput.charAt(i) == guessedWord.charAt(i)) {
                        hashes.setCharAt(i, userInput.charAt(i));
                    }
                    if (hashes.charAt(i) != guessedWord.charAt(i)) {
                        allLettersOpened = false;
                    }
                }
                System.out.println("You missed, try again!");
                System.out.println(hashes);

                if (allLettersOpened) {
                    System.out.println("It seems like you open all letters but not guess the word totally, we need to hide it again and set the new word!");
                    guessedWord = words[random.nextInt(words.length)];
                    hashes = new StringBuilder();
                    for (int i = 0; i < HASHES_LENGTH; i++) {
                        hashes.append('#');
                    }
                }
            }
        }
        scan.close();
    }


    public static void main(String[] args) {
        GuessWord player = new GuessWord();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
                "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak",
                "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear",
                "pepper", "pineapple", "pumpkin", "potato"};

        player.guessRandomWord(words);
    }
}
