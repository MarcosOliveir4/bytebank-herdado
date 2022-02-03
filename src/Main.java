public class Main {
    public static void main(String[] args) {
        Funcionario macos = new Funcionario("Marcos", "222.555.444-99", 3000);

        System.out.println("Nome: " + macos.getNome());
        System.out.println("Bonificação: " + macos.getBonificacao());
    }
}
