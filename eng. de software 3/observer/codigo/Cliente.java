public class Cliente implements Observer{
    private String name;

    public Cliente(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " foi notificado: " + message);
    }
    
}
