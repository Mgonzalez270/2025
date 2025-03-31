import java.util.Scanner;

public class VowelConsonantRepeat {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String continueChoice;

        do {
            System.out.print("Enter a letter: ");
            String letterStr = input.next();

            if (letterStr.length() != 1) {
                System.out.println(letterStr + " is an invalid input");
            } else {
                char letter = Character.toLowerCase(letterStr.charAt(0));

                if (Character.isLetter(letter)) {
                    if (isVowel(letter)) {
                        System.out.println(letterStr + " is a vowel");
                    } else {
                        System.out.println(letterStr + " is a consonant");
                    }
                } else {
                    System.out.println(letterStr + " is an invalid input");
                }
            }

            System.out.print("Do you want to check another letter? (yes/no): ");
            continueChoice = input.next().toLowerCase();

        } while (continueChoice.equals("yes"));

        System.out.println("Goodbye!");
        input.close();
    }

    // Helper function to check if a character is a vowel
    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}