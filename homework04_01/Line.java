package homework04_01;

public class Line {
	private MyPoint p1, p2;
	
	//构造方法
	public Line() {
		
	}
	public Line(MyPoint p1, MyPoint p2) {
		this.p1 = p1; 
		this.p2 = p2;
	}
	//判断给定直线是否和本直线相交
	public String[] isIntersect(Line secLine) {
		double a = this.p1.getY() - this.p2.getY(), 
				b = this.p2.getX() - this.p1.getX(),
				e = a * this.p1.getX() + b * this.p1.getY(),
				c = secLine.p1.getY() - secLine.p2.getY(), 
				d = secLine.p2.getX() - secLine.p1.getX(),
				f = c * secLine.p1.getX() + d * secLine.p1.getY();
		double x = (e * d - b * f) / (a * d - b * c);
		double y = (a * f - e * c) / (a * d - b * c);
		String[] info = new String[3];
		if(Math.abs(a * d - b * c) < 1e-7)
			info[0] = "false";
		else {
			info[0] = "true";
			info[1] = "" + x;
			info[2] = "" + y;
		}
		return info;	 
	}
	//判断此直线上某一点是否在线段p1p2上 
	public boolean isPointOnLineSegment(MyPoint p) {
		//double k = (p1.getY() - p2.getY()) / (p1.getX() - p2.getX());
		//double b = (p1.getY() * p2.getX() - p1.getX() * p2.getY()) / (p2.getX() - p1.getX());
		
		if((p.getX() > Math.min(p1.getX(), p2.getX()) && p.getX() < Math.max(p1.getX(), p2.getX() )) &&
				(p.getY() > Math.min(p1.getY(), p2.getY()) && p.getY() < Math.max(p1.getY(), p2.getY() ))
				)
			return true;
		else 
			return false;
	}
}
