public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Qual o canal atual : " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Qual o canal atual : " + smartTv.canal);

        System.out.println("Qual volume da TV : " + smartTv.volume);


        System.out.println("TV Ligada ? " + smartTv.ligada);
    
        System.out.println("Qual volume da TV : " + smartTv.volume);






        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.ligada);
    }
}
