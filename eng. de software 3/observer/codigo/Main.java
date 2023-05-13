public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        Dev dev1 = new Dev("dev João");
        Dev dev2 = new Dev("Dev Mateus");

        Cliente cliente1 = new Cliente("Ana");
        Cliente cliente2 = new Cliente("Diego");

        empresa.addObserver(dev1);
        empresa.addObserver(dev2);
        empresa.addObserver(cliente1);
        empresa.addObserver(cliente2);

    }
}
