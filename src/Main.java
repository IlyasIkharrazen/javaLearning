import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Animal loup = new Loup(23, "Noir");
        Chien chien = new Chien(12, "Blanc");

        Animal chat = new Chat(11, "Marron");
        Animal tigre = new Tigre(34, "Orange");
        Animal lion = new Lion(50, "Gris");

        System.out.println(loup.toString());

        chien.faireCalin();
    }
}