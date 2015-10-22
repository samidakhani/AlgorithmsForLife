package recurssionanddp;

import java.awt.Point;
import java.util.ArrayList;

public class FindPath_Recursive {

	static int[][] matrix={{0,0,0,0},
		                   {0,0,-1,-1},
		                   {-1,0,0,0},
		                   {0,0,0,0}};
	
	public static boolean isFree(int x,int y){
		
		if(matrix[x][y]==-1)
			return false;
		
		return true;
	}
	
	public static boolean findPath(int x,int y,ArrayList<Point> path){

		if(x < 0 || y < 0 || !isFree(x,y)){
			return false;
		}
		
		boolean isOrigin=((x==0) && (y==0));
		
		if(isOrigin || findPath(x-1, y,path) || findPath(x, y-1,path) ){
			Point p=new Point(x,y);
			path.add(p);
			return true;
		}
		
		
		return false;
	}
	
	public static void main(String[] args) {

		ArrayList<Point> path=new ArrayList<Point>();
		findPath(3,3,path);
		
		for (Point point : path) {
			System.out.println("[" +point.x+","+point.y+"]");
		}

	}

}
