import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
//1
		ArrayList<Integer> ca = new ArrayList<>();
		int pru = 0;
		try {
		for(int i = 0; i < 5; i++ ) {
			System.out.print("Zadejte pet cislo: ");
			int hh = sc.nextInt();
			ca.add(hh);
			pru += hh;
		}System.out.println("Prumer cisel: "+pru/5);}catch(Exception e){
			System.out.println("Chyba");
			}
		
		System.out.println();
//2		
		
		ArrayList <Integer> ac2 = new ArrayList<>();
		System.out.print("Zadejte pocet cisel, ktere chcete zadat: ");
		int hhh = sc.nextInt();
		boolean c = true;
		while(c) {
			try{System.out.print("Zadejte cislo: ");
			int hh2 = sc.nextInt();
			ac2.add(hh2);
			if(hh2 % 2 == 1 || hh2 / hh2 == 1 ) {
			System.out.println("Je prvocislo.");}
			else{
				System.out.println("Neni prvocislo.");	
			}
			if(hhh == ac2.size()) {
				c = false;
			}
			;}catch(Exception e) {
				System.out.println("Chyba");
				c= true;
				sc.nextLine();
			}

		}
		
		
		
		
		
		}
	}


