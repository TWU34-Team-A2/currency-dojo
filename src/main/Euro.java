
public class Euro extends Currency{

    public Euro(double value) {
        super(value);
    }

    public Euro plus(Euro euro2) {
        return (new Euro(getValue()+euro2.getValue()));
    }

    public Euro toEuro(Currency euro)
    {
        return (new Euro(euro.getValue()));
    }
}