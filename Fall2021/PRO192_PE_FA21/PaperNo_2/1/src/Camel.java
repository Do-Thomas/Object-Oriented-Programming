

import java.util.Scanner;



public class Camel {
    private String desert;
    private int step;

    public Camel() {
    }

    public Camel(String desert, int step) {
        this.desert = desert;
        this.step = step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public void setDesert(String desert) {
        this.desert = desert;
    }

    public int getStep() {
        return step;
    }
    
    public String getDesert(String desert) {
        return desert.toLowerCase();
    }
    
    
    
}
