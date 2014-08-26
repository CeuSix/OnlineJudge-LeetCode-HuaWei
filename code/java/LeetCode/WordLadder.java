package LeetCode;

import java.awt.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class WordLadder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
	}
//	public static  int ladderLength(String start, String end, HashSet<String> dict) {
//		int arrayLength=dict.size()+2;
//		String[] dicArrayStrings=new String[arrayLength];
//		for(int i=0;i<dicArrayStrings.length;i++){
//			if(i == 0) dicArrayStrings[0] = start;
//			else if(i == dicArrayStrings.length-1) dicArrayStrings[i]=end;
//			else {
//				dicArrayStrings[i]=dict.iterator().next();
//			}
//		}
//		int Strarray[][] = new int[arrayLength][arrayLength];
//		for(int i=0;i<arrayLength;i++){
//			for(int j=0;j<arrayLength;j++){
//				if(testWord(dicArrayStrings[i], dicArrayStrings[j]))
//						Strarray[i][j] = 1;
//				else 	Strarray[i][j] = 0;
//			}
//		}
//		ArrayList<Integer> resultList=new ArrayList<>();
//		//循环体
//		return 0;
//    }
	public static int ladderLength(String start, String end, Set<String> dict) {
	    if (start == null || end == null || start.length() != end.length() || start.length() == 0)
	            return 0;
	 
	        // A queue used for breadth-first search
	        Deque<String> queue = new ArrayDeque<String>();
	        queue.offer(start);
	 
	        Set<String> visited = new HashSet<String>();    // Record the strings that have been visited
	 
	        int depth = 1;
	        int nodesInCurrentLevel = 1, nodesInNextLevel = 0;
	 
	        // A breadth-first search starting from "start"
	        while (queue.peek() != null) {
	            String current = queue.poll();
	            nodesInCurrentLevel--;
	 
	            // Try each string that is one character away from the current one
	            for (int i = 0; i < current.length(); i++) {
	                char[] charCurrent = current.toCharArray();
	                for (char c = 'a'; c <= 'z'; c++) {
	                    charCurrent[i] = c;
	                    String temp = new String(charCurrent);
	                    if (temp.equals(end))   // Reach target string with one more transformation
	                        return depth+1;
	                    if (!visited.contains(temp) && dict.contains(temp)) {
	                        queue.offer(temp);
	                        nodesInNextLevel++;
	                        visited.add(temp);
	                    }
	                }
	            }
	 
	            // All nodes at the current level are done; prepare to go to the next level
	            if (nodesInCurrentLevel == 0) {
	                nodesInCurrentLevel = nodesInNextLevel;
	                nodesInNextLevel = 0;
	                depth++;
	            }
	        }
	 
	        return 0;
	    }
	public static boolean testWord(String str1,String str2){
		int length=0;
		if(str1.length() != str2.length()) return false;
		for(int i=0;i<str1.length();i++){
			if(str2.charAt(i) != str1.charAt(i))
				length++;
		}
		if(length == 1)
			return true;
		return false;
	}
}
