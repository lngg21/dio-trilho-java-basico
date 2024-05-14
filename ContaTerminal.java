import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar e ler as informações da conta
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = sc.nextLine();

        double saldo = 0.0;
        boolean saldoValido = false;
        while (!saldoValido) {
            try {
                System.out.println("Por favor, digite o saldo:");
                saldo = sc.nextDouble();
                saldoValido = true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Por favor, insira um valor válido para o saldo.");
                sc.next(); // Limpar o buffer do Scanner
            }
        }

        // Exibir a mensagem com as informações da conta
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        sc.close();
    }
}
