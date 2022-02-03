package co.renato.freitas.domain;

public class MenuConsole {

    public static void MenuFuncionario() {
        System.out.println("*****************************");
        System.out.println("Bem vindo "/*, + */);
        System.out.println("*****************************");
        System.out.println();
        System.out.println("1 - Informações do funciónario");
        System.out.println("2 - Abrir conta cliente");
        System.out.println("3 - Exlcuir conta cliente");
        System.out.println("4 - Abrir conta funcionário");
        System.out.println("5 - Excluir conta funcionário");
        System.out.println("6 - SAIR");
        System.out.println();
        System.out.println("*****************************");

        final int op = Leitor.LeitorInt();
        if (op < 1 || op > 7) {
            //TODO CLEAR FUNCTION
            //TODO ERROR
            MenuFuncionario();
        } else {
            //TODO DEU AÇÃO
        }
    }

    public static void MenuCliente() {
        System.out.println("*****************************");
        System.out.println("Bem vindo "/*, + */);
        System.out.println("*****************************");
        System.out.println();
        System.out.println("1 - Informações da conta");
        System.out.println("2 - Saldo");
        System.out.println("3 - Deposito");
        System.out.println("4 - Saque");
        System.out.println("5 - Transferência");
        System.out.println("6 - SAIR");
        System.out.println();
        System.out.println("*****************************");

        final int op = Leitor.LeitorInt();
        if (op < 1 || op > 7) {
            //TODO CLEAR FUNCTION
            //TODO ERROR
            MenuCliente();
        } else {
            //TODO DEU AÇÃO
        }
    }

}