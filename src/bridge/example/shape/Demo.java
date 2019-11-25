
package bridge.example.shape;

public class Demo {

	public static void main(String[] args) {

		Color greenColor = new GreenColor();
		Color redColor = new RedColor();
		Shape redSquare = new Square(redColor);
		Shape greenSquare = new Square(greenColor);
		Shape greenCircle = new Circle(greenColor);
		redSquare.applyColor();
		greenSquare.applyColor();
		greenCircle.applyColor();
	}
}
