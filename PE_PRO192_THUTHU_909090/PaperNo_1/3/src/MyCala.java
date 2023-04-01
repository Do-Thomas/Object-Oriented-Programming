
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MyCala implements ICala {

    @Override
    //letters
    public int f1(List<Cala> t) {
        int count = 0;
        for (Cala cala : t) {
            // check trong chuỗi có kí tự nào giống 0123456789.
            if ("QƯERTYUIOPASDFGHJKLZXCVBNM".contains(cala.getOwner().substring(1, 2))) {
                count++;
            }
        }
        return count;
    }

    /*digit   //at least 2 characters. Count and return number of elements with owner having 2nd character is a digit.
    public int f1(List<Cala> t) {
     int count  = 0;
        for (Cala cala : t) {
            // check trong chuỗi có kí tự nào giống 0123456789.
           if ("0123456789".contains(cala.getOwner().substring(1, 2)))
               count++;
        }
        return count;
    }*/

    @Override
    //Remove the second element having maximun price( do nothing if only one max element in the list.
    public void f2(List<Cala> t) {
        int valueMin = t.get(0).getPrice();
        int indexMin = 0;
        for (int i = 1; i < t.size(); i++) {
            if (t.get(i).getPrice() < valueMin) {
                valueMin = t.get(i).getPrice();
                indexMin = i;
            }

        }

        for (int i = indexMin + 2; i < t.size(); i++) {
            if (valueMin == t.get(indexMin).getPrice()) {
                t.remove(i);
                break;
            }
        }
    }
    //  //Remove the second element having maximun price( do nothing if only one max element in the list.
//    public void f2(List<Cala> t) {
//        int min = 0, pos = 0;
//        for (int i = 0; i < t.size(); i++) {
//            if (min  < t.get(i).getPrice()) {
//                min = t.get(i).getPrice();
//                pos = i;
//            }
//        }
//        // 2 4 6 6 7 5
//        // 0 1 2 3 4 5
//        for (int i = pos + 1; i < t.size(); i++) {
//            if (min == t.get(i).getPrice()) {
//                t.remove(i);
//                break;
//            }
//
//        }
//    }
//    int valueMin = t.get(0).getPrice();
//        int indexMin = 0;
//        for (int i = 1; i < t.size(); i++) {
//            if (t.get(i).getPrice() < valueMin) {
//                valueMin = t.get(i).getPrice();
//                indexMin = i;
//            }
//            
//        }
//        
//        for (int i = indexMin; i < t.size(); i++) {
//            if (valueMin == t.get(indexMin).getPrice()) {
//                t.remove(indexMin + 1);
//               
//                break;
//            }
//        }
//    }

    @Override
    //Suppose all owner contain at least 2 characters. Sort the list t asscendingly by the 2nd characters of owner.
    public void f3(List<Cala> t) {
        Comparator<Cala> comparator = new Comparator<Cala>() {
            @Override
            public int compare(Cala t, Cala t1) {
//                int n = t.getOwner().length();
//                int n1 = t1.getOwner().length();
                return t.getOwner().substring(1, 2).compareTo(t1.getOwner().substring(1, 2));
            }
        };

        //Collections.sort(t, comparator);//tăng dần
        Collections.sort(t, comparator.reversed());//giảm dần
    }

}
