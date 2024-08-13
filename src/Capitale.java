public class Capitale extends Ville{

    private String monument;
    public Capitale(){
        super();
        monument = "aucun";
    }
    public Capitale(String nom, int nbreHabitant, String pays){
        super(nom, nbreHabitant, pays);
        monument = "aucun";
    }

    public String decrisToi(){
        String description;
        description = super.decrisToi() + " monument : " + this.monument;

        return description;
    }
}
