package solution;

/**
 * 557. 反转字符串中的单词 III
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "Let's take LeetCode contest"
 * 输出: "s'teL ekat edoCteeL tsetnoc"
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * @author 江峰
 * @create 2020-04-29   23:15
 */
public class Solution557 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            char[] chars = arr[i].toCharArray();
            int halfLen = chars.length >> 1;
            int index = chars.length - 1;
            for (int j = 0; j < halfLen; j++) {
                char temp = chars[j];
                chars[j] = chars[index];
                chars[index--] = temp;
            }
            StringBuilder sb2 = new StringBuilder();
            for (char aChar : chars) {
                sb2.append(aChar);
            }
            if (i == arr.length - 1) {
                sb.append(sb2);
            } else {
                sb.append(sb2 + " ");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Let's take LeetCode contest";
        String s = new Solution557().reverseWords(str);
        System.out.println("s = " + s);
    }
}
