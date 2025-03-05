package ejercicio14;

// Contexto que utiliza una estrategia de conversión
class ConversorMoneda {
    private ConversionStrategy estrategia;

    public ConversorMoneda(ConversionStrategy estrategia) {
        this.estrategia = estrategia;
    }

    public void convertir(double cantidad) {
        double resultado = estrategia.convertir(cantidad);
        System.out.printf("%.2f euros son %.2f %s%n", cantidad, resultado, estrategia.getClass().getSimpleName().replace("ConversionA", ""));
    }
}