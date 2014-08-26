package LeetCode;

public class Rotated_Sorted_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static  int search(int[] A, int target) {
        for(int i=0;i<A.length;i++){
        	if(target == A[i])
        		return i;
        }
		return -1;
    }
}
