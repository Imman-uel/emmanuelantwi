import java.util.Scanner;

public class strLength {

    public static void main(String [] args){
    //Take user input as a word
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a word: ");
        String input = reader.nextLine();

        int strLength = input.length();
        System.out.println(strLength);
    }
}
