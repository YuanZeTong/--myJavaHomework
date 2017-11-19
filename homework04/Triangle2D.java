package homework04;

public class Triangle2D {
	private MyPoint p1, p2, p3;
	
	//构造方法
	public Triangle2D(){
		p1 = new MyPoint(0,0);
		p2 = new MyPoint(1,1);
		p3 = new MyPoint(2,5);
	}
	public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3){
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	//返回三角形面积的方法
	public double getArea(){
		double s = (p1.distance(p2) + p2.distance(p3) + p3.distance(p1)) / 2.0;
		double area = Math.pow(s * (s - p1.distance(p2)) * (s - p2.distance(p3)) 
				* (s - p3.distance(p1)), 0.5);
		return area;
	}
	//返回三角形周长的方法
	public double getPerimeter(){
		return p1.distance(p2) + p2.distance(p3) + p3.distance(p1);
	}
	//判断给定点是否在三角形内
	public boolean contains(MyPoint p) {
		Triangle2D t1 = new Triangle2D(p, p1, p2);
		Triangle2D t2 = new Triangle2D(p, p3, p2);
		Triangle2D t3 = new Triangle2D(p, p1, p3);
		if(Math.abs(t1.getArea() + t2.getArea() + t3.getArea() - this.getArea()) < 1e-7 )
			return true;
		else 
			return false;
	}
	//判断给定的三角形是否在本三角形内
	public boolean contains(Triangle2D t) {
		if(this.contains(t.p1) && this.contains(t.p2) && this.contains(t.p3))
			return true;
		else 
			return false;
		
	}
	//判断给定三角形是否和本三角形重叠
	public boolean overlaps(Triangle2D t) {
		Line[] allSidesOfOneTriangle = new Line[3], allSidesOfAnotherTriangle = new Line[3];
		allSidesOfOneTriangle[0] = new Line(p1, p2);
		allSidesOfOneTriangle[1] = new Line(p2, p3);
		allSidesOfOneTriangle[2] = new Line(p1, p3);
		allSidesOfAnotherTriangle[0] = new Line(t.p1, t.p2);
		allSidesOfAnotherTriangle[1] = new Line(t.p2, t.p3);
		allSidesOfAnotherTriangle[2] = new Line(t.p1, t.p3);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3;j++) {
				String[] result = allSidesOfOneTriangle[i].isIntersect(allSidesOfAnotherTriangle[j]);
				if(result[0].equals("true")) {
					MyPoint intersection = new MyPoint(Double.parseDouble(result[1]),Double.parseDouble(result[2]));
					if(allSidesOfOneTriangle[i].isPointOnLineSegment(intersection))
						return true;
				}
			}
		}
		return false;
	}
	//get与set 方法
	public MyPoint getP1(){
		return p1;
	}
	public MyPoint getP2(){
		return p2;
	}
	public MyPoint getP3(){
		return p3;
	}
	public void setP1(MyPoint p1){
		this.p1 = p1;
	}
	public void setP2(MyPoint p2){
		this.p2 = p2;
	}
	public void setP3(MyPoint p3){
		this.p3 = p3;
	}
}
