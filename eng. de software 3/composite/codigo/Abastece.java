import java.util.LinkedList;

public class Abastece implements Mercado{
    LinkedList<Mercado> mercado = new LinkedList<>();

    @Override
    public void abastecer() {
       mercado.forEach(prat -> prat.abastecer());
    }
    public void add(Produto produto1){
        Mercado.add(produto1);
    }
} 
