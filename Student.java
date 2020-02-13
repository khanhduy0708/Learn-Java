package application;

public class Student {
    public String ten; // khởi tạo biến ten kiểu String là public
    private double hocphi; // khởi tạo biến hocphi kiểu double là private
    public Student (String tenSV){ // biến tên đc gán trong contructor
        ten = tenSV;
    }
    public void setHocphi(double hp){ // gán giá trị cho biến hocphi
        hocphi = hp;
    }
    public void inThongTin(){ // khởi tạo phương thức in thông tin sinh viên
        System.out.println("Ho va ten: " +ten);
        System.out.println("Hoc phi: " +hocphi);
    }

    public static void main(String[] args) {
        Student sv1 = new Student("Nguyen Van A");
        sv1.setHocphi(50000);
        sv1.inThongTin();
    }
}

