import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 20. 有效的括号
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 *
 * @author 江峰
 * @create 2020-04-10   11:11
 */
public class Solution20 {
    public boolean isValid(String s) {
        if (s == null) {
            throw new IllegalArgumentException("参数不能为空");
        }
        // 字符串长度为奇数，直接返回false。
        int strLen = s.length();
        if (strLen % 2 != 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('}', '{');
        map.put(']', '[');
        map.put(')', '(');
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < strLen; i++) {
            char c = s.charAt(i);
            // If the current character is a closing bracket.
            if (map.containsKey(c)) {
                // Get the top element of the stack. If the stack is empty, set a dummy value of '#'
                char topElement = stack.empty() ? '#' : stack.pop();
                // If the mapping for this bracket doesn't match the stack's top element, return false.
                if (topElement != map.get(c)) {
                    return false;
                }
            } else {
                // If it was an opening bracket, push to the stack.
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        boolean flag = new Solution20().isValid("{}{}[]");
        System.out.println("flag = " + flag);
    }
}
