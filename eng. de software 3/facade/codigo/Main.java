
public class Main {
    public static void main(String[] args) {

        String[] produtos = { "Broca", "Furadeira", "Parafuso", "Mangueira" };
        int[] precos = { 25, 250, 1, 40 };

        Ferramenta produto = new Ferramenta();
        Facade facade = new Facade(produto);

        for (int i = 0; i <= produtos.length; i++) {
            facade.adicionarProduto(produtos[i], precos[i]);
            System.out.println("------------------------------------------------------------------------");
        }

    }
}