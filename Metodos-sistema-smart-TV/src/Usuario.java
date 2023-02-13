public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("E qual volume ? " + smartTv.volume);
        
        System.out.println("Em que canal antes da mudança ? " + smartTv.canal);
        smartTv.mudarCanal(15);
        System.out.println("Em que canal depois da mudança ? " + smartTv.canal);

        System.out.println("A TV esta ligada ? " + smartTv.ligada);
        System.out.println("Em que canal ?" + smartTv.canal);
        System.out.println("E qual volume ? " + smartTv.volume);

        //chamando um metodo sem parametros

        smartTv.ligar ();
        System.out.println("Novo status. A TV esta ligada? " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status. A TV esta ligada? " + smartTv.ligada);

        

    }
}
