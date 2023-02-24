import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = UserInput.getScanner();
        InputText.start();
        String word = scanner.nextLine();
        String reverseString = ReverseString.reverseString(word);
        PrintOutput.printString(reverseString);
    }
}
