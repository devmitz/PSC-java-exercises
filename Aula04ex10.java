/*10. Escreva um algoritmo que receba o preço de um produto e um código de pagamento.
Calcule o que deve ser pago por um produto, considerando o preço e a escolha da condição de
pagamento. Utilize os códigos 1, 2, 3 ou 4, que representam as condições a seguir:
1- À vista em dinheiro ou cheque, recebe 10% de desconto
2- À vista no cartão de crédito, recebe 15% de desconto
3- Em duas vezes, preço normal de etiqueta sem juros
4- Em duas vezes, preço normal de etiqueta mais juros de 10% */

import java.util.Scanner;

public class Aula04ex10 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner (System.in);

        System.out.println("Digite o preço do produto.");
        double precoProduto = leitor.nextInt();
        System.out.println("    ");
        System.out.println("Digite o código de pagamento de 1 a 4: ");
        System.out.println("    ");
        System.out.println("Código de pagamento 1: À vista em dinheiro ou cheque, recebe 10% de desconto ");
        System.out.println("Código de pagamento 2: À vista no cartão de crédito, recebe 15% de desconto");
        System.out.println("Código de pagamento 3: Em duas vezes, preço normal de etiqueta sem juros");
        System.out.println("Código de pagamento 4: Em duas vezes, preço normal de etiqueta mais juros de 10%");
        
        int codigoPagamento = leitor.nextInt();
        System.out.println("    ");
        double precoPagamento1 = precoProduto - (precoProduto * 0.10);
        double precoPagamento2 = precoProduto - (precoProduto * 0.15);
        double precoPagamento3 = precoProduto / 2 ;
        double precoPagamento4 = (precoProduto * 1.10) / 2;
        
        if(codigoPagamento == 1) {
            System.out.println("O preço do produto fica de : " + precoProduto + " para o total de: R$ " + precoPagamento1) ;
        } else if(codigoPagamento == 2) {
            System.out.println("O preço do produto fica de : " + precoProduto + " para o total de: R$ " + precoPagamento2) ;
        }else if(codigoPagamento == 3) {
            System.out.println("O preço do produto fica de : " + precoProduto + " para o total de duas vezes de: R$ " + precoPagamento3) ;
        }else if(codigoPagamento == 4) {
            System.out.println("O preço do produto fica de : " + precoProduto + " para o total de duas vezes de: R$ " + precoPagamento4) ;
        } else {
            System.out.println("Código de pagamento inválido.") ;
        }
    }
}
