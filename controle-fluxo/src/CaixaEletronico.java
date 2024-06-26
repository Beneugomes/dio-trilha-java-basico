public class CaixaEletronico {
    public static void main(String[] args) {
        double saldoAtual = 25.0;
        double valorSolicitado = 15.0;

        if(valorSolicitado < saldoAtual) {
        saldoAtual = saldoAtual - valorSolicitado;

        System.out.println(saldoAtual);

        }else{
        System.out.println("Saldo Insuficiente! " + saldoAtual);
        }
    }
}
