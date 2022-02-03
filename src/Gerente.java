public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, String cpf, double salario, int senha) {
        super(nome, cpf, salario);
        setSenha(senha);
    }

    public boolean autentica(int senha) {
        if(this.senha == senha) {
            return true;
        }
        return false;
    }

    public double getBonificacao() {
        return this.getSalario();
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}