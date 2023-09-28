package conversor;

public class CurrencyConverter {

	private static final double DOLLAR_RATE = 0.19;
    private static final double EURO_RATE = 0.16;
    private static final double LIBRA_RATE = 0.14;
    private static final double PESO_ARGENTINO_RATE = 20.0;
    private static final double PESO_CHILENO_RATE = 140.0;

    public double convertReaisToDollar(double amountInReais) {
        return amountInReais * DOLLAR_RATE;
    }

    public double convertReaisToEuro(double amountInReais) {
        return amountInReais * EURO_RATE;
    }

    public double convertReaisToLibraEsterlina(double amountInReais) {
        return amountInReais * LIBRA_RATE;
    }

    public double convertReaisToPesoArgentino(double amountInReais) {
        return amountInReais * PESO_ARGENTINO_RATE;
    }

    public double convertReaisToPesoChileno(double amountInReais) {
        return amountInReais * PESO_CHILENO_RATE;
    }

    public double convertDollarToReais(double amountInDollar) {
        return amountInDollar / DOLLAR_RATE;
    }

    public double convertEuroToReais(double amountInEuro) {
        return amountInEuro / EURO_RATE;
    }

    public double convertLibraEsterlinaToReais(double amountInLibraEsterlina) {
        return amountInLibraEsterlina / LIBRA_RATE;
    }

    public double convertPesoArgentinoToReais(double amountInPesoArgentino) {
        return amountInPesoArgentino / PESO_ARGENTINO_RATE;
    }

    public double convertPesoChilenoToReais(double amountInPesoChileno) {
        return amountInPesoChileno / PESO_CHILENO_RATE;
    }
}

