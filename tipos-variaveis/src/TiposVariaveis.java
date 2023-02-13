public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        // A conversão da informação recebida chama-se casting. No exemplo estamos recebendo um inteiro e 
        //convertendo a saida em um tipo short. Caso a conversão não seja realizada, a atribuição não é aceita. 

        int numero = 5;
        numero = 20;

        //Neste caso acima a variavel numero iniciou com valor de 5, porem depois foi atribuido valor de 20

        final double VALOR_PI = 3.14;
        //VALOR_PI = 5.50;

        //Quando uma variavél não puder ter seu valor alterado, deve-se declarar a palavra final antes do tipo
        // e escrever o nome defincido para variavel em CAIXA ALTA. 
    
        System.out.println(salarioMinimo);
        System.out.println(numeroCurto2);
        System.out.println(numero);
        System.out.println(VALOR_PI);
    }
}
