package LeetCode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SingleNumberII {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={1,1,1,3,3,3,5};
		System.out.println(singleNumber(a));
	}
	public static int singleNumber(int[] A) {
		HashMap<Integer, Integer> hashMap=new HashMap<>();
		for(int i=0;i<A.length;i++){
			if(!hashMap.containsKey(A[i]))
				hashMap.put(A[i], 1);
			else {
				if(hashMap.get(A[i]) == 2)
					hashMap.remove(A[i]);
				else {
					hashMap.put(A[i], hashMap.get(A[i])+1);
				}
			}
		}
		Iterator iter = hashMap.entrySet().iterator();
		Map.Entry entry = (Map.Entry) iter.next();
        return (int) entry.getKey();
    }
}
