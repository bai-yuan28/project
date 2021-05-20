import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		Random rd = new Random();
		int spravne = 0;
		int spatne = 0;
		
		System.out.print("a) sèítání, odèítání, násobení a dìlení celých èísel\r\n" + 
				"\nb) sèítání, odèítání, násobení a dìlení zlomkù\n" + 
				"\nc) pøevody mezi èíselnými soustavami - desítkovou, dvojkovou a šestnáctkovou soustavou"+
				"\nVybrete se co chcete zkouset: ");
		String vyb = sc.next();
		switch(vyb) {
		case "a": 
			System.out.print("a) sèítání\n"
					+ "b) odèítání\n"
					+ "c) násobení\n"
					+ "d) dìlení\n"
					+ "e) vsechno\n"
		+"Vyberte: ");
			String va = sc.next();
			switch(va) {
			case"a":
				System.out.print("Zadejte pocet zkousek: ");
				int va1 = sc.nextInt();
				for(int i = 0; i < va1; i++) {
					int c = rd.nextInt(200)-100;
					int c2 = rd.nextInt(200)-100;
					System.out.println(c+" + "+c2+"= ?" );
					int vysl = c + c2;
					System.out.print("Vysledek: ");
					int vyls = sc.nextInt();//vyls = vysledek scitani
					if(vyls == vysl) {
						spravne++;
					}else{
						spatne++;
					}
				}
			}
			
		}
		System.out.println("Spravne: "+spravne);
		System.out.println("Spatne: "+spatne);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
