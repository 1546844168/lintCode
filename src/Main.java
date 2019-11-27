import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 江峰
 * @create 2019-11-26   13:34
 */
public class Main {

    public static void main(String[] args) {
        Set<Integer> integers = new HashSet<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}