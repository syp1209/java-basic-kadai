package kadai_018;
//親クラス
abstract public class Kato_Chapter18 {
	public String familyName = "加藤"; //	姓を表す
	public String givenName;//	名を表す
	public String address = "東京都中野区〇×";//	住所を表す

	
	//紹介を実行する
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
	}
	
	//共通の紹介を出力する
	public void commonIntroduce() {
		System.out.println("名前は" + this.familyName + this.givenName + "です");
		System.out.println("住所は" + this.address + "です");
		
	};
	
    //セッター(アクセス修飾子public)
    public void setGivenName(String str) {
       this.givenName = str;
    }
    
	//個別の紹介を出力する
	public abstract void eachIntroduce();
	
};