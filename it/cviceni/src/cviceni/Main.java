package cviceni;
import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for(int i = 1; i < 11; i++) {// i++ je i = i + 1
			System.out.print(i+" ");
		}
		/*
		 * promenna i je vytvorena v ramci cyklu a pod cykle jiz nexistuje
		 * System.out.println(i);
		 */
		
		for(int i = 1; i < 11; i+=2) {// i++ je i = i + 1
			System.out.print(i+" ");
		}
		/*
		 * promenna i je vytvorena v ramci cyklu a pod cykle jiz nexistuje
		 * System.out.println(i);
		 */
		System.out.println();
		
		for(int i = 10 ; i > 0; i--) {//i-- je i = i - 1
			System.out.print(i+" ");
		}
		
		System.out.println();
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int sum = 0;
		for(int i = 1; i < 6; i++ ) {
			int x = rd.nextInt(10)+1;
			sum += x;
			System.out.print(x+" ");
		}
		
		System.out.println();
		System.out.println("Soucet cislo je "+sum);
		double p = sum /10;
		System.out.println("Prumer cislo je "+ p);
		
		
		int ps = 0;
		for(int i = 1; i <= 5; i++ ) {
		System.out.print("Zadejte cislo "+i+" : ");
			int x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println(x+"je sude.");
		
		ps++;
		 }
		}
		System.out.print("Zadal jsi "+ps+" sudych cislo. ");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
