import java.util.Comparator;

public class customComparator implements Comparator<Tickets> {

    @Override
    public int compare(Tickets o1, Tickets o2) {
        return o2.getCost() - o1.getCost();
    }

}
