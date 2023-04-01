



public class Cala {
    private String owner;
    private int price;

    public Cala() {
    }

    public Cala(String owner, int price) {
        this.owner = owner;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getOwer() {
        return owner;
    }

    public void setOwer(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return  owner + ", "+ price ;
    }
    
}
