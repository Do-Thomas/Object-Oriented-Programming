
package Q1;


public class Bottle {
    private String maker;
    private int volume;

    public Bottle() {
    }

    public Bottle(String maker, int volume) {
        this.maker = maker;
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getMaker() {
        return maker.toLowerCase();
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }
    
}
