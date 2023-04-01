
package DTO;

public class BeeColony extends Colony implements Role{
    String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public BeeColony() {
    }

    public BeeColony(String type, String place, int size) {
        super(place, size);
        this.type = type;
    }
    
    @Override
    public String toString() {
        return "The colony's type is " + type + ", size about  " + getSize() + ", and the place is "+ place;
    }

    @Override
    public void createWorker() {
        System.out.println("Worker bees perform all the work of the bees");
    }
    
}
