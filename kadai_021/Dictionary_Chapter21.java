package kadai_021;
import java.util.HashMap;
import java.util.List;

public class Dictionary_Chapter21 {

	HashMap<String,String> dicMap = new HashMap<String,String>();
	
	public void addDicMap() {
	   dicMap.put("apple","りんご");
	   dicMap.put("peach","桃");
	   dicMap.put("banana","バナナ");
	   dicMap.put("lemon","レモン");
	   dicMap.put("pear","梨");
	   dicMap.put("kiwi","キウィ");
	   dicMap.put("strawberry","いちご");
	   dicMap.put("grape","ぶどう");
	   dicMap.put("muscat","マスカット");
	   dicMap.put("cherry","さくらんぼ");
	}
	
	
    public void serch(List<String> words) {
        for (String keyword : words) {
    		if(dicMap.get(keyword)==null) {
    			System.out.println(keyword + "は辞書に存在しません");
    		}else {
    			System.out.println(keyword+"の意味は"+dicMap.get(keyword)+"です");
    		}
        }
    }

 

}