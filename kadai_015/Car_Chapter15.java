package kadai_015;

public class Car_Chapter15 {
    private int gear  = 1; //1速から5速のギアを表す
    private int speed = 10;  //ギアチェンジ後の速度を表す
    
    //ギアの値により速度を変える
    public void gearChange(int afterGear) {
    	System.out.println("ギア"+ gear +"から" + afterGear +"に切り替えました");
    	switch(afterGear) {
    		case 1 -> {
    			this.gear = 1;
    			this.speed= 10;
    		}
    		case 2 -> {
    			this.gear = 2;
    			this.speed = 20;
    		}
    		case 3 -> {
    			this.gear = 3;
    			this.speed = 30;
    		}
    		case 4 -> {
    			this.gear = 4;
    			this.speed = 40;
    		}
    		case 5 -> {
    			this.gear = 5;
    			this.speed = 50;
    		}
    		default -> this.speed = 10;
    	}
    	run();
    }
    
    //ギアチェンジ後の速度を表示する
    public void run() {
    	
    	System.out.println("速度は時速"+ this.speed + "kmです");
    }
}
