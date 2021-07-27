import java.time.LocalDate;

public class Themuon extends  Sinhvien  {
    private int Sophieumuon;
    private LocalDate Ngaymuon;
    private LocalDate Hantra;
    private String SoHieusach;
    public Themuon(){

    }
    public Themuon(String name, String maSV, String aClass, int sophieumuon, LocalDate ngaymuon, LocalDate hantra, String soHieusach) {
        super(name, maSV, aClass);
        Sophieumuon = sophieumuon;
        Ngaymuon = ngaymuon;
        Hantra = hantra;
        SoHieusach = soHieusach;
    }

    public int getSophieumuon() {
        return Sophieumuon;
    }

    public void setSophieumuon(int sophieumuon) {
        Sophieumuon = sophieumuon;
    }

    public LocalDate getNgaymuon() {
        return Ngaymuon;
    }

    public void setNgaymuon(LocalDate ngaymuon) {
        Ngaymuon = ngaymuon;
    }

    public LocalDate getHantra() {
        return Hantra;
    }

    public void setHantra(LocalDate hantra) {
        Hantra = hantra;
    }

    public String getSoHieusach() {
        return SoHieusach;
    }

    public void setSoHieusach(String soHieusach) {
        SoHieusach = soHieusach;
    }

    @Override
    public String toString() {
        return "Themuon{" +
                "Sophieumuon=" + Sophieumuon +
                ", Ngaymuon=" + Ngaymuon +
                ", Hantra=" + Hantra +
                ", SoHieusach='" + SoHieusach + '\'' +
                "} " + super.toString();
    }
}
