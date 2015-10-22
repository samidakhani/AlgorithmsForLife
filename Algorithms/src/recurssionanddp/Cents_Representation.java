package recurssionanddp;

public class Cents_Representation {

	public static int countCents(int amount,int[] denoms,int index,int[][] map){
		if(map[amount][index] != 0){
			return map[amount][index];
		}
		
		if(index >= denoms.length -1) return 1;
		int denomamount=denoms[index];
		int ways=0;
		
		for (int i = 0; i*denomamount <= amount; i++) {
			int remamount=amount- ( i * denomamount);
			ways +=countCents(remamount,denoms,index +1,map);
		}
		map[amount][index]=ways;
		return ways;			
	}
	
	public static int countCents(int amount,int[] denoms,int index){
	  int[][] map=new int[amount +1][denoms.length]; 
	   return countCents(amount, denoms, index,map);
	}
	
	
	public static void main(String[] args) {
		
		int amount=100;
		int[] denoms={25,10,5,1};
		System.out.println(countCents(amount,denoms,0));

	}

}
