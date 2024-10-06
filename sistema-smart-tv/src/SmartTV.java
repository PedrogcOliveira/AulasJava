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
    }

    public void diminuirVolume() {
        volume--;
    }
}

