package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	Jyanken_Chapter26(){
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
	}


	//自分のじゃんけんの手を入力する

	public String getMyChoice() {

		//Scannerクラスのオブジェクトを生成する
		Scanner scanner = new Scanner(System.in);
		//入力した内容を取得する
		
		//System.out.println("前try");
		while(true) {

			String input = scanner.next();
			try {

					System.out.println(input);
					if (!(input.equals("r")) && !(input.equals("s")) && !(input.equals("p"))) {
						System.out.println("入力された値は不正です。再度入力してください");
						continue;
					}

			} finally {
			}	
			scanner.close();
			return input;
		}

	}


	
	//対戦相手のじゃんけんの手を乱数で選ぶ
	public String getRandom() {
		
		HashMap<String,String> jyaMap = new HashMap<String,String>();
		jyaMap.put("r","グー");
		jyaMap.put("s","チョキ");
		jyaMap.put("p","パー");
		
		
		int Random = (int)Math.floor(Math.random() * 3);
		if(Random == 1) {
			return "r";
		} else if(Random == 2) {
			return "s";
		}else {
			return "p";
		}
		
	}
		
	
	//じゃんけんを行う
	public void playGame() {
		
		String my = getMyChoice();
		String partner = getRandom();
		
		System.out.println("自分の手は"+ my+","+"対戦相手の手は" + partner);

	    if ((my.equals("r") && partner.equals("r")) || (my.equals("s") && partner.equals("s")) || (my.equals("p") && partner.equals("p"))) {
	        System.out.println("あいこです");
	    } else if ((my.equals("r") && partner.equals("s")) || (my.equals("s") && partner.equals("p")) || (my.equals("p") && partner.equals("r"))) {
	        System.out.println("あなたの勝ちです");
	    } else {
	        System.out.println("あなたの負けです");
	    }
		
	};

}
