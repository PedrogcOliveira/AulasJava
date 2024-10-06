public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTv = new SmartTV();

        System.out.println(smartTv.canal);
        smartTv.mudarCanal(21);
        System.out.println(smartTv.canal);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("A TV Ligada? " + smartTv.ligada);
        System.out.println("Canal atual : " + smartTv.volume);
        System.out.println("Volume atual : " + smartTv.canal);

        smartTv.ligar();
        System.out.println("Novo status da TV -> Ligada? " + smartTv.ligada);
    }
}
