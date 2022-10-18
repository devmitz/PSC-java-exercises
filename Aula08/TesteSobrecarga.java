package Aula08;

public class TesteSobrecarga {
    public static void main(String args[]){
        
        Calculadora c = new Calculadora();

        int x = 1, y = 2, z = 3;
        String s1 = "50", s2 = "60";
        double f1 = 56.7, f2 = 0.3;

        //Teste dois valores double
        System.out.printf("%.2f %n", c.soma(f1, f2));

        //Teste dois valores inteiros
        System.out.println(c.soma(x,y));

        //Teste de um inteiro e uma String
        System.out.println(c.soma(x,s1));

        //Teste de uma String e um inteiro
        System.out.println(c.soma(s2,y));

        //Teste de dois valores String
        System.out.println(c.soma(s1, s2));

        //Teste de três valores inteiros
        System.out.println(c.soma(x,y,z));

    }
}
