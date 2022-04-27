package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {
		String resultStr = str[0];
        for(int i=1; i < str.length ;i++) {
        	resultStr = resultStr.concat(str[i]);
        }
        return resultStr;
    }
}
