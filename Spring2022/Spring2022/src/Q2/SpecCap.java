
package Q2;


public class SpecCap extends Cape{
    int type;

    public SpecCap() {
    }

    public SpecCap(String tailor, int color, int type) {
        super(tailor, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return super.toString() + type ; 
    }
    // Replace the last 2 charaters int tailor with the string "XYZ"
    public void setData() {
        int n = super.getTailor().length();
        super.setTailor(super.getTailor().substring(0, n - 2) + "XYZ");
    }
    
    //Check if tailor starts with digit then 
    // return color + 11 otherwise return color + 4
    public int getValue() {
        if ( "0123456789".contains(super.getTailor().substring(0, 1)))
            return super.getColor() + 11;
        return super.getColor() + 4;
    }
}
