package gen;

public class GetSet{
	
	public static void main(String[] a){
		String[] args;
		if(a.length == 1){
			args = a[0].split(" ");
		}else{
			args = a;
		}
		String result = "";
		int i = 0;
		while(i+1 < args.length){
			result += Get.get(args[i], args[i+1]);
			result += Set.set(args[i], args[i+1]);
			i = i+2;
		}
		Super.toClipboard(result);
	}
}
