public class Operadores_objetos {

    public static void main(String[] args) {
        
        String nomeUm = "Adriana";
        String nomeDois = "Adriana";
        String nomeTres = new String ("Adriana");

        System.out.println(nomeUm == nomeDois);

        System.out.println(nomeUm == nomeTres);

        //Neste caso o resultado foi falso, pois temos 2 objetos gravados na memoria. Sendo assim, precisa 
        // fazer a comparação do conteudo

        System.out.println(nomeUm.equals(nomeDois));

        // Para comparar os conteudos utilizamos o metodo equals. Para objetos e textos recomendavel o equals

    }
    
}
