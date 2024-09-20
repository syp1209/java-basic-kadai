package kadai_018;

public class KatoIchiro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタの追加
    public KatoIchiro_Chapter18() {
        setGivenName(); // ここで名前をセット
    }
    
     // クラスのフィールドに値をセット
    public void setGivenName() {
        this.givenName = "一郎";
        
    }

    public void eachIntroduce() {
        System.out.println("好きな食べ物はリンゴです"+"\r\n");
    }


}
