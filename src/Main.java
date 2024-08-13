import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        direBonjour("Ilyas");
        Ville ville = new Ville("Marseille", 123232,"France");
        Capitale capital = new Capitale("Marseille", 123232,"France");
        System.out.println(ville.getNomPays() + " " + ville.getNomVille() + " " + ville.getNbreHabitant());

        ville.setNomVille("Tanger");
        ville.setNomPays("Maroc");
        ville.setNbreHabitant(73467382);

        System.out.println(capital.decrisToi());

        System.out.println(capital.getNomPays() + " " + capital.getNomVille() + " " + capital.getNbreHabitant());

    }
    public static void direBonjour(String prenom){
        System.out.println("Bonjour " + prenom);
    }
}