import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in); 
		Random rd = new Random();
		int spravne = 0;
		int spatne = 0;
		
		System.out.print("a) s��t�n�, od��t�n�, n�soben� a d�len� cel�ch ��sel\r\n" + 
				"\nb) s��t�n�, od��t�n�, n�soben� a d�len� zlomk�\n" + 
				"\nc) p�evody mezi ��seln�mi soustavami - des�tkovou, dvojkovou a �estn�ctkovou soustavou"+
				"\nVybrete se co chcete zkouset: ");
		String vyb = sc.next();
		switch(vyb) {
		case "a": 
			System.out.print("a) s��t�n�\n"
					+ "b) od��t�n�\n"
					+ "c) n�soben�\n"
					+ "d) d�len�\n"
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
