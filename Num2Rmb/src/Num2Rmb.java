import java.util.Arrays;
import java.util.Scanner;

public class Num2Rmb {

	private String[] hanArr = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
    private String[] unitArr = {"十","佰","仟","万","十万","佰万","仟万","亿"};
    /*
     * 把一个浮点数分为小数部分和整数部分
     * @ param num 需要被分解的浮点数
     * @ return 分解出来的整数部分和小数部分，第一个数组元素是整数部分，第二个数组元素是小数部分
     */
    
    private String[] divide(double num){
            
            //将一个浮点数强制转换成long型，即可得到该浮点数的整数部分
            long zheng = (long)num;
            //浮点数减去整数部分即得小数部分，小数部分乘100再取整得到小数部分
            long xiao = Math.round(100 * (num - zheng));
//            //下面用了两种方法把整数转换成字符串
            String[] numStr = new String[]{String.valueOf(zheng),String.valueOf(xiao)};
            return numStr;
    }        
    /*
     * 把一个四位的数字字符串变成汉字字符串
     * @ param numStr 需要被转换的四位的数字字符串
     * @ return 四位的数字字符串被转换成汉字字符串
     */
    
    private String toHanStr(String numStr){
            
            String result = "";
            int numLen = numStr.length();
            //依次遍历数字字符串的每一个数字
            for (int i = 0;i < numLen ; i++ )
            {
                    //把char型数字转换成int型数字，因为他们的ASCII码值恰好相差48
                    //因此把char型数字减去48得到int型数字
                    int num = numStr.charAt(i) - 48;
                    
                    
                    //如果最高位是零，不对结果做任何处理
                    //如果最低位是零，则最低位不做任何处理
                    //如果不是最后一位数字，而且数字不是零，则需要添加单位（十，佰，仟）否则不要添加单位
                    //如数字中间有零，则不添加单位的同时加零
                    if (num == -2) {
                    	continue;
                    }
                    if (num == 0  && i == 0)
                    {
                            result = "";
                    }
                    else if (num == 0  && i == numLen - 1)
                    {
                            result += "";
                    }
                    else if (num != 0 && i != numLen - 1)
                    {
                    	System.out.println(i);
                    	System.out.println(num);
                            result += hanArr[num] + unitArr[numLen - 2 - i];
                    }
                    else if ((num == 0 && i != numLen - 1)|(num != 0 && i == numLen - 1))
                    {
                            result += hanArr[num];
                    }
            }
            return result;
    }
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Num2Rmb nr = new Num2Rmb();
        //获取浮点数
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入您的浮点数:");
        double num = Double.parseDouble(sc.next());
        
        String[] numstr = nr.divide(num);
        //测试分解
        //System.out.println(Arrays.toString(numstr));
        System.out.println(String.valueOf(num));
        //测试转换
        //System.out.println(nr.toHanStr(numstr.toString()));
        System.out.println(nr.toHanStr(String.valueOf(num)));

	}

}
