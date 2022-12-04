import ex04pt2.Agenda;

public class ex04 {
    public static void main(String args[]){
        Agenda agenda1 = new Agenda();
        Agenda agenda2 = new Agenda();
    
        agenda1.anote(12, 10, "Dia das Crianças");
        agenda2.anote(7, 9, "Independência do Brasil");

        agenda1.mostraAnotacao();
        agenda2.mostraAnotacao();
    }
}
