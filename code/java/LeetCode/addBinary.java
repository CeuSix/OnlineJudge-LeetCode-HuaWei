package LeetCode;

import HuaWei.stringFliter;

public class addBinary {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(addBinary("1111", "1111"));
	}
	public static String addBinary(String a, String b) {
        String result="";
        int newBit=0;
        int addBit=0;
        if(a.length() < b.length()){
        	result=b;
	        b=a;
	        a=result;
        }
        result="";
        for(int i=0;i<a.length();i++){
        	if(i<b.length()){
        		newBit=Integer.parseInt(String.valueOf(a.charAt(a.length()-i-1)))+
        				Integer.parseInt(String.valueOf(b.charAt(b.length()-i-1)))+addBit;
        		if(newBit == 2){
        			addBit=1;
        			result=String.valueOf(0)+result;
        		}
        		else if(newBit == 3){
        			addBit=1;
        			result=String.valueOf(1)+result;
        		}
        		else {
					addBit=0;
					result=String.valueOf(newBit)+result;
				}
        	}
        	else {
    			newBit=Integer.parseInt(String.valueOf(a.charAt(a.length()-i-1)))+addBit;
        		if(newBit == 2){
        			addBit=1;
        			result=String.valueOf(0)+result;
        		}
        		else {
					addBit=0;
					result=String.valueOf(newBit)+result;
				}
			}
        }
        if(addBit == 1)
        	result=1+result;
        return result;
    }
}
