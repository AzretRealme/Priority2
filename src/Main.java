import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args){
        /*Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };*/
        PriorityQueue<Tickets> priorityQueue = new PriorityQueue<>(new customComparator());
        priorityQueue.add(new Tickets(200, false));
        priorityQueue.add(new Tickets(100, false));
        priorityQueue.add(new Tickets(300, true));
        priorityQueue.add(new Tickets(250, true));
        priorityQueue.add(new Tickets(230, false));
        priorityQueue.add(new Tickets(240, true));
        priorityQueue.add(new Tickets(210, false));

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll().getCost());
        }

        System.out.println("-------------------");

        PriorityQueue<Tickets> priorityQueue1 = new PriorityQueue<>(new customComparator());

        priorityQueue1.add(new Tickets(200, false));
        priorityQueue1.add(new Tickets(300, true));
        priorityQueue1.add(new Tickets(230, false));
        priorityQueue1.add(new Tickets(240, true));
        priorityQueue1.add(new Tickets(250, true));
        priorityQueue1.add(new Tickets(100, false));
        priorityQueue1.add(new Tickets(210, false));

        while(!priorityQueue1.isEmpty()){
            System.out.println(priorityQueue1.poll().isVIP());
        }
    }
}
