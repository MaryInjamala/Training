import java.util.Set;
import java.util.TreeSet;

public class Hashset {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>(); //set don't save elements in a particular order.
		for (int i = 1; i < 100; i++) {
			names.add("Ram"+i);
		}
		names.add("Ram0");
		System.out.println(names);
	}

}