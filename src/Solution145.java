/**
 * @author 潇潇暮雨
 * @create 2018-09-05   10:50
 */
public class Solution145 {
    /**
     * 145. 大小写转换, 将一个字符由小写字母转换为大写字母
     * 样例:
     * a -> A
     * b -> B
     */
    public char lowercaseToUppercase(char character) {
        char b = (char)(character - 32);
        return b;

    }

}