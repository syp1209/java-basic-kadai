package kadai_018;

//子クラス
public class KatoHanako_Chapter18 extends Kato_Chapter18 {
	
    // コンストラクタの追加
    public KatoHanako_Chapter18() {
        setGivenName(); // ここで名前をセット
    }
    
     // クラスのフィールドに値をセット
    public void setGivenName() {
        this.givenName = "花子";
        
    }

    public void eachIntroduce() {
        System.out.println("趣味は読書です"+"\r\n");
    }


}
