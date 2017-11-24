package homework04_01;
import java.lang.*;
public class MyPoint {
	private double x;
	private double y;
	
	public MyPoint(){
		x = 0;
		y = 0;
	}
	
	public MyPoint(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	public double distance(MyPoint a){
		double dis = Math.pow(Math.pow(a.x - x, 2.0) + Math.pow(a.y - y, 2.0), 0.5);
		return dis;
	}
	
	public double distance(double x, double y){
		return Math.pow(Math.pow(x - this.x, 2.0) + Math.pow(y - this.y, 2.0), 0.5);
	}
	
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
}
