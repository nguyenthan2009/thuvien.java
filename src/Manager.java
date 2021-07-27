import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<Themuon> themuons = new ArrayList<>();
    public void addSinhVien(Themuon themuon){
        themuons.add(themuon);
    }
    public void showALL(){
        for (Themuon themuon:
             themuons) {
            System.out.println(themuon);

        }
    }
    public void showList(){
        for (int i=0;i<themuons.size();i++){
            if(themuons.get(i).getHantra().isBefore(LocalDate.now().plusDays(5))){
                System.out.println(themuons.get(i).toString());
            }
        }
    }

}
