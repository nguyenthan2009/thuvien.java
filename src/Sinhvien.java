import java.time.LocalDate;

public class Sinhvien{
    private String Name;
    private String MaSV;
    public String Class;
    public Sinhvien(){}

    public Sinhvien(String name, String maSV, String aClass) {
        Name = name;
        MaSV = maSV;
        Class = aClass;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMaSV() {
        return MaSV;
    }

    public void setMaSV(String maSV) {
        MaSV = maSV;
    }

    public String getclass() {
        return Class;
    }

    public void setClass(String aClass) {
        Class = aClass;
    }

    @Override
    public String toString() {
        return "Sinhvien{" +
                "Name='" + Name + '\'' +
                ", MaSV='" + MaSV + '\'' +
                ", Class='" + Class + '\'' +
                '}';
    }
}
