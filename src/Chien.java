public class Chien extends Canin{

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

}
