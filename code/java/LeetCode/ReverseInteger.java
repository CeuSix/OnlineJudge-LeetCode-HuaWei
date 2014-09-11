package LeetCode;

public class ReverseInteger {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(-123));
	}
	public static int reverse(int x) {
        int result=0;
        StringBuffer sBuffer=new StringBuffer(String.valueOf(x));
        StringBuffer sBuffer2;
        if(x < 0)
        {
        	sBuffer2=new StringBuffer(sBuffer.substring(1, sBuffer.length()));
        	result=Integer.parseInt("-"+sBuffer2.reverse().toString());
        }
        else {
			result=Integer.parseInt(sBuffer.reverse().toString());
		}
		return result;
    }
}
