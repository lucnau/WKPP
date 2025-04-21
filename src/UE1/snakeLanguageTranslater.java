package UE1;
import java.util.Scanner;

public class snakeLanguageTranslater{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        String result = "";
        for (String word : words) {
            String translatedWord = translateWord(word);
            result += translatedWord + " ";
        }
        System.out.println(result.trim());
        
    }

    public static String translateWord(String word) {
        StringBuilder translated = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (c == 'a') {
                translated.append("asa");
            } else if (c == 'A') {
                translated.append("AsA");
            } else if (c == 'e') {
                translated.append("ese");
            } else if (c == 'E') {
                translated.append("EsE");
            } else if (c == 'i') {
                translated.append("isi");
            } else if (c == 'I') {
                translated.append("IsI");
            } else if (c == 'o') {
                translated.append("oso");
            } else if (c == 'O') {
                translated.append("OsO");
            } else if (c == 'u') {
                translated.append("usu");
            } else if (c == 'U') {
                translated.append("UsU");
            } else {
                translated.append(c);
            }
        }
        return translated.toString();
    }

}