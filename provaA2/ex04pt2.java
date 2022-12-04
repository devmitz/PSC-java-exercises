public class ex04pt2 {
    class Agenda {
        int dia;
        int mes;
        String anotacao;

        void anote(int d, int m, String nota){
            dia = d;
            mes = m;
            anotacao = nota;
            validaData();
        }

        void validaData(){
            if((dia < 1) || (dia > 31) || (mes < 1) || (mes > 12)){
                dia = 0;
                mes = 0;
                anotacao = "anotação não inserida devido a data inválida.";
            }
        }

        void mostraAnotacao(){
            System.out.println(dia + " " + mes + ": " + anotacao);
        }
    }
}
