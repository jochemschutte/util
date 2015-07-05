package gen;

public class Set{
	
	public static String set(String type, String field){
		return "	public void set" + Super.upper(field) + "(" + type + " " + field + "){\n" +
			"		this." + field + " = " + field + ";\n" +
			"	}\n\n";
	}
	
	public static void main(String[] a){
		String[] args;
		if(a.length == 1){
			args = a[0].split(" ");
		}else{
			args = a;
		}
		int i = 0;
		String result = "";
		while(i+1 < args.length){
			result += set(args[i], args[i+1]);
			i = i+2;
		}
		Super.toClipboard(result);
	}
}



