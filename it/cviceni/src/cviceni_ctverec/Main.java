package cviceni_ctverec;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		for( int i = 1; i <= 5 ; i++) {
			System.out.print("Zadejte stran "+i+" : ");
			int x = sc.nextInt();
			Ctverec c = new Ctverec(x);
			System.out.println("Strana ctverce "+ c.vypis());
		}
		System.out.println();
		int j = 1;
		for(;;) {
			if(j == 10) {
				break;
			}
			
			System.out.print(j+" ");
			j++;
		}
		System.out.println("\n Po skonceni cyklu je v j hodnota : "+j);
	}

}
