package LeetCode;

import java.awt.List;
import java.util.ArrayList;

public class N_Queen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String[]> str1= new ArrayList<>();
		ArrayList<String[]> str= new ArrayList<>();
		str=solveNQueens(4);
		for(int i=0;i<str.size();i++)
		{
			for(int j=0;j<str.get(i).length;j++)
				System.out.println("Row " + j + ":"+ str.get(i)[j]);
		}
			
		//System.out.println();
	}
	public static ArrayList<String[]> solveNQueens(int n) {
          int[] result = new int[n];
          ArrayList<String[]> a = new ArrayList<String[]>();
          generate(result, 0, a);
          return a;
    }
	public static void generate(int[] result, int N, ArrayList<String[]> a) {
	      if (result.length == N) {
	         a.add(print(result));
	     }
	     else {
	         for (int i=0; i<result.length; i++) {
	             result[N] = i;
	             if (isConsistent(result, N)) 
	                 generate(result, N+1, a);
	         }
	     }
	 }
     
     public static String[] print(int[] result) {
         String[] w = new String[result.length];
         for (int i=0; i<w.length; i++) w[i] = "";
         for (int i=0; i<result.length; i++) {
             for (int j=0; j<result.length; j++) {
                 if(j == result[i]) {
                     w[i] = w[i] + "Q";
                 }
                 else {
                     w[i] = w[i] + ".";
                 }
             }
         }
         return w;
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
