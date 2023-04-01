
import java.util.Collections;


public class Test {

    public void f1(List<Car> t) {

        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getMaker();
        }
        double avg = rate / t.size();
        Math.floor(avg);
    }

    public void f2(List<Car> t) {
        //Find the first max
        int firstMax = t.get(0).getRate();
        int indexMax = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() > firstMax) {
                firstMax = t.get(i).getRate();
                indexMax = i;
            }
        }

        int firstMin;
        int indexMin = 0;
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getRate() < firstMin) {
                firstMin = t.get(i).getRate();
                indexMin = i;
            }
        }
        Collections.swap(t, indexMin, indexMax);
//        for (int i = 0; i < t.size(); i++) {
//            int temp = firstMax;
//            firstMax = firstMin;
//            firstMin = temp;
        }
    
    // Sort the list by maker alphabetically
    public void f3(List<Car> t) {
        Comparator<Car> comparator = new Comparator<Car>() {
            @Override
            public int compare(Car t, Car t1) {
                return t.getMaker().compareTo(t.getMaker());
            }
            Collections.sort(t, comparator.reversed());
        }   
    }
    
    public int f1(String str) {
        int count = 0;
        for (int i = 2; i < str.length(); i++) {
            if (str[i] % 2 == 1){
                count++;
                break;
            }
        }
        return str;
    }
    
    public int f2(String str) {
        for (int i = 0; i < str.length(); i++) {
            if ("a")
            t.get(i).reverse();
        }
    }
}
