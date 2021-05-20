package cviceni1112;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rd = new Random();
		int sum = 0;
		for(int i = 1;  i< 21  ; i++ ) {
			int c = rd.nextInt(200)-100;
			if(c % 2) {
				System.out.println(c+"je sude.");
				sum++;
			}
		}
	}

}
