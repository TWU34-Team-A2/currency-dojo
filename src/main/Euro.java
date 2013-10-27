/**
 * Created with IntelliJ IDEA.
 * User: thoughtworker
 * Date: 10/24/13
 * Time: 3:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class Euro {

    private float amount;

    public Euro(float amount) {
        this.amount = amount;
    }

//    @Override
//    public boolean equals(Object object)
//    {
//        if(object == null || object instanceof Euro == false) {
//            return false;
//        }
//        Euro otherEuro = (Euro) object;
//         return this.amount == otherEuro.amount;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        if (amount != euro.amount) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return (int) amount * 100;
    }

    public Euro add(Euro euro) {
        return new Euro(amount + euro.amount);
    }

    public float getAmount() {
        return amount;
    }
}
