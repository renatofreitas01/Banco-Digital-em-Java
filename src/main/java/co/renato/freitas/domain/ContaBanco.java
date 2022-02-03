package co.renato.freitas.domain;

import co.renato.freitas.exception.InvalidOperationException;

import java.util.UUID;

public class ContaBanco {
    private final UUID id;
    private final Banco banco;
    private final Cliente cliente;
    public  static Double saldo;

    public ContaBanco(Banco banco, Cliente cliente) {
        this.id = UUID.randomUUID();
        this.banco = banco;
        this.cliente = cliente;
        this.saldo = 0.0;

        System.out.println("Counta criada. ID: " + id);
    }

    public Double deposit(Double value) {
        this.saldo += value;
        return saldo;
    }

    public Double withdraw(Double valor) throws InvalidOperationException {
        if (saldo - valor < 0) {
            System.out.println("Saldo insuficiente");
            throw new InvalidOperationException("Saldo insuficiente");
        }

        saldo -= valor;
        return saldo;
    }


    public Cliente getPessoa() {
        return cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Banco getBanco() {
        return banco;
    }

    public UUID getId() {
        return id;
    }
}
