package application;

public class Test {
    public void tuoiCon(){
        int tuoi = 10;
        tuoi = tuoi + 10;
        System.out.println("Tuoi con la: " + tuoi);
    }
    public static void main(String[] args) {
        Test test = new Test();
        test.tuoiCon();
    }
}

