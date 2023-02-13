public class Operadores_relacionais {

    public static void main(String[] args) {
        
        int numero1 = 3;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        String resultado2 = "";

        if (numero1 < numero2)
            resultado2 = ("Passou pelo if e a condição é verdadeira pois" + numero1 + " é menor do que" + numero2);
        else 
            resultado2 = (" È falso!");  

            
        System.out.println(resultado2);

        System.out.println(simNao);

        simNao = numero1 != numero2;

        System.out.println(simNao);

        simNao = numero1 > numero2;

        System.out.println(simNao);

    }
    
}
