
package GUI;

import DTO.BeeColony;
import DTO.Colony;
import DTO.FPTUniversity;
import DTO.Role;
import DTO.University;

public class Tester {
    public static void main(String[] args) {
        Colony obj1 = new BeeColony("honey", "land", 2000);
        System.out.println(obj1);
        obj1.grow();
        obj1.reproduce();
        
        University obj2 = new FPTUniversity("CanTho", "FPT", 100000);
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        Role df = new BeeColony("wasp", "land", 3000);
        System.out.println(df);
        df.createWorker();
        
        df = new FPTUniversity("Hanoi", "FPT", 100000);
        System.out.println(df);
        df.createWorker();
    }
}
