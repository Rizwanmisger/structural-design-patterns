
package flyweight;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventorySystem {

	private final Catalog catalog = new Catalog();
	private final List<Order> orders = new CopyOnWriteArrayList<>();

	void takeOrders(String itemName, int orderNumber) {

		Item item = catalog.lookup(itemName);
		Order order = new Order(orderNumber, item);
		orders.add(order);
	}

	void process() {

		for (Order order : orders) {
			order.processOrder();
			orders.remove(order);
		}
	}

	String report() {

		return "Total Items made" + catalog.totalItemsMade();
	}
}
