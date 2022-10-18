public class sobrecarga {
    public static void main(String args[]){
        
    }

    //sobrecarga

    public int soma(int a, int b){
    return a + b;
    }

    public int soma(String a, int b){
        return Integer.parseInt(a) + b;
    }

    public int soma(int a, String b){
        return a + Integer.parseInt(b);
    }

    public int soma(int a, int b , int c){
        return a + b + c;
    }

    public double soma(double a, double b){
        double res = a + b;
        return res;
    }

}

