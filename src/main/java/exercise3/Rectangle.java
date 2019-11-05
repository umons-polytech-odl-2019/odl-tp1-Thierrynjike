package exercise3;

public class Rectangle extends ConvexPolygon{
	private Point upperLeft;
	private Point lowerRight;
	
	public Rectangle(Point upperLeft,Point lowerRight){
		super(Point[] v={upperLeft,lowerRight});
		/*this.vertices[0]=upperLeft;
		this.vertices[1]=lowerRight;
		*/
	}
	
	public Point getupperLeft() {return upperLeft;}
	public Point getlowerRight() {return lowerRight;}
}
