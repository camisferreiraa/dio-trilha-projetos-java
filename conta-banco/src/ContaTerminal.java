import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
       
       System.out.print("Digite o número da conta: ");
       numero = ler.nextInt();

       System.out.print("Digite a agência: ");
       agencia = ler.next();

       System.out.print("Digite o nome do cliente: ");
       nomeCliente = ler.next();

       System.out.print("Digite o saldo: ");
       saldo = ler.nextDouble();

       System.out.println("Conta criada com sucesso!");
       System.out.println("Número da conta: " + numero);
       System.out.println("Agência: " + agencia);
       System.out.println("Nome do cliente: " + nomeCliente);
       System.out.println("Saldo: " + saldo);
    }
}
