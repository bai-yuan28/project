import java.util.ArrayList;
public class metoda {

	ArrayList<Integer> c = new ArrayList<>();
	
	public void setC(int i) {
		c.add(i);
	}
	public String getC() {
		 
		return c.toString();
	}
	public void plus() {
		int a =0;
		a = c.get(0)+c.get(1);
		c.set(0, a);
		c.remove(1);
	}
}
