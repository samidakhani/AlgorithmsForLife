/**
 * Created by sdakhani on 5/4/16.
 */
public class LargestPrimeNumber {

    public static boolean isPrime(int num){

        for(int i=2;i<=num/2;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        int num1=1001;
        int num2=999;

        boolean decreaseNum1 = true;
        int product = 1;

        while(num1 >= 100 && num2 >= 100){

            if(decreaseNum1){
                num1 = num1-2;
                decreaseNum1 = false;
            }else{
                num2 = num2-2;
                decreaseNum1 = true;
            }

            product = num1 * num2;
            if(isPrime(product)){
                System.out.println(product);
                break;
            }

        }

    }
}
