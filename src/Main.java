public class Main {
    public static void main(String[] args) {
        Funcionario macos = new Funcionario("Marcos", "222.555.444-99", 3000);
        EditorVideo edv = new EditorVideo("Marcos", "222.555.444-99", 2500);
        Gerente g1 = new Gerente("Matheus", "888.222.444-88", 5000, 8569);
        ControleBonificacao controle = new ControleBonificacao();

        controle.registra(macos);
        controle.registra(edv);
        controle.registra(g1);

        System.out.println("Nome: " + macos.getNome());
        System.out.println("CPF: " + macos.getCpf());
        System.out.println("Bonificação: " + macos.getBonificacao());

        System.out.println("------------------");

        System.out.println("Nome: " + g1.getNome());
        System.out.println("CPF: " + g1.getCpf());
        System.out.println("Bonificação: " + g1.getBonificacao());
        System.out.println("Autenticou: " + g1.autentica(8569));

        System.out.println("------------------");

        System.out.println("Nome: " + edv.getNome());
        System.out.println("CPF: " + edv.getCpf());
        System.out.println("Bonificação: " + edv.getBonificacao());


        System.out.println("------------------");
        System.out.println("Total de bonificação: " + controle.getSoma());
    }
}
