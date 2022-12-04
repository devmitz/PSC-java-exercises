public class UsaElevador {

    public static void main(String[] args) {

        //Construindo um objeto

        //Instanciando a classe Elevador

        Elevador e=new Elevador();

        e.setMarca("Otis");

        e.transportar(1500); 

        System.out.println("Passageiros: "+e.getPassageiros());

        System.out.println("Carga: "+e.getCarga());

    }

}