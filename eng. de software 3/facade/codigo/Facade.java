public class Facade {
    private Ferramenta produto;

    public Facade(Ferramenta produto) {
        this.produto = produto;
    }

    public void adicionarProduto(String prod, int preco) {
        produto.adicionarProd(prod);
        produto.precificar(prod, preco);
        produto.verificarValidade(prod);
    }

}
