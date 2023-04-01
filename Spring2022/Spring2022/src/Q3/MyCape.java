package Q3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCape implements ICape {

    //COunt and return number of elements having color > average color
    // the average may be real number, in the same data below the average is 6
    @Override
    public int f1(List<Cape> t) {
        int count = 0;
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getColor();
        }
        double avg = sum / t.size();
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getColor() > avg) {
                count++;
            }
        }
        return count;
    }

    //Remove the first element having color > average color.
    @Override
    public int f2(List<Cape> t) {
        int sum = 0;
        for (int i = 0; i < t.size(); i++) {
            sum += t.get(i).getColor();
        }
        double avg = sum / t.size();
        for (int i = 0; i < t.size(); i++) {
            if (t.get(i).getColor() > avg) {
                t.remove(i);
                break;
            }
        }
        return -1;
    }

    // Sort the list descendingly by the last charater of tailor
    @Override
    public int f3(List<Cape> t) {
        Comparator<Cape> comparator = new Comparator<Cape>() {
            @Override
            public int compare(Cape t, Cape t1) {
                int n = t.getTailor().length();
                int n1 = t1.getTailor().length();
                return t.getTailor().substring(n - 1, n).compareTo(t1.getTailor().substring(n1 - 1, n1));
            }

        };
        Collections.sort(t, comparator);
        return -1;
    }
}
