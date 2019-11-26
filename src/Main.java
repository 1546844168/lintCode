import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author 江峰
 * @create 2019-11-26   13:34
 */
public class Main {
    public static void main(String[] args) {
        int i = 0;
        test();
    }

    public static void test() {
        Map<String, Integer> map = new LinkedHashMap<String, Integer>();
        map.put("1", 1);
        map.put("3", 3);
        map.put("4", 4);
        map.put("2", 2);
        map.put("5", 5);
        System.out.println(map.toString());
        Integer integer = map.get("1");
        System.out.println("integer = " + integer);
        System.out.println(map.toString());

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        boolean flag = true;
        if (flag) {
            System.out.println("");
        }
    }
}