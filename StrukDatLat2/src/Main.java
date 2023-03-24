
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author rafid
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        
        ArrayList<String> Delete = new ArrayList<>();
        Delete.add("Kelinci");
        Delete.add("Kambing");
        Delete.add("Unta");
        
        System.out.println("Hewan : " + Hewan);
        System.out.println("Hewan yang dihapus \n" + Delete);
       
         Iterator<String> iterator = Hewan.iterator();
        while (iterator.hasNext()) {
            String hewan = iterator.next();
            if (Delete.contains(hewan)) {
                iterator.remove();
            }
        }
        
        System.out.println("Output Hewan :");
        System.out.println(Hewan);
    }
}

    
