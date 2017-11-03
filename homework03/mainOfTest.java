package homework03;

public class mainOfTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RegularPolygon r1 = new RegularPolygon();
		RegularPolygon r2 = new RegularPolygon(6, 4);
		RegularPolygon r3 = new RegularPolygon(10, 4, 5.6, 7.8);
		
		double pOfR1 = r1.getPerimeter();
		System.out.println("默认多边形的周长为: " + pOfR1);
		
		double aOfR1 = r1.gerArea();
		System.out.println("默认多边形的面积为: " + aOfR1);
		
		double pOfR2 = r2.getPerimeter();
		System.out.println("边数为6，边长为4的多边形周长为: " + pOfR2);
		
		double aOfR2 = r2.gerArea();
		System.out.println("边数为6，边长为4的多边形面积为:  " + aOfR2);
		
		double pOfR3 = r3.getPerimeter();
		System.out.println("边数为10，边长为4的多边形周长为 " + pOfR3);
		
		double aOfR3 = r3.gerArea();
		System.out.println("边数为10，边长为4的多边形面积为: " + aOfR3);
	}
}
