import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 387. 字符串中的第一个唯一字符
 * <p>
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 * <p>
 * 案例:
 * <p>
 * s = "leetcode"
 * 返回 0.
 * <p>
 * s = "loveleetcode",
 * 返回 2.
 *  
 * <p>
 * 注意事项：您可以假定该字符串只包含小写字母。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-unique-character-in-a-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 江峰
 * @create 2019-12-04   10:59
 */
public class Solution387 {
    public int firstUniqChar(String s) {
        if (Objects.isNull(s)) {
            throw new NullPointerException("参数s为空");
        }
        char[] arr = s.toCharArray();
        int length = arr.length;
        Map<Character, Integer> map = new LinkedHashMap<Character, Integer>(length);
        for (char c : arr) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < length; i++) {
            if (map.get(arr[i]) == 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        String arr = "loveleetcode";
        int i = new Solution387().firstUniqChar(arr);
        System.out.println(i);
    }
}
