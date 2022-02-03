package co.renato.freitas.domain;

import java.util.Scanner;

public class Leitor {
    public static String LeitorStr() {
        var scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static Integer LeitorInt() {
        var scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static Double LeitorDlb() {
        var scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
}
