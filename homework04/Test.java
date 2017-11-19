package homework04;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle2D t = new Triangle2D(new MyPoint(0, 0), new MyPoint(4, 0), new MyPoint(0, 3));
		System.out.println("The area of this triangle is " + t.getArea());
		System.out.println("The perimeter of this triangle is " + t.getPerimeter());
		System.out.println("给定点是否在这个三角形内： " + t.contains(new MyPoint(1,1)));
		System.out.println("给定三角形是否在这个三角形内： " + t.contains(new Triangle2D(new MyPoint(1, 1), new MyPoint(2, 1), new MyPoint(1.5, 1.5))));
		System.out.println("给定三角形是否与这个三角形重叠： " + t.overlaps(new Triangle2D(new MyPoint(5,0), new MyPoint(6, 0), new MyPoint(5.5, 6))));
	}

}
