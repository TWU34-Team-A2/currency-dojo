/**
 * Created with IntelliJ IDEA.
 * User: vaibhavk
 * Date: 27/10/13
 * Time: 6:04 PM
 * To change this template use File | Settings | File Templates.
 */
public class Rupee extends Currency{

    public Rupee(double value) {
        super(value);
    }

    public Euro toEuro(Currency rupee)
    {
        return (new Euro(rupee.getValue()*(1/74.076)));
    }
}
