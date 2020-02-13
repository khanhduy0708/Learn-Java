package application;

public class minArray {
    // Ví dụ truyền mảng tới phương thức
    static void min(int arr[]){ // khai bao phuong thuc min, tham so la mang
        int min = arr[0];
        for (int i=0; i<arr.length; i++)
            if (min>arr[i])
                min = arr[i];
        System.out.println("So nho nhat la " +min);
    }

    public static void main(String[] args) {
        int a[] = {10,6,8,20,5,2};
        min(a); // goi phuong thuc min tham so a
    }
}

