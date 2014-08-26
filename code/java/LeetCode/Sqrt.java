package LeetCode;

public class Sqrt {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sqrt(4));
	}
	public static int sqrt(int x) {
		long start=0;
		long end=x;
		long middle=0;
		long temp=0;
        while(start < end){
        	middle = (start+end)/2;
        	temp=middle*middle;
        	if(temp < x)
        		start=middle+1;
        	else if(temp == x)
        		return (int)middle;
        	else {
				end=middle-1;
			}
        }
        if(end*end >x)
        	end-=1;
		return (int)end;
    }
}
