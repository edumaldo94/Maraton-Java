package ejercicio14;

public interface ConversionStrategy {

    double convertir(double cantidad);  
}

// Estrategia para convertir a libras
class ConversionALibras implements ConversionStrategy {
    @Override
    public double convertir(double cantidad) {
        return cantidad * 0.86;
    }
}

// Estrategia para convertir a dólares
class ConversionADolares implements ConversionStrategy {
    @Override
    public double convertir(double cantidad) {
        return cantidad * 1.28611;
    }
}

// Estrategia para convertir a yenes
class ConversionAYenes implements ConversionStrategy {
    @Override
    public double convertir(double cantidad) {
        return cantidad * 129.852;
    }
}

// Estrategia para convertir a pesos mexicanos
class ConversionAPesosMexicanos implements ConversionStrategy {
    @Override
    public double convertir(double cantidad) {
        return cantidad * 20.50; // 1 EUR = 20.50 MXN
    }
}