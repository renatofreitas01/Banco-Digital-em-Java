package co.renato.freitas.domain;

public class Cliente {
    private final String cpf;
    private String nome;
    private String sobrenome;
    private Integer idade;

    //construtor
    public Cliente(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cliente cliente = (Cliente) o;

        return cpf.equals(cliente.cpf);
    }

    @Override
    public int hashCode() {
        int result = nome.hashCode();
        result = 31 * result + sobrenome.hashCode();
        result = 31 * result + cpf.hashCode();
        return result;
    }
}
