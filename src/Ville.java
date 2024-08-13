public class Ville {

    protected String nomVille;
    protected String nomPays;
    protected int nbreHabitant;

    public Ville(){
        System.out.println("Création d'une ville !");
        nomVille = "Inconnu";
        nomPays = "Inconnu";
        nbreHabitant = 0;
    }

    public Ville(String ville, int nbre, String pays){
        System.out.println("Création d'une ville !");
        nomVille = ville;
        nomPays = pays;
        nbreHabitant = nbre;
    }

    public String getNomVille(){
        return nomVille;
    }
    public String getNomPays(){
        return nomPays;
    }
    public int getNbreHabitant(){
        return nbreHabitant;
    }

    public void setNomVille(String nomVille){
        this.nomVille = nomVille;
    }
    public void setNomPays(String nomPays){
        this.nomPays = nomPays;
    }
    public void setNbreHabitant(int nbreHabitant){
        this.nbreHabitant = nbreHabitant;
    }

    public String decrisToi(){
        String description;

        description = "Ville : " + this.nomVille + " Pays : " + this.nomPays + " nombre d'habitants : " + this.nbreHabitant;

        return description;
    }

}
