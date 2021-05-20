package cviceni_ctverec;

public class Ctverec {
private int s;
	
	public boolean setS(int ns) {
		if (ns <= 0) {
			return false;
		}
		this.s = ns;
		return true;
	}
	public int getS() {
		return this.s;
	}
	public String vypis() {
		return "Ctverec o strane "+s;
	}
	public Ctverec(int ns) {
		s = ns;
	}
}
