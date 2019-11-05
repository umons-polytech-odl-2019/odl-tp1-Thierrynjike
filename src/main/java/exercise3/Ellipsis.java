package exercise3;

public class Ellipsis {
	protected Point center; 
	protected int xAxisLength,yAxis2Lenght;
	
	public Ellipsis(Point center,int xAxixLength,int yAxixLength) {
		this.center=center;
		this.xAxisLength=xAxisLength;
		this.yAxis2Lenght=yAxis2Lenght;
	}
	
	public Point getcenter(){return center;}
	public int getxAxisLength(){ return xAxisLength;}
	public int getyAxis2Lenght(){ return yAxis2Lenght;}
	
}
