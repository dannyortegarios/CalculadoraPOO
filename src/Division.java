public class Division extends OperacionMatematica {
    public Division(double numero1, double numero2) {
        super(numero1, numero2); // Llama al constructor de la clase base
    }

    @Override
    public double realizarOperacion() {
        if (numero2 != 0) {
            resultado = numero1 / numero2;
        } else {
            System.out.println("Error: No se puede dividir por 0");
            resultado = Double.NaN; // Si la división es por 0, asigna NaN (Not a Number)
        }
        return resultado;
    }
}
