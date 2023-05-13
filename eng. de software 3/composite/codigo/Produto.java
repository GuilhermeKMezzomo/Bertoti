public class Produto implements Mercado{
    String nome;

    @Override
    public void abastecer() {
        System.out.println("O produto " + nome + " Foi abastecido!");
    }

    public void setNome (String nome){
        this.nome = nome;
    }
    
}
