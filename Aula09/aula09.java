public class aula09 {
    public static void main(String args[]){
        //correção do ex 03 da prova A1;
        int N = 5;
        int contadorNumerosTotal = 0;

        String sequencia = "0 ";

        for(int i = 1; i <= N; i++ ){
            //1 até o valor de N
            for(int y = 0; y < i ; y++){
                sequencia = sequencia + i + " "; //a sequencia vai receber a sequencia + o número do momento do i.
                contadorNumerosTotal++; // apenas para fazer a contagem de quantos números foram colocados.
            }
        }
        System.out.println(contadorNumerosTotal);
        System.out.println(sequencia);

    }
}
