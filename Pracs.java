package Arrays.letco.Codepratice;

import java.util.Arrays;

public class Pracs {

    public static void main(String[] args){
        int[] arr = {5,1,1,2,3,3,3,9,9};
//        Map<Integer,Integer> m = new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
//
//
//            if (m.containsKey(arr[i])) {
//                m.put(arr[i], m.get(arr[i]) + 1);
//            }else{
//                m.put(arr[i],1);
//            }
//        }
//        System.out.print(m);
//        HashSet m1 = new HashSet(m.values());
//
//        System.out.print(m1);
        int[] c = new int[15];
        //count occurance of each value
        for (int n : arr) {
            c[n+0]++;
        }
        System.out.print(Arrays.toString(c));

        // Merge Sorted Array
    }
}
