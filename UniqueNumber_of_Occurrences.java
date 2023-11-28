package Arrays.letco.Codepratice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

//UniqueNumberofOccurrences

public class UniqueNumber_of_Occurrences {

    public static void main(String[] args){



        int[] arr = {1,1,2,3,3,3};
        Map<Integer,Integer> m = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {


            if (m.containsKey(arr[i])) {
                m.put(arr[i], m.merge(arr[i],1,(q,w) -> q + w));
            }else{
                m.put(arr[i],1);

            }
        }

        System.out.println(m);

        HashSet set = new HashSet(m.values());

        boolean flag = m.size() == set.size();


        System.out.println(flag);

    }
}
