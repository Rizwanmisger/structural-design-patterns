
package decorator;

public class MeatDecorator extends SandwichDecorator {

	public MeatDecorator(Sandwich customSandwich) {

		super(customSandwich);
	}

	@Override
	public String make() {

		return customSandwich.make() + addmeat();
	}

	private String addmeat() {

		return " + meat";
	}
}
