
package basicarray;
// Thêm 1 main() ban đầu, main() này phải mở lên Shift-F6
//F6: chạy main() đầu tiên được tạo ra.
//Properties/RUN/.......chọn main().
public class Sorting {
    public static void main(String[] args) {
        //sortPrimitiveArray();
        sortStudentList();
        
    }
    
    public static void sortPrimitiveArray() {
        int arr[] = new int[]{1000, 10, 5, -15, 10, -20};
        System.out.println("Before sorting ascending");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) { // i trước j
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        if (arr[0] > arr[1]) {
            int  t = arr[0];
            arr[0] = arr[1];
            arr[1] = t;
        }
        System.out.println("After sorting ascending");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        
        
            
        }
    public static void sortStudentList() {
        Student arr[] = new Student[]{new Student("SE9", "CHÍN", 19, 9),

                                      new Student("SE5", "NĂM", 15, 5),
                                      new Student("SE7", "BẢY", 17, 7),
                                      new Student("SE3", "BA", 13, 3),
                                      new Student("SE8", "TÁM", 18, 8)};
        System.out.println("The student list before sorting");
        for (Student x : arr) {
            x.showProfile();
        }
        
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].getGpa() > arr[j].getGpa()){
                    Student t = arr[i];
                    arr[i]    = arr[j];
                    arr[j]    = t;
                }
            }
        }
        System.out.println("The student list after sorting");
        for (Student x : arr) {
            x.showProfile();
        }
    }
}
