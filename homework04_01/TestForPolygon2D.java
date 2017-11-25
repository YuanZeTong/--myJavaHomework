package homework04_01;
import java.util.*;
public class TestForPolygon2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of the points：");
		int pointNum = input.nextInt();
		System.out.println("Enter the coordinates of the points：");
		Double[] ArrayOfCoordX = new Double[pointNum];
		Double[] ArrayOfCoordY = new Double[pointNum];
		for(int i = 0; i < pointNum; i++) {
			ArrayOfCoordX[i] = input.nextDouble();
			ArrayOfCoordY[i] = input.nextDouble();
		}
		Polygon2D onePolygon = new Polygon2D(pointNum, ArrayOfCoordX,ArrayOfCoordY);
		System.out.println("The total area is " + onePolygon.getArea());
	}

}
