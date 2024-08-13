public abstract  class Animal {

    protected int poids;
    protected String couleur;

    public void boire(){
        System.out.println("Je bois de l'eau et je suis un animal");
    };
    abstract void deplacement();
    abstract void crier();
    public void manger(){
        System.out.println("Je mande de la viande et je suis un animal");
    };
    public String toString(){
        return "je suis un objet de la classe " + this.getClass()+ " Mon poid est de " + poids + " Kg et ma couleur est " + couleur;

    }
}
