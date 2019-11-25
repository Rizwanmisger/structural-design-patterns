
package flyweight;

public class Demo {

	public static void main(String[] args) {

		InventorySystem ims = new InventorySystem();
		ims.takeOrders("Samsung TV", 121);
		ims.takeOrders("MI TV", 122);
		ims.takeOrders("Samsung TV", 123);
		ims.takeOrders("Samsung TV", 900);
		ims.process();
		System.out.println(ims.report());
	}
}
