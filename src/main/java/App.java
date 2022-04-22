import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Enter a name");
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        Cypher cypher = new Cypher();
        System.out.println("Your Ciphered word is:");
        System.out.println(cypher.cipherWord(word));

    }
}
