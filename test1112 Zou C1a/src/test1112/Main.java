package test1112;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Zadejte polomer valce 1 :");
	int p1 = sc.nextInt();
	System.out.print("Zadejte vysku valce 1 :");
	int v1 = sc.nextInt();
	
    valec vc = new valec(p1 , v1);
    
    System.out.println("Objem valce : "+vc.objem()+"cm3\nPovrch valce : "+(float)vc.povrch()+"cm2");
    
    
    System.out.print("Zadejte polomer valce 2 :");
	int p2 = sc.nextInt();
	System.out.print("Zadejte vysku valce 2 :");
	int v2 = sc.nextInt();
		
	vc.valec2(p2, v2);	
		
    System.out.println("Objem valce : "+vc.objem2()+"cm3\nPovrch valce : "+(float)vc.povrch2()+"cm2");
    
    vc.vysledek();
		
		
		
   //2.zbran 
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
