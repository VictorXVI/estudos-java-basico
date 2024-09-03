import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Banco X");
        System.out.println("-------------------------------------------------------");
        System.out.print("Digite seu nome: ");
        String nome = scanner.next();
        System.out.print("Número da Agência: ");
        String agencia = scanner.next();
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        System.out.print("Saldo: ");
        double saldo = scanner.nextDouble();
        System.out.printf("Olá " + nome + ", obrigado por criar uma conta em nosso Banco! Sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }
}
