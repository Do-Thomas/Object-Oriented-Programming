
public class Student {
    private String id;
    private String name;
    private byte old;

    public Student() {
    }

    public Student(String id, String name, byte old) {
        this.id = id;
        this.name = name;
        this.old = old;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getOld() {
        return old;
    }

    public void setOld(byte old) {
        this.old = old;
    }
    
}
