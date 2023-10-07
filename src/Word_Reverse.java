import java.util.Scanner;
public class Word_Reverse {
    public static void main(String[] args) {

        //define a scanner object called userInput
        Scanner userInput = new Scanner(System.in);

        // ask user to input a word
        System.out.println("Enter a word");

        String myWord = userInput.nextLine();

        for (int i=myWord.length()-1; i>=0; i--){
            System.out.print(myWord.charAt(i));
        }
    }
}