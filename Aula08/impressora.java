package Aula08;

public class impressora {
    public void exibir(double x){
        System.out.println(x);
    }

    public void exibir(double x, double y){
        System.out.println("x: " + x + " y: " +  y);
    }

    public void exibir(double x, String y){
        System.out.println("x: " + x + " y: " +  y);
    }

    public void exibir(String x, double y){
        System.out.println("x: " + x + " y: " +  y);
    }

    public void exibir(String x, String y){
        System.out.println("x: " + x + " y: " +  y);
    }
}
