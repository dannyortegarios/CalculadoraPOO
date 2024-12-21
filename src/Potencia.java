public class Potencia extends OperacionMatematica {
    public Potencia(double numero1, double numero2) {
        super(numero1, numero2); // Llama al constructor de la clase base
    }

    @Override
    public double realizarOperacion() {
        resultado = calcularPotencia(numero1, (int)numero2); // Convertimos el exponente a entero
        return resultado;
    }

    private double calcularPotencia(double base, int exponente) {
        if (exponente == 0) {
            return 1; // Caso base: cualquier número elevado a 0 es 1
        }
        return base * calcularPotencia(base, exponente - 1); // Recursión
    }
}