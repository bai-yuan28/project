package cviceni1512;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int vysledek = 0;
		
			
			System.out.println("Zadete kladne cislo :  ");
			int bs = sc.nextInt();
			while(bs > 0) {
				if(bs == 1 ) {
					System.out.print("Zadejte cislo k scitani : ");
					bs = sc.nextInt();
				}else if(bs == 2) {
					System.out.print("Zadejte cislo k odcitani : ");
					bs = sc.nextInt();
					vysledek -= bs; 
				}
			vysledek += bs;
			
			
		}
		
		System.out.print("aaaaaaa : " +vysledek);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
