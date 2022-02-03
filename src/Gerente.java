public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        setSenha(senha);
    }

    public boolean autentica(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return super.getBonificacao() + super.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
