import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> as = new ArrayList<>();
		System.out.print("Zadejte pocet slovo ktere chcete ulozit: ");
		int cas = sc.nextInt();
		for(int i = 1; i < cas+1 ; i++) {
			sc.nextLine();
			System.out.print("Zadejte slovo("+i+"):");
		    
		    String sl = sc.nextLine();
		    as.add(sl);
		}
		String nejd = "";
		
		for(int i = 0; i < cas ; i++) {
			
			if(as.get(i).length() > nejd.length()) {
				nejd = as.get(i);
			}
		}
		System.out.println("Nejdelsi slovo je: "+nejd);	
		String vt = "";
		for(int i = 0; i < cas ; i++) {
			if(as.get(i).length() >= 3) {
				vt+=as.get(i)+" ";
			}
		}
		System.out.println("Slove ma maximalne 3 znaky je: "+vt);

		System.out.println();
//2
		ArrayList<Zvire> az = new ArrayList();
		az.add(new Zvire("Slon",1000));
		az.add(new Zvire("Ptakopisk",40));
		az.add(new Zvire("Mravenec",0.5));
		az.add(new Zvire("Zelva",5));
		
		double nejle = Double.MAX_VALUE;
		for(int i = 0; i < az.size(); i++) {
			System.out.println(az.get(i).toString());
			if(az.get(i).getVaha() < nejle) {
				nejle = az.get(i).getVaha();
			}
		}
		for(int i = 0; i < az.size(); i++) {
			if(az.get(i).getVaha() == nejle) {
				System.out.print("Nejlehci zvire je: "+az.get(i).getName()+" "+ az.get(i).getVaha()+"kg");
			}
		}
		
		
	sc.close();	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
