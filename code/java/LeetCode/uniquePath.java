package LeetCode;

public class uniquePath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(uniquePaths(6, 9));
	}
	public static int uniquePaths(int m, int n) {
        // Note: The Solution object is instantiated only once and is reused by each test case.
        if(m == 0 || n == 0)
            return 0;
        int[][] dp = new int[m][n];
        dp[0][0] = 1;
        for(int i = 1; i < m; i++)
            dp[i][0] = 1;
        for(int j = 1; j < n; j++)
            dp[0][j] = 1;
        for(int i = 1; i < m; i++)
        {
            for(int j = 1; j < n; j++)
            {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }
        }
        int res = dp[m-1][n-1];
        for(int i = 0; i < m; i++)
        {
             dp[i] = null;
        }
        dp = null;
        return res;
    }
}
