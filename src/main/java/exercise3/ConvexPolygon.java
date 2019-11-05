package exercise3;
import java.util.*;

public class ConvexPolygon {
	protected Point[] vertices;
	
	public ConvexPolygon(Point[] vertices) {
		this.vertices=vertices;
	}
	
	public Point[] getvertices() {return vertices;	}
	
	public double perimeter() {
		double p=0;
		for(int i=0;i<this.vertices.length-1;i++) {
			p+=Math.sqrt(Math.pow(vertices[i].getx()-vertices[i+1].getx(),2)+Math.pow(vertices[i].gety()-vertices[i+1].gety(),2));
		}
		p+=Math.sqrt((Math.pow(vertices[this.vertices.length-1].getx()-vertices[0].getx(),2)+Math.pow(vertices[this.vertices.length-1].gety()-vertices[0].gety(),2)));
		return p;
	}
	
	public double area() {
		return -1;
	}
	
}