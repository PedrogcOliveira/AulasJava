public class CaixaEletronico {

    public static void main (String [] args) {
    double saldo = 25.00;
    double valorSolicitado = 17.0;
    double valorSolicitado2 = 26.0;



    if(valorSolicitado2 < saldo) {
        saldo = saldo - valorSolicitado;
        System.out.println(saldo);    
    } else {
        System.out.println("Saldo insuficiente");
    }

}
}
