package kadai_021;

import java.util.ArrayList;

public class DictionaryExec_Chapter21 {
	
	
	public static void main(String[] args) {
		Dictionary_Chapter21 Dic = new Dictionary_Chapter21();
		Dic.addDicMap();
		
		ArrayList<String> serchWord = new ArrayList<String>();
		serchWord.add("apple");
		serchWord.add("banana");
		serchWord.add("grape");
		serchWord.add("orange");
		
		
		Dic.serch(serchWord);
		
	}
	
}
