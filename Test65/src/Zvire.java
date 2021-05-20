
public class Zvire {

	private String name;
	private double vaha;
	@Override
	public String toString() {
		return "Zvire [jmeno=" + name + ", vaha=" + vaha + "kg]";
	}
	public Zvire(String nN, double nV) {
		this.name = nN;
		this.vaha = nV;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getVaha() {
		return vaha;
	}
	public void setVaha(double vaha) {
		this.vaha = vaha;
	}
	
}
