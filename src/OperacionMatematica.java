public abstract class OperacionMatematica implements Operacion {
    protected double numero1;
    protected double numero2;
    protected double resultado;

    public OperacionMatematica(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = 0;
    }

    // Método abstracto que deben implementar las subclases
    public abstract double realizarOperacion();

    public double getResultado() {
        return resultado; // Devuelve el resultado de la operación
    }
}