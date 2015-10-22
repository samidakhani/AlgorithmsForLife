package maths;

public class Line {
    double epsilon=0.0001;
	double slope;
	double y_intercept;
	
	public Line(double slope,double y_intercept){
		this.slope=slope;
		this.y_intercept=y_intercept;
	}
	
	public boolean doIntersect(Line line2){
		
		return Math.abs(slope-line2.slope) > epsilon || Math.abs(y_intercept - line2.y_intercept) < epsilon ;
	}
	
	public static void main(String[] args) {
		
		Line line1=new Line(1, 12);
		Line line2=new Line(1, 88);
		System.out.println(line1.doIntersect(line2));
	}
}
