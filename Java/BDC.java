import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class BDC {
	public static void main(String []args) {
		String n = "";
		int mode = 10;
		int num = 0;
		int tmp = 0;
		Scanner sc = new Scanner(System.in); 
		while(0==0) {
			num = -1;
			n = "";
			System.out.print("请输入一个"+Integer.toString(mode)+"进制数字（输0更改进制，1退出）: ");
			try{
				n = sc.nextLine(); 
				// System.out.println(n);
			} catch(Exception e) {
				System.out.println("错误：请输入 2147483647 以下的数字");
				System.out.println("程序执行结束，即将退出");
				System.exit(0);
			}
			// tmp = Integer.valueOf(n).intValue();
			// System.out.println(n);
			try{
				num = Integer.parseInt((String) n,(int) mode);  //转换成10进制并重新赋值
			} catch(Exception e) {
				/*tmp = 1;
				continue;*/
				System.out.println(n);
			}
			if(num==0){
				tmp = 1;
				System.out.print("请输入进制：");
				mode = sc.nextInt();
				// System.out.println(mode);
			} else if(num==1) {
				System.exit(0);
			} else if(num!=-1) {
				System.out.print("十进制：");
				System.out.println(num);
				Integer.toHexString(num);
				System.out.println("二进制：" + Integer.toBinaryString(num));
				System.out.println("三进制：" + Integer.toString(num, 3));
				System.out.println("八进制：" + Integer.toOctalString(num));
				System.out.println("十六进制: " + Integer.toHexString(num));
				System.out.println("三十二进制：" + Integer.toString(num, 32));
				System.out.println("三十六进制：" + Integer.toString(num, 36));
			}
		}
	}
}
