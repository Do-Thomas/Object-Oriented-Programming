



public class SpecCala extends Cala {
    int color;

    public SpecCala() {
    }

    public SpecCala(String owner, int price, int color) {
        super(owner, price);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.toString()+", " + this.color;   
    }
    
    public void setData() {
        int n =  super.getOwer().length();
        super.setOwer(super.getOwer().substring(0, 1) + "XX" +super.getOwer().substring(2, n));
    }
    
    public int getValue() {
        if (this.color % 2 == 1)
            return super.getPrice() + 3;
        return super.getPrice() + 7;
    }
    
    
}
