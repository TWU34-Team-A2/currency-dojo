public class Dollar extends Currency{

    public Dollar(double value) {
        super(value);
    }

    public Euro toEuro(Currency dollar)
    {
        return (new Euro(dollar.getValue()*(1/1.35)));
    }
}
