package Arrays.letco;

//Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
public class CountPrimes {
    static int counter = 0;
    public static void findPrime(int n){

        if(n == 0 || n == 1)
        {

            System.out.print(0);

        }



        for(int i =2 ; i < n; i++){
//            if(n % i == 0){
//
//                counter++;
//            }
            if(i % i == 0 && i % 2 != 0){
                counter++;
            }

        }

    }

    public static void main(String[] args){
        int n = 10;
        for(int i =1; i < 10; i++){
            findPrime(i);
        }
        System.out.print(counter);





    }
}
