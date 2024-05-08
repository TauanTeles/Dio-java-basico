public class CaixaEletronico {
    
    public static void main(String[] args) {
        double saldo = 25.0;
       double valorSolicitado = 27.0;

       if(valorSolicitado < saldo){  // toda vez que temos mais de uma condição abre um novo bloco
        saldo = saldo - valorSolicitado;
        System.out.println("novo saldo: " + saldo);

       }else 
        System.out.println("Saldo insuficiente");

        
    }
}
