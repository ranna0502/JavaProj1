import java.util.Random;
public class Sample001 {
	public static void main(String[] args) {
//		条件分岐
		Random rand = new Random();
        int num = rand.nextInt(10);
		// !()で、ではない時を意味する
        if (!(num==1)) {
        	System.out.println(num);
        	System.out.println("1ではありません");
        }
		
//		for文で繰り返し
//		ランダムに１０までの乱数を取得
		Random rand = new Random();
		int num = rand.nextInt(10);
		System.out.println(num);
		String squea = "■";
		for (int i = 0; i < num; i += 1) {
			squea += " ■";
		}
		System.out.println(squea);

	}

}