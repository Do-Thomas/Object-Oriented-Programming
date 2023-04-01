package basicarray;

public class BasicArray {

    public static void main(String[] args) {
        //playWithPrimitive();
        //playWithPrimitive2();
        //playWithPrimitiveArrayV3();
        //playWithStudentObject();
        //playWithStudentArray();
        //playWithObjectArray();
        //sortObjectArray();
        //sortPrimitiveArray();
        sortObjectArray2();
    }

    public static void sortObjectArray2() {
        //sắp xếp tăng dần theo điểm tb
        //điểm firt element < second element
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "Trần Nghiệp", 2000, 9.0); // new 1 sinh viên
        arr[1] = new Student("SE123457", "Trần Đồ", 2000, 6.0);
        System.out.println("Before sorting by GPA");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        //Swap
        if (arr[0].getGpa() > arr[1].getGpa()) {
            Student t;
            t = arr[0];
            arr[0] = arr[1];// xin nhẹ value.
            arr[1] = t;
            
        }
        System.out.println("After sorting by GPA");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }

    }

    public static void sortObjectArray() {
        //sắp xếp giảm dần theo điểm tb
        //điểm firt element < second element
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "Trần Nghiệp", 2000, 9.0); // new 1 sinh viên
        arr[1] = new Student("SE123457", "Trần Đồ", 2000, 9.8);
        Student t; //temporary
        t = arr[0];
        arr[0] = arr[1];// xin nhẹ value.
        arr[1] = t;
        System.out.println("After sorting by GPA");
        for (int i = 0; i < arr.length; i++) {
            arr[i].showProfile();
        }
        // chỉ swap khi bị lộn xộn thứ tự, a > b: tăng dần
        //                                 a < b: giảm dần
    }

    public static void sortPrimitiveArray() {
        int a = 9;
        int b = 5;
        //in a trước, b sau, giảm dần value 9  5
        // tăng dần                         5  9
        //backup a trước khi mất value
        if (a > b) {
            int tmp = a; // tớ temporary, temp, tmp, t
            a = b;
            b = tmp;
            System.out.println("After sorting a: " + a + " | b: " + b);
        }

    }

    public static void playWithObjectArray() {
        Student arr[] = new Student[2];
        arr[0] = new Student("SE123456", "Trần Nghiệp", 2000, 9.0); // new 1 sinh viên
        arr[1] = new Student("SE123457", "Trần Đồ", 2000, 9.8);

        System.out.println("The student list");
        for (Student x : arr) {
            // x = arr[0] ; x = arr[1]; ..... 
            x.showProfile();
        }
        //sắp xếp tăng dần theo điểm tb
        //lí thuyết, bạn [0] sẽ phải có điểm 9.0

    }

    public static void playWithStudentArray() {
        //lưu hồ sơ  10 bạn sinh viên.
        int arr[] = new int[10];
        Student list[] = new Student[10];
        list[0] = new Student("SE123456", "Trần Nghiệp", 2000, 5.0); // new 1 sinh viên
        list[1] = new Student("SE123457", "Trần Đồ", 2000, 6.0);
        list[2] = new Student("SE123458", "Trần Thomas", 2000, 7.0);
        list[0].getName().toUpperCase();
        System.out.println(list[3]); // result: là DEFAULT, trỏ vào tọa độ 0 của RAM (đáy của RAM).
        // Địa chỉ 0 của RAM
        //Byte đầu tiên trong RAM toàn là số OFFOFFOFF 
        //Byte đầu tiên (thứ 0) tọa độ thứ 0 của RAM chứ toàn số 0.
        System.out.println("The list of student:");
        for (int i = 0; i < list.length; i++) {
            list[i].showProfile();
        }
        //NGUYÊN TẮC KHI CHƠI VỚI MẢNG: phải có biến COUNt để cho biết mảng đã gán VALUE đến đâu, 
        //For đến .Length
        //BỊ DEFAULT VỚI PRIMITIVE, BỊ NULL VỚI MẢNG OBJECT

    }

    public static void playWithStudentObject() {
        Student x; // 1 đứa
        x = new Student("SE123456", "ĐỒ Nghiệp", 2000, 10.0);
        x.showProfile();
    }

    public static void playWithPrimitiveArrayV3() {
        int arr1[] = {5, 10, 15, 20};           //new ngầm
        int arr3[] = new int[]{5, 10, 15, 20};  // hợp lệ
        int arr2[] = new int[5];

        int arr[];
        arr = new int[5];                       // có nhiều biến trùng tên
        //sau đó xài từng biến theo yêu cầu
        arr[0] = 5;             //int a = 5;
        arr[1] = 10;            //int b = 10;
        arr[2] = 15;            //int c =15;
        //arr là 1 biến đặc biệt, là biến Object, vì trỏ 1 vùng new bự
        // có quyền CHẤM, tệ nhất là .toString()
        //arr là biến phức tạp vì nó có nhiều info bên trong, info này là phần tử của mạng
        //arr[0] ~~~ arr.get(thằng thứ 0) -> được 5/ arr[0] được 5
        //arr.lengthh - biến lưu đđ của 1 mảng, có bao nhiêu phần tử.
        //arr.length;  // hằng số đặc biệt, ăn theo từng mảng, mỗi mảng sẽ khác nhau về kích thước.
        //non-static, vì nếu static
        System.out.println("Array has: " + arr);//tự gọi hàm toString để convert của Object ra thành cái gì đó.
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        //arr. : là primitive, tên biến phức tạp, đơn giá trị ( tên t có [] do trùng tên nhưng cho value đơn giản.
        for (int x : arr) {
            System.out.print(x + " ");
        }
        // get() set() ko có mà thay = chơi trực tiếp.
    }

    public static void playWithPrimitive2() {
        double arr[] = new double[100]; // default gán hết = 0
        //new() là phễu để đúc Object!!
        //new []    
        arr[0] = 39;
        arr[1] = 79;
        arr[2] = 6868;
        arr[3] = 2204;

        System.out.println("The array has values of (for i)");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nThe array has values of (for each)");
        for (double x : arr) {
            System.out.print(x + " ");

        }
    }

    public static void playWithPrimitive() {
        //double vol[365];  //Java cấm khai báo kích thước mảng, số phần tử trong []

        float v[] = {0, 0, 5, 10, 15, 20, 25}; // mảng có 7 phần tử,  có value
        // 7 biến float nằm trên HEAP, có new ngầm, CÓ malloc()

        System.out.println("The array has values of (printed by individual)");

        v[0] = 6868;
        System.out.println(v[0] + "; " + v[1] + "; " + v[2]);
        for (int i = 0; i < 7; i++) {
            System.out.println(v[i] + " ");
        }

        //ta có thể xem mảng như 1 tập hợp các value
        //ta có thể xài khái niệm với mọi, với mỗi để quét từng phần tử mảng
        System.out.println("\nThe array has n value of: ");
        for (float x : v) {
            System.out.println(x + " ");

        }
        //N = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, ....}
    }

}
