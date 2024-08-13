public class Loup extends Canin{

    public Loup(){

    }
    public Loup(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("Crie de loup");

    }

    public String toString(){
        return super.toString() + " et je suis un loup";

    }


}
