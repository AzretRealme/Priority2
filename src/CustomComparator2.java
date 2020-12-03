
import java.util.Comparator;
public class CustomComparator2 implements Comparator<Tickets>{
        @Override
        public int compare(Tickets o1, Tickets o2){
            if(o2.isVIP()){
                return 1;
            }else if
                (!o2.isVIP()){
                    return -1;
                }else{
                    return 0;
                }
            }
        }


