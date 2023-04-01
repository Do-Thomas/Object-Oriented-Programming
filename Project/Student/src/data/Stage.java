package data;

public class Stage {

    public static void main(String[] args) {
        //checkObjectV2();
        //checkObjectV3();
        //checkObjectV4();
        //checkObjectV5();
        //checkObjectV6();
        //checkObjectV7();
        //Student ahihi = checkObjectV8();
        //ahihi.showProfile();
    }

    public static void checkObjectV2() {
        Student s1 = new Student("SE1234", "Trần Đồ", 1999, 8.9);
        Student s2 = new Student("SE1235", "Trần Nghiệp", 1999, 9.0);
        s1.showProfile();
        s2.showProfile();
        // tạo 2 vùng new khác nhau. 
    }

    public static void checkObjectV3() {
        Student s1 = new Student("SE1234", "Trần Đồ", 1999, 8.9);
        s1 = new Student("SE1235", "Trần Nghiệp", 2000, 9.0);
        s1.showProfile();
        //con trỏ lưu tọa độ mới, biến thay đổi value, lưu value gần nhất
        // mất tọa độ vùng clone Trần Đồ
    }

    public static void checkObjectV4() {
        Student s1 = new Student("SE1234", "Trần Đồ", 1999, 8.9);
        Student x = s1; // biến lưu tọa độ vùng new.

        //the same: int a = 10;
        //          int b = a;
        s1 = new Student("SE1235", "Trần Nghiệp", 2000, 9.0);
        s1.showProfile();
        x.showProfile();
        System.gc(); // gom rác HEAP ~ free() in C.

    }

    public static void checkObjectV5() {
        Student s1 = new Student("SE1234", "Trần Đồ", 1999, 8.9);
        Student x = s1;
       
        s1.showProfile();
        x.showProfile();
        
        s1.setName("Ú à!");
        System.out.println("=========================");
        x.showProfile();
        //nhiều tên cùng tham chiếu 1 object.
        //1 Object có nhiều biến tham chiếu.
        
    }
    public static void checkObjectV6() {
        //chết non.
        //Student s1 = new Student("SE1234", "Trần Đồ", 1999, 8.9);
        //đã tương đương tọa độ
        //biến Object nào đó giữ giùm tọa độ
        //biến đó mà chấm nghĩa là tọa độ chấm.
        
        new Student("SE12399", "Điên", 2000, 0.0).showProfile();
        //Object vô danh, anonymous Object, Object was created without a new, a reference variable.
        //B1: Gáy đê
        //B2: Bị hốt, do phát hiện KO CON TRỎ, GARBAGE COLLECTOR
        //B3: Kill!!!!
        
        //Muốn RE-USE lại vùng New tối thiểu ít nhất 1 tên gọi, 1 biến OBJECT
        
    }
    public static void checkObjectV7() {
        Student x; // khai báo biến, khai báo con trỏ, nhưng chưa trỏ ai
        x = new Student("SE12399", "Điên", 2000, 0.0);
        
        
    }
    public static Student checkObjectV8() { // ~~~Student x = sẽ là 1 vùng new.
        //Hàm trả về 1 tọa độ của Object nào đó.
        //Chấm là tới Object.
        
        
        Student x; // khai báo biến, khai báo con trỏ, nhưng chưa trỏ ai
        x = new Student("SE12399", "Điên", 2000, 0.0);
        return x;    //x: lưu tọa độ vùng clone Điên.
                    //thảy tọa độ đó cho tên hàm.
        
        
        
       
        
    }
}
