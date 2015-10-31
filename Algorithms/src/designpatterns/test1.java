package designpatterns;

public class test1 {

	public static void drawSteps(int N){
		
		for(int i=1;i<6;i++){
			
			for(int j=1;j<N-i;j++){
				System.out.print(" ");
			}
			
			for(int j=N-i+1;j<=N;j++){
				System.out.print("#");
			}
			
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       drawSteps(6);
	}

}
