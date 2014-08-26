package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int [][] matrix={{1, 2, 3},{4,5,6},{7,8,9}};
		int [][] matrix={{2,3}};
		List<Integer> resultList=spiralOrder(matrix);
		for(int i=0;i<resultList.size();i++){
        	System.out.print(resultList.get(i)+" ");
        }
	}
	public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> resultList= new ArrayList();
        //异常处理
        if(matrix == null || matrix.length == 0) {
        	resultList.clear();
        	return resultList;
        }
       boolean[][] temp = new boolean[matrix.length][matrix[0].length];
       for(int i=0;i<matrix.length;i++){
    	   for(int j=0;j<matrix[0].length;j++)
    		   temp[i][j] = false;
       }
        int left=0,right=matrix[0].length-1,top=0,bottom=matrix.length-1;
        int crow=0,ccolum=0;
        int num=matrix[0].length*matrix.length;
        for(int i=0;i<num;i++){
        	//向右
        	for(int j=left;j<=right;j++){
        		if(!temp[crow][j]){
	        		resultList.add(matrix[crow][j]);
	        		ccolum=j;
	        		i++;
	        		temp[crow][j]=true;
        		}
        		else {
					return resultList;
				}
        	}
        	top++;
        	//向下
        	for(int j=top;j<=bottom;j++){
        		if(!temp[j][ccolum]){
        			resultList.add(matrix[j][ccolum]);
            		crow=j;
            		i++;
            		temp[j][ccolum]=true;
        		}
        		else {
					return resultList;
				}
        	}
        	right--;
        	//向左
        	for(int j=right;j>=left;j--){
        		if(!temp[crow][j]){
        			resultList.add(matrix[crow][j]);
            		ccolum=j;
            		i++;
            		temp[crow][j]=true;
        		}
        		else {
					return resultList;
				}
        	}
        	bottom--;
        	//向上
        	for(int j=bottom;j>=top;j--){
        		if(!temp[j][ccolum]){
        			resultList.add(matrix[j][ccolum]);
            		crow=j;
            		i++;
            		temp[j][ccolum]=true;
        		}
        		else {
					return resultList;
				}       	
        	}
        	left++;
        	i--;
        }
        
        return resultList;
    }
}
