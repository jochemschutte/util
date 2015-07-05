package gen;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class Super{
	
	public static String upper(String s){
		return s.substring(0,1).toUpperCase() + s.substring(1);
	}
	
	public static void toClipboard(String s){
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Clipboard clipboard = toolkit.getSystemClipboard();
		StringSelection strSel = new StringSelection(s);
		clipboard.setContents(strSel, null);

	}
	
}