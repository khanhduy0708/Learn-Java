package application;

public class array1 {
    public static void main(String[] args) {
        // khai bảo mảng a kiểu int, tạo mảng a gồm 5 phần tử
        int a[] = new int[5];
        // hoặc int a[] = {10,12,14,16,18};
        a[0] = 10;
        a[1] = 12;
        a[2] = 14;
        a[3] = 16;
        a[4] = 18;
        // in mảng truyền thống
       /* for (int i=0; i<a.length; i++)
            System.out.println(a[i]); */

       // in mảng dùng foreach
        for(int element: a)
            System.out.println(element);
    }
}

