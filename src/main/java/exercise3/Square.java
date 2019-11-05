package exercise3;

public class Square extends ConvexPolygon {
	private Point vertex;
	private int sidelength;
	public Square(Point vertex,int sidelength) {
		this.vertex=vertex;
		this.sidelength=sidelength;		
	}
	
	public Point getvertex() {return vertex;}
	public int getsidelength() {return sidelength;}
	
}
