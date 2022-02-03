package co.renato.freitas.domain;

import java.util.Scanner;

public class ConsoleLogin {
    public static void LoginOP() {
        System.out.println("***************");
        System.out.println("SEJA BEM VINDO");
        System.out.println();
        System.out.println("Escolha uma opção de login");
        System.out.println();
        System.out.println("1 - FUNCIONÁRIO");
        System.out.println("2 - CLIENTE");
        System.out.println("***************");
        final var i = LoginLeitura();
        if (i == 1) {
            LoginFuncionario();
        } else {
            LoginCliente();
        }
    }

    private static Integer LoginLeitura() {
        var scanner = new Scanner(System.in);
        final var op = scanner.nextInt();
        if (op != 1 && op != 2) {
            //TODO CLEAR FUNCTION
            //TODO LEITURA INVALIDA
            LoginOP();
        }

        //TODO CLEAR FUNCTION

        return op;
    }

    private static void LoginFuncionario() {
        System.out.println("Digite seu ID:");
        final var FUsuario = Leitor.LeitorStr();
        System.out.println("Digite sua senha:");
        final var FSenha = Leitor.LeitorStr();
        if(FCheck(FUsuario, FSenha)){
            //TODO CLEAR FUNCTION
            MenuConsole.MenuFuncionario();
        } else{
            //TODO LOGIN ERROR
        }
    }

    private static void LoginCliente() {
        System.out.println("Digite seu usuário:");
        final var CUsuario = Leitor.LeitorStr();
        System.out.println("Digite sua senha:");
        final var CSenha = Leitor.LeitorStr();
        if(CCheck(CUsuario, CSenha)){
            //TODO CLEAR FUNCTION
            MenuConsole.MenuCliente();
        } else{
            //TODO LOGIN ERROR
        }
    }


    //TODO MAKE NEW CLASS (DATA BANK)
    private static Boolean FCheck(String FUsuario, String FSenha) {
        return true;
    }

    private static Boolean CCheck(String FUsuario, String FSenha) {
        return true;
    }


}
