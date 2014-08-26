package HuaWei;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.zip.ZipEntry;

public class FamilyTree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//存储父子关系
		Map<String, String> tmap=new HashMap<String ,String>();
		//存储树高
		Map<String, Integer> hmap= new HashMap<String, Integer>();
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();
		int flag=0;
		while(flag < num){
			//添加关系
			String command = scanner.next();
			if(command.equals("AddRelationShip")){
				String parent=scanner.next();
				String son=scanner.next();
				tmap.put(son,parent);
				if(hmap.containsKey(parent)){
					hmap.put(son, hmap.get(parent).intValue()+1);
				}
				else{
					hmap.put(son, 1);
					hmap.put(parent, 0);
				}
				flag++;
			}
			//直系血亲判断
			if(command.equals("GetGeneration")){
				String son1=scanner.next();
				String son2=scanner.next();
				if(hmap.containsKey(son1) && hmap.containsKey(son2)){
					if(hmap.get(son1) == hmap.get(son2))
						System.out.println("-1");
					if(hmap.get(son1) < hmap.get(son2))//后一个在森林某棵树的下层
					{
						int finalint = Z(son1,son2,tmap,hmap);
						System.out.println(finalint);
					}
					if(hmap.get(son1) > hmap.get(son2))//前一个在森林某棵树的下层
					{
						int finalint = Z(son2,son1,tmap,hmap);
						System.out.println(finalint);
					}
				}
				else {
					System.out.println("-1");
				}
				flag++;
			}
			//堂亲的判断
			if(command.equals("GetCousin")){
				String son1=scanner.next();
				String son2=scanner.next();
				if(hmap.containsKey(son1) && hmap.containsKey(son2)){
					if(son1.equals(son2))
						System.out.println("-1");
					else if(hmap.get(son1) <= hmap.get(son2))//如果后一个在下层
					{
						if(Z(son1, son2, tmap, hmap) != -1)//是直系血亲
							System.out.println("-1");
						else{
							P(son1,son2,tmap,hmap);
						}
					}
					else if(hmap.get(son1) > hmap.get(son2))//如果后一个在下层
					{
						if(Z(son2, son1, tmap, hmap) != -1)//是直系血亲
							System.out.println("-1");
						else{
							P(son2,son1,tmap,hmap);
						}
					}
				}
				else{
					System.out.println("-1");
				}
				flag++;
			}
			
		}		
	}
	public static int Z(String str1,String str2,Map<String, String> tmap,Map<String, Integer> hmap)
	{
		int zheight=0;
		while(tmap.containsKey(str2)){
			str2=tmap.get(str2);
			zheight++;
			if(str1.equals(str2)){
				return zheight;
			}
		}
		if(str1.equals(str2)){
			return zheight;
		}
		return -1;
	}
	public static int P(String str1,String str2,Map<String, String> tmap,Map<String, Integer> hmap)
	{
		int M=0;int N=0;
		int pheight=0;
		while(hmap.get(str1) < hmap.get(str2)){
			str2=tmap.get(str2);
			hmap.get(str2);
			pheight++;
		}//确保两人在同一层
		N=pheight;//两个人的高度差
		pheight=0;
		if(hmap.get(str1) == 0 || hmap.get(str2) == 0)
		{
			if(!str1.equals(str2)){
				System.out.println("-1");
			}
		}
		else{
			while(tmap.containsKey(str1) && tmap.containsKey(str2) &&(
					!(tmap.get(str1).equals(tmap.get(str2))) || hmap.get(str1) == 0 || hmap.get(str2) == 0)){
				str1=tmap.get(str1);
				str2=tmap.get(str2);
				pheight++;
			}
			M=pheight;
			if(tmap.get(str1).equals(tmap.get(str2)))
				System.out.println(M+" "+N);
			else
				System.out.println("-1");
		}
		return 0;
	}
}
