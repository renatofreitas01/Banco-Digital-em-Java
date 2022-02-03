package co.renato.freitas.domain;

import co.renato.freitas.exception.AccountAlreadyExistException;
import co.renato.freitas.exception.InvalidOperationException;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

public class Banco {
    private final Set<ContaBanco> contas;

    public Banco() {
        this.contas = new HashSet<>();
    }

    public Double depositar(Double valor, UUID contaBancoId) {
        return 1.0;
    }

    public Double saque(Double valor, UUID contaBancoId) throws InvalidOperationException, IllegalArgumentException {
        final var contaBanco = contas.stream()
                .filter(c -> c.getId().equals(contaBancoId))
                .findFirst();

        if (contaBanco.isPresent()) {
            final var cb = contaBanco.get();
            cb.withdraw(valor);
            return cb.getSaldo();
        } else {
            // error
            final var errorMessage = new StringBuilder()
                    .append("A conta com ID ")
                    .append(contaBancoId)
                    .append(" nao foi encontrada!");
            throw new IllegalArgumentException(errorMessage.toString());
        }
    }

    public Set<ContaBanco> listAccountForPerson(String cpf) {
        return contas.stream()
                .filter(c -> c.getPessoa().getCpf().equals(cpf))
                .collect(Collectors.toSet());
    }

    public ContaBanco addCliente(Cliente cliente) {
        if (contaJaExiste(cliente)) {
            System.out.println("Consta já existe");
            throw new AccountAlreadyExistException("Conta já registrada");
        }

        final var contaBanco = new ContaBanco(this, cliente);
        this.contas.add(contaBanco);
        return contaBanco;


    }

    private Boolean contaJaExiste(Cliente cliente) {
        final var count = contas.stream()
                .filter(p -> p.getPessoa().getCpf().equals(cliente.getCpf()))
                .count();
        return count > 0;
    }
}
