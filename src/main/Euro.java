
public class Euro extends Currency{

   // private double value;
    public Euro(double value) {
        super(value);
  //      this.value = value;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//
//        if (o == null || getClass() != o.getClass() ) return false;
//
//        Euro euro = (Euro) o;
//
//        if (value != euro.value) return false;
//
//        return true;
//    }
//
//    @Override
//    public int hashCode() {
//        return (int)value;
//    }
//
    public Euro plus(Euro euro2) {
        return (new Euro(getValue()+euro2.getValue()));
    }


}