package Arrays.letco;

import java.util.Arrays;
import java.util.PriorityQueue;


//Input: points = [[1,3],[-2,2]], k = 1
//Output: [[-2,2]]
//Explanation:
//The distance between (1, 3) and the origin is sqrt(10).
//The distance between (-2, 2) and the origin is sqrt(8).
//Since sqrt(8) < sqrt(10), (-2, 2) is closer to the origin.
//We only want the closest k = 1 points from the origin, so the answer is just [[-2,2]].
//Example 2:
//
//Input: points = [[3,3],[5,-1],[-2,4]], k = 2
//Output: [[3,3],[-2,4]]
//Explanation: The answer [[-2,4],[3,3]] would also be accepted.
//
public class KClosestPointstoOrigin {
    public static int[][] kClosest(int[][] points, int k) {

        int[][] res = new int[k][2];
        PriorityQueue<int[]> queue = new PriorityQueue<>((x, y) -> (x[0]*x[0] + x[1]*x[1]) - (y[0]*y[0] + y[1]*y[1]));

        for(int[] p : points){
            queue.add(p);
        }


        for(int i = 0; i < k ; i++){
            res[i] = queue.poll();

        }

        String array2DString = Arrays.deepToString(res);
        System.out.println("2D Array as String: " + array2DString);


        return res;
    }
    public static void main(String[] args){

        int[][] points = {{3,3},{5,-1},{-2,4}};
        Integer k = 2;
        System.out.println(kClosest(points,k));

    }
}
