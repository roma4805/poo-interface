package tp;

public class Testform {
	  public static void main(String[] args) {
	        Form cercle = new Cercle(5);
	        Form rectangle = new Rectangle(4, 7);
	        Form triangle = new Triangle(3, 4, 5);

	        System.out.println("Cercle - Surface: " + cercle.calculerSurface() + ", Périmètre: " + cercle.calculerPerimetre());
	        System.out.println("Rectangle - Surface: " + rectangle.calculerSurface() + ", Périmètre: " + rectangle.calculerPerimetre());
	        System.out.println("Triangle - Surface: " + triangle.calculerSurface() + ", Périmètre: " + triangle.calculerPerimetre());
	    }

}
