


public class Cannary {
    private String place;
    private int song;

    public Cannary() {
    }

    public Cannary(String place, int song) {
        this.place = place;
        this.song = song;
    }

    public int getSong() {
        return song;
    }

    public void setSong(int song) {
        this.song = song;
    }
    
    //return a string s, which is obtained by converting the first 3 charaters
    // in place to lowercase format.
    public String getPlace() {
        return place.substring(0, 3).toLowerCase();
    }
    //đề ko cho
    public void setPlace(String place) {
        this.place = place;
    }
    
}
