public class Chien extends Canin implements Rintintin{

    public Chien(){

    }
    public Chien(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("Crie de chien");
    }

    public String toString(){
        return super.toString() + " et je suis un chien";

    }

    public void faireCalin(){
        System.out.println("Je fais un calin");
    }
    public void faireLeChouille(){
        System.out.println("Je fais une lechouille");
    }
    public void faireLeBeau(){
        System.out.println("Je fais le beau");
    }

}
