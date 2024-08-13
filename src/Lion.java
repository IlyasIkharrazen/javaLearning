public class Lion extends Felin{
    public Lion(){

    }
    public Lion(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }
    void crier() {
        System.out.println("Crie de lion");
    }
    public String toString(){
        return super.toString() + " et je suis un lion";

    }

}
