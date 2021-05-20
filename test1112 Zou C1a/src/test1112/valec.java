package test1112;

public class valec {

	private int polomer;
	private int vyska;
	private int polomer2;
	private int vyska2;
	
	public  valec(int np, int nv) {
		this.polomer = np;
		this.vyska = nv;
	}
	public void valec2(int pol, int vy) {
		this.polomer2 = pol;
		this.vyska2 = vy;
	}

	public int getP() {
		return this.polomer;
	}
	public int getP2() {
		return this.polomer2;
	}
	public double objem() {
		return 2*3.14*polomer*vyska;
	}
	public double povrch() {
		return 2*3.14*polomer*(polomer+vyska);
	}
	public double objem2() {
		return 2*3.14*polomer2*vyska2;
	}
	public double povrch2() {
		return 2*3.14*polomer2*(polomer2+vyska2);
	}
public void vysledek() {
	if(objem() > objem2()) {
		System.out.println("Valec 1"+"("+objem()+"cm3)"+ " ma vetsi objem nez valec 2 "+objem2()+"cm3).");
	}else if(objem() < objem2()){
		System.out.println("Valec 2"+"("+objem2()+"cm3)"+ " ma vetsi objem nez valec 1 "+objem()+"cm3).");
	}else {
		System.out.println("Je to stejne.");
	}
	if(povrch() > povrch2()) {
		System.out.println("Valec 1"+"("+povrch()+"cm2)"+ " ma vetsi povrch nez valec 2 "+povrch2()+"cm2).");
	}else if(povrch() < povrch2()){
		System.out.println("Valec 2"+"("+(float)povrch2()+"cm2)"+ " ma vetsi povrch nez valec 1 "+(float)povrch()+"cm2).");
	}else {
		System.out.println("Je to stejne.");
	}
	}
}






















