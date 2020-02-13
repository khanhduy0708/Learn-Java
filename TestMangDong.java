package application;
import java.util.ArrayList;  // Khai báo thư viện mảng động

public class TestMangDong {
    public static void main(String[] args) {
        // Khởi tạo mảng động
        ArrayList<Integer> a = new ArrayList<Integer>();
        /*  add để thêm phần tử
            get: để truy xuất phần tử theo vị trí
            size: kích thước mảng
            set: thay đổi phần tử. Cú pháp: .set(vị trí, giá trị thay đổi)
            remove: xóa phần tử theo vị trí
            clear: xóa toàn bộ phần tử trong mảng
        */
        a.add(23); // mặc định vị trí 0
        a.add(25); // vị trí thứ 1
        a.add(28);
        System.out.println(a.get(1));
        System.out.println(a.size());
        a.add(30);
        a.add(39);
        a.set(1,10);
        System.out.println(a.get(1));

    }
}

