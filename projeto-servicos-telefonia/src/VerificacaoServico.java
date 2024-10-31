import java.util.Scanner;

public class VerificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        // Entrada do serviço a ser verificado
        System.out.println("digite o serviço a ser consultado: ");
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        System.out.println("Digite o nome do cliente e os serviços que possui: ");
        String entradaCliente = scanner.nextLine().trim();
        
       
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        // TODO: Verifique se o serviço está na lista de serviços contratados

        //O indice i começa no 1, pelo 0 se tratar do nome do cliente
        //Valida se o servico digitado está dentro do Array
        for(int i = 0; i < partes.length; i++) {           
                if (partes[i].equalsIgnoreCase(servico)) {
                    contratado = true;
                    break;
                }               
        }


        // imprime o retorno do FOR    
            if (contratado) {
                System.out.println("Sim");
            } else {
                System.out.println("Nao");
            }


        scanner.close();
    
    }

}


