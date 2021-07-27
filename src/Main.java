import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner sc = new Scanner(System.in);
        int number =1;
        while (number !=0){
            System.out.println("Mời chọn");
            System.out.println("Ấn 1 để nhập thông tin sinh viên mượn sách");
            System.out.println("Ấn 2 để Hiện danh sách sinh viên mượn sách");
            System.out.println("ẤN 3 để xem danh sách sinh viên,tên sách cần trả vào cuối tháng");
            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    System.out.println("Nhập tên SV");
                    sc.nextLine();
                    String Name = sc.nextLine();
                    System.out.println("Nhập mã SV");
                    String MaSv = sc.nextLine();
                    System.out.println("Nhập lớp của SV");
                    String Class = sc.nextLine();
                    System.out.println("Nhập số phiếu mượn");
                    int Sophieumuon = sc.nextInt();
                    System.out.println("Nhập ngày mượn");
                    LocalDate Ngaymuon = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    System.out.println("Nhập hạn trả");
                    LocalDate HanTra = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
                    System.out.println("Nhập số hiệu sách");
                    sc.nextLine();
                    String soHieusach = sc.nextLine();
                    manager.addSinhVien(new Themuon(Name,MaSv,Class,Sophieumuon,Ngaymuon,HanTra,soHieusach));
                    break;
                case 2:
                    manager.showALL();
                    break;
                case 3:
                    manager.showList();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice !");
            }
        }

    }
}
