import java.util.Scanner;
//A program that reverses all words in a sentence
public class stringReverse {

    //A method that takes a string an return a reverse of each word in the string
    public static String stringReverse(String sentence){
        StringBuilder reVerse = new StringBuilder();
        String [] split = sentence.split(" ");
        for (String word:split){
            String reversedWord = new StringBuilder(word).reverse().toString();
            reVerse.append(reversedWord + " ");

        }
        String reversedSentence = reVerse.toString();
        return reversedSentence;
    }

    public static void main(String []args){
        //Take user input
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a word: ");
        String input = reader.nextLine();

        System.out.println(stringReverse(input).toString());
    }
}
