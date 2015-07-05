package gen;

import java.util.Arrays;

public class Cons{
	
	public static String constructor(String c, String[] data){
		String result = "	public " + c + "(";
		int i = 0;
		String delim = "";
		while(i+1 < data.length){
			result += delim + data[i] + " " + data[i+1];
			delim = ", ";
			i = i+2;
		}
		result += "){\n";
		i = 0;
		while(i+1 < data.length){
			result += "		this." + data[i+1] + " = " + data[i+1] + ";\n";
			i = i+2;
		}
		result += "	}\n\n";
		return result;
	}
	
	public static void main(String[] s){
		String[] a = s[0].split(" ");
		String[] args = Arrays.copyOfRange(a, 1, a.length);
		Super.toClipboard(constructor(a[0], args));
	}
	
}
