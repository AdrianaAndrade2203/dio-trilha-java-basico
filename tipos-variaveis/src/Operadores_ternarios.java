public class Operadores_ternarios {

    public static void main(String[] args) {

        //exemplo de operadores ternarios
        
        int a, b;
        a = 5;
        b = 6;

        String resultado = a == b ? "verdadeiro" : "falso";

    System.out.println(resultado);

    // ou, a mesma situação acima: 

        int c, d;
        c = 5;
        d = 5;

        String resultado2 = "";

        if (c == d)
        resultado2 = "verdadeiro";
        else
        resultado2 = "falso";

        System.out.println(resultado2);

    
    }
    
}
