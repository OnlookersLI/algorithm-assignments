/**
 * @Author: code.rookie
 * @ClassName: PlusOne
 * @Date: 2021/10/9 10:23 上午
 * @PACKAGE_NAME: PACKAGE_NAME
 * @Version: 1
 * @Description 66. 加一
 */
public class PlusOne {
    public static void main(String[] args) {
        System.out.println(plusOne());
    }
    public static int[] plusOne(){
        int[] digits = {1,2,3};
        int len = digits.length;
        for(int i = len-1;i>=0;i--){
            digits[i]++;
            digits[i] %= 10;
            if  (digits[i]!=0){
                return digits;
            }
        }
        digits = new int[len+1];
        digits[0] = 1;
        return digits;
    }
}
