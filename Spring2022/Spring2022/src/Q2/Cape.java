
package Q2;


public class Cape {
    private String tailor;
    private int color;

    public Cape() {
    }

    public Cape(String tailor, int color) {
        this.tailor = tailor;
        this.color = color;
    }

    public int getColor() {
        return color;
    }

//    public void setColor(int color) {
//        this.color = color;
//    }

    public String getTailor() {
        return tailor;
    }

    public void setTailor(String tailor) {
        this.tailor = tailor;
    }

    @Override
    public String toString() {
        return tailor + ", " + color + ", ";
    }
    
}
