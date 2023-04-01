
package DTO;

public abstract class Organization {
    private int size;

    public Organization() {
    }

    public Organization(int size) {
        this.size = size;
    }
    
    @Override
    public String toString() {
        return "The Organization's size is " + size + '}';
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    abstract void communicateByTool();
    
    
}

