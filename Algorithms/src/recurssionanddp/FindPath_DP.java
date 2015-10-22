package recurssionanddp;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Hashtable;

public class FindPath_DP {

	static int[][] matrix={{0,0,0,0},
        {0,0,-1,-1},
        {-1,0,0,0},
        {0,0,0,0}};
	
    public static boolean isFree(int x,int y){
		
		if(matrix[x][y]==-1)
			return false;
		
		return true;
	}
	
    public static boolean findPath(int x,int y,ArrayList<Point> path,Hashtable<Point, Boolean> cache){
    	
    	if(x < 0 || y < 0 || !isFree(x, y) ){
    		return false;
    	}
    	
    	Point p=new Point(x,y);
    	
    	if(cache.containsKey(p)){
    		return cache.get(p);
    	}
    	
    	boolean isOrigin=((x==0)  &&(y==0));
    	
    	boolean sucess=false;
    	
    	if(isOrigin || findPath(x-1,y,path,cache) || findPath(x, y-1,path,cache)){
    		path.add(p);
    		sucess=true;
    	}
    	cache.put(p,sucess);
    	return sucess;
    }
    
    public static void main(String[] args) {

    	Hashtable<Point,Boolean> cache=new Hashtable<Point, Boolean>();
		ArrayList<Point> path=new ArrayList<Point>();
		findPath(3,3,path,cache);
		
		for (Point point : path) {
			System.out.println("[" +point.x+","+point.y+"]");
		}

	}

}
