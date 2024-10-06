public class SmartTV {
    int volume = 30;
    int canal = 1;
    boolean ligada = false;

    public void ligar(){
        ligada = true;
 
    }

    public void desligada() {
        ligada =false;
    }


    public void aumentarVolume() {
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando voluem para: " +volume);
    }

    public void diminuirVolume() {
        volume--;
        System.out.println("diminuindo volume para: " +volume);
    }

    public void aumentandoCanal() {
        canal++;
        System.out.println("Aumentamos o canal para: " +canal);
    }

    public void diminuirCanal() {
        canal--;
        System.out.println("diminuímos canal para: " +canal);
    }

    public void mudarCanal(int novoCanal) {
        canal = novoCanal;
    } 
}

