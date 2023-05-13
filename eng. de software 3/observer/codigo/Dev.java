
public class Dev implements Observer{
    private String name;

    public Dev(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " foi notificado: " + message);
    }
}
