package solution;

/**
 * @author 潇潇暮雨
 * @create 2018-09-05   9:25
 */
public class Solution37 {
    /*
   37. 反转一个3位整数
    反转一个只有3位数的整数。
    样例
    123 反转之后是 321。
    900 反转之后是 9。
    abc   cba
    注意事项
    你可以假设输入一定是一个只有三位数的整数，这个整数大于等于100，小于1000。
     */
    public static int reverseThreeNum(int num){
        if (num < 100 || num > 999)
            return -1;
        int gewei = num % 10;
        int shiwei = num / 10 % 10;
        int baiwei = num / 100;
        int newNum = gewei * 100 + shiwei * 10 + baiwei;
        return newNum;
    }

    public static void main(String[] args) {
        int i = reverseThreeNum(108);
        System.out.println("i = " + i);
    }

}
