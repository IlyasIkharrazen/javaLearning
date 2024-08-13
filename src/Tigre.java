public class Tigre extends Felin{
    public Tigre(){

    }
    public Tigre(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }

    @Override
    void crier() {
        System.out.println("Crie de Tigre");
    }
    public String toString(){
        return super.toString() + " et je suis un tigre";

    }
}
