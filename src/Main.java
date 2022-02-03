public class Main {
    public static void main(String[] args) {
        Funcionario macos = new Funcionario("Marcos", "222.555.444-99", 3000);
        Gerente g1 = new Gerente("Matheus", "888.222.444-88", 5000, 8569);

        System.out.println("Nome: " + macos.getNome());
        System.out.println("Bonificação: " + macos.getBonificacao());

        System.out.println("------------------");

        System.out.println("Nome: " + g1.getNome());
        System.out.println("Bonificação: " + g1.getBonificacao());
        System.out.println("Autenticou: " + g1.autentica(8569));
    }
}
