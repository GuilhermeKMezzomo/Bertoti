public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.setCalcula(new Adicao());
        calc.realizaCalculo(5,5);

        Calculadora calc1 = new Calculadora();
        calc1.setCalcula(new Subtracao());
        calc1.realizaCalculo(5,5);
       

        Calculadora calc2 = new Calculadora();
        calc2.setCalcula(new Divisao());
        calc2.realizaCalculo(5,5);

        Calculadora calc3 = new Calculadora();
        calc3.setCalcula(new Multiplicacao());
        calc3.realizaCalculo(5,5);
    }
}
