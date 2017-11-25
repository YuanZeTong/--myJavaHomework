package homework04_01;
import java.util.*;
public class Polygon2D {
	//多边形的私有数据域
	private int pointNum;
	private ArrayList<Double> listOfCoordX;
	private ArrayList<Double> listOfCoordY;
	//构造函数
	public Polygon2D() {
		
	}
	public Polygon2D(int pointNum, Double[] listOfCoordX, Double[] listOfCoordY) {
		this.pointNum = pointNum;
		this.listOfCoordX = new ArrayList<>(Arrays.asList(listOfCoordX));
		this.listOfCoordY = new ArrayList<>(Arrays.asList(listOfCoordY));
	}
	public double getArea() {
		MyPoint startPoint = new MyPoint(listOfCoordX.get(0), listOfCoordY.get(0));
		double area = 0;
		int indexOfSecondPoint = 1, indexOfThirdPoint = 2;
		for(int i = 0; i < pointNum - 2; i++) {
			MyPoint secondPoint = new MyPoint(listOfCoordX.get(indexOfSecondPoint), 
					listOfCoordY.get(indexOfSecondPoint));
			MyPoint thirdPoint = new MyPoint(listOfCoordX.get(indexOfThirdPoint), 
					listOfCoordY.get(indexOfThirdPoint));
			Triangle2D oneTriangle = new Triangle2D(startPoint, secondPoint, thirdPoint);
			area += oneTriangle.getArea();
			indexOfSecondPoint++;
			indexOfThirdPoint++;
		}
		return area;
	}
	
}
