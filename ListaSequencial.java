package Lista;

public class ListaSequencial {

    private int[] dados;
    private int tamanho;

    public ListaSequencial(int capacidade) {
        dados = new int[capacidade];
        tamanho = 0;

    }

    public void inserir(int valor) {

        if (tamanho < dados.length) {
            dados[tamanho] = valor;
            tamanho++;
        } else {
            System.out.println("Lista cheia!");
        }

    }

    public void exibir() {

       if (tamanho == 0){
           System.out.println("LISTA VAZIA");
       }else {
           for (int i = 0; i < tamanho; i++){
               System.out.println(dados[i]);
           }
       }


    }

    public void excluir(int valor) {

        for (int i = 0; i < tamanho; i++) {
            if (dados[i] == valor) {
                for (int j = i; j < tamanho - 1; j++) {
                    dados[j] = dados[j + 1];
                }
                tamanho--;
                break;
            }
        }
    }










}