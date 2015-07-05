package gen;

public class Get{
	
	public static String get(String type, String field){
		return "	public " + type + " get" + Super.upper(field) + "(){\n" +
			"		return this." + field + ";\n" +
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
			result += get(args[i], args[i+1]);
			i = i+2;
		}
		Super.toClipboard(result);
	}

	
	
	
}