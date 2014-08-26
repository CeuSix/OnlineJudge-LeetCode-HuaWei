package HuaWei;
import java.util.*;
public class Main1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int iInputNum=0;
		int iMapFlag=0;
		String sInputStr;
		String sOutputStr="";
		while((iInputNum=sc.nextInt())!=0){
			TreeMap<String,Integer> map=new  TreeMap<String,Integer>();
			int iMax=1;
			for(int i=0;i<iInputNum;i++){
				sInputStr=sc.next();
				if(map.get(sInputStr) == null){
					map.put(sInputStr, 1);
				}
				else{
					iMapFlag=map.get(sInputStr).intValue()+1;
					map.put(sInputStr, iMapFlag);
					if(iMapFlag > iMax){           
						sOutputStr = sInputStr;                      
						iMax=iMapFlag;
					}
				}
			}
			System.out.println(sOutputStr);
		}
		sc.close();
	}

}
