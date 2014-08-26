package LeetCode;

public class N_Queen_II {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalNQueens(5));
	}
	public static int totalNQueens(int n) {
	       int[] result = new int[n];
	         int a = 0;
	         a = generate(result, 0);
	         return a;
	         
	 }
     public static int generate(int[] result, int N) {
         int res = 0;
         if (result.length == N) {
             return 1;
         }
         else {
             for (int i=0; i<result.length; i++) {
                 result[N] = i;
                 if (isConsistent(result, N)) 
                     res += generate(result, N+1);
             }
         }
         return res;
     }
     
     public static boolean isConsistent(int[] result, int N) {
         for (int i=0; i<N; i++) {
             if(result[N] == result[i]) return false;
             if(result[N] - result[i] == N - i) return false;
             if(result[N] - result[i] == i - N) return false;
         }
         return true;
     }
}
