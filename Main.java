package Lista;

public class Main {

    public static void main(String[] args) {
        executar();
    }

    public static void executar() {

        ListaSequencial lista = new ListaSequencial(5);

        // Inserindo valores
        lista.inserir(10);
        lista.inserir(20);
        lista.inserir(30);
        lista.inserir(100);

        // Exibindo
        System.out.println("Lista inicial:");
        lista.exibir();

        // Removendo um valor
        lista.excluir(20);

        // Exibindo novamente
        System.out.println("Lista após remover:");
        lista.exibir();
    }
}