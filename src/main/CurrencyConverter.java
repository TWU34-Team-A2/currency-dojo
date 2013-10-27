/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 3:50 AM
 * To change this template use File | Settings | File Templates.
 */
public class CurrencyConverter {


    private float exchangeRate(Euro euro, CurrencyType currency) {
        if(currency == CurrencyType.USDOLLAR)
            return 1.35f;
        else if(currency == CurrencyType.RUPEE)
            return 84.78f;
        else
            return 1f;
    }

    public boolean checkIfEquals(Euro euro, USDollar usDollar) {
        float rate = exchangeRate(euro, CurrencyType.USDOLLAR);
        return euro.getAmount() * rate == usDollar.getAmount();
    }

    public boolean checkIfEquals(Euro euro, Rupee rupee) {
        float rate = exchangeRate(euro, CurrencyType.RUPEE);
        return euro.getAmount() * rate == rupee.getAmount();
    }
}
