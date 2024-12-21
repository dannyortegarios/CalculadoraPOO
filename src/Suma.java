public class Suma extends OperacionMatematica {
    public Suma(double numero1, double numero2) {
        super(numero1, numero2); // Llama al constructor de la clase base
    }

    @Override
    public double realizarOperacion() {
        resultado = numero1 + numero2;
        return resultado; // Devuelve el resultado de la suma
    }
}
