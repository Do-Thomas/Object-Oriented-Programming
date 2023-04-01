
public class Car {

    private String Colour;
    private int EnginePower;
    private boolean Convertible;
    private boolean parkingBrake;

    public Car() {
        Colour = "";
        EnginePower = 0 ;
        Convertible = false;
        parkingBrake = false;
    }

    public Car(String Colour, int EnginePower, boolean Convertible, boolean parkingBrake) {
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.parkingBrake = parkingBrake;
    }

    public void pressAcceleratorButton() {
        System.out.println("You can press the accelerator button");
    }

    public void pressStarButton() {
        System.out.println("You can press the star button");
    }

    public void output() {
        System.out.println("Colour: " + Colour);
        System.out.println("Engine power: " + EnginePower);
        System.out.println("Convertible: " + Convertible);
        System.out.println("parking brake: " + parkingBrake);
    }

    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    public void setEnginePower(int EnginePower) {
        this.EnginePower = EnginePower;
    }

    public void setConvertible(boolean Convertible) {
        this.Convertible = Convertible;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }

    public String getColour() {
        return Colour;
    }

    public int getEnginePower() {
        return EnginePower;
    }

    public boolean isConvertible() {
        return Convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

}
