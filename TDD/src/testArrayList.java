import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class testArrayList {
List<String> list;
	
	@Before
	public void init() {
		list = new ArrayList<>();
	}
	
	@Test
	public void testAdd() {
		boolean result = list.add("Mary");
		assertTrue(result);
		//We can also use assertEquals(1, list.size()) instead os assertTrue.
		
	}
	
	@Test
	public void testRemove() {
		list.add("Mary");
		list.add("Priyanka");
		list.add("Madhu");
		
		String result = list.remove(2);
		assertEquals("Madhu", result);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemoveFromBlank() {
		String result = list.remove(0);
		assertEquals("Mary", result);
	}
	
	@Test
	public void testClear() {
		list.add("Mary");
		list.add("Priyanka");
		list.add("Madhu");
		
		list.clear();
		assertEquals(0, list.size());
	}

}
