package application;

public class array2 {
    // Phương thức trả về mảng
    public static void daoNguocMang (int[] list){
        int[] kq = new int[list.length];
        for (int i=0, j=kq.length-1; i<list.length; i++, j--)
            kq[j] = list[i];
        // in mảng dùng foreach
        for (int a: kq ) // khai báo biến a gán là mảng kq
            System.out.printf(a+ " ");
    }

    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6};
        daoNguocMang(arr);
    }
}

