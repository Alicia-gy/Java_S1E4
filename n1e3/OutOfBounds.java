package n1e3;
import java.util.ArrayList;

public class OutOfBounds {
	
	private ArrayList<Integer> array;
	
	public OutOfBounds() {
		array = new ArrayList<Integer>();
	}
	
	public void addInt(int num) {
		array.add(num);
	}
	
	public int getInt(int num) {
		return array.get(num);
	}
	

}
