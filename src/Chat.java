public class Chat extends Felin{

    public Chat(){

    }
    public Chat(int poids, String couleur){
        this.poids = poids;
        this.couleur = couleur;
    }
    @Override
    void crier() {
        System.out.println("Crie de chat");
    }
    public String toString(){
        return super.toString() + " et je suis un chat";

    }
}
