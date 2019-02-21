
import java.lang.*;
public class  StringTest{
	public static void main (String[] args)
	{
		// String s = "";
		// long sBeginTime = System.currentTimeMillis();
		// for (int i = 0; i < 100000; i++) {
		// 	s+="s";
		// }
		// long sEndTime = System.currentTimeMillis();
		// System.out.println("s拼接100000遍s耗时: " + (sEndTime - sBeginTime) + "ms");

		StringBuffer s1 = new StringBuffer();
		long s1BeginTime = System.currentTimeMillis();
		for (int j = 0; j < 100000; j++) {
			s1.append("s");
		}
		long s1EndTime = System.currentTimeMillis();
		System.out.println("s1拼接100000遍s耗时: " + (s1EndTime - s1BeginTime) + "ms");

		StringBuilder s2 = new StringBuilder();
		long s2BeginTime = System.currentTimeMillis();
		for (int k= 0; k < 100000; k++) {
			s2.append("s");
		}
		long s2EndTime = System.currentTimeMillis();
		System.out.println("s2拼接100000遍s耗时: " + (s2EndTime - s2BeginTime) + "ms");

		String[] tdArr=...;            
		String result=MessageFormat.format("<tr bgcolor='#cef'><td>{0}</td><td>{1}</td><td>{2}</td><td>{3}</td></tr>", tdArr);
		
	}
}