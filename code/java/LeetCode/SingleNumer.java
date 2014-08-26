package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class SingleNumer {

	/**
	 * 采用hash来处理某个数字只出现一次，或者k次的数组
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]={1,1,2,3,3};
		int B[]={5,5,5,4,4,4,7};
		System.out.println(singleNumberByHashSet(A));
		System.out.println(singleNumberByHashMap(B));
	}
	public static int singleNumberByHashSet(int[] A) {
       HashSet<Integer> hSet=new HashSet<>();
       for(int i=0;i<A.length;i++)
       {
    	   if(hSet.contains(A[i]))
    		   hSet.remove(A[i]);
    	   else
    		   hSet.add(A[i]);
       }
       return hSet.iterator().next();
    }
	public static int singleNumberByHashMap(int[] A) {
	       HashMap<Integer,Integer> hMap=new HashMap<>();
	       for(int i=0;i<A.length;i++)
	       {
	    	   if(hMap.containsKey(A[i])){
	    		   hMap.put(A[i], hMap.get(A[i])+1);
	    		   if(hMap.get(A[i]) == 3)
	    			   hMap.remove(A[i]);
	    	   }   
	    	   else
	    		   hMap.put(A[i],1);
	       }
	       Iterator iter = hMap.entrySet().iterator();
	       Map.Entry entry = (Map.Entry) iter.next();
	       return (int) entry.getKey();
	    }
}
