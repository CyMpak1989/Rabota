import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/**
 * Created by CyMpak on 17.09.2015.
 */
public class Start {
    public static void main(String[] args) throws IOException {
        Calculation a = new Calculation();
        System.out.println("Программа подсчета времени!");
        System.out.println();

        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String name = reader.readLine();
        a.setStartTime(8, 0);
        a.setEndTime(16, 0);
        System.out.println(a.getStartTime());
        System.out.println(a.getEndTime());
        System.out.println(a.getRealTime());
        System.out.println();
        System.out.println(a.getFinalTime());


    }
}
