/**
 * Created with IntelliJ IDEA.
 * User: alacerda
 * Date: 10/24/13
 * Time: 1:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Euro {

    private int value;

    public Euro(int i) {
        this.value = i;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Euro euro = (Euro) o;

        if (value != euro.value) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value;
    }


    public Euro plus(Euro euro) {
        value += euro.value;
        return this;
    }
}
