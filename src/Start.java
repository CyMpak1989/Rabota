import java.util.Date;

/**
 * Created by CyMpak on 17.09.2015.
 */
public class Start {
    public static void main(String[] args) {
        Calculation a = new Calculation();

        System.out.println("Программа подсчета времени!");
        System.out.println();
        a.setStartTime(8, 0);
        a.setEndTime(16, 15);
        System.out.println(a.getStartTime());
        System.out.println(a.getEndTime());
        System.out.println(a.getRealTime());
        System.out.println();
        System.out.println(a.getFinalTime());

    }
}
