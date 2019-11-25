
package flyweight;

import java.util.HashMap;
import java.util.Map;

public class Catalog {

	private Map<String, Item> items = new HashMap<>();

	public Item lookup(String itemName) {

		if ( !items.containsKey(itemName)) {
			Item item = new Item(itemName);
			items.put(itemName, item);
		}
		return items.get(itemName);
	}

	public int totalItemsMade() {

		return items.size();
	}
}
