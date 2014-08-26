package HuaWei;

import java.util.Scanner;

public class OlympicGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String[] country = new String[num];
		int[][] medal = new int[num][3];
		for(int i=0;i<num;i++){
			country[i] = sc.next();
			medal[i][0]=sc.nextInt();
			medal[i][1]=sc.nextInt();
			medal[i][2]=sc.nextInt();
		}
		//调整数据
		for(int i=0;i<num-1;i++){
			for(int j=i+1;j<num;j++){
				if(medal[i][0] < medal[j][0])
				{
					int temp1=medal[j][0];
					int temp2=medal[j][1];
					int temp3=medal[j][2];
					String ct=country[j];
					country[j]=country[i];
					country[i]=ct;
					medal[j][0]=medal[i][0];
					medal[j][1]=medal[i][1];
					medal[j][2]=medal[i][2];
					medal[i][0]=temp1;
					medal[i][1]=temp2;
					medal[i][2]=temp3;
				}
				if(medal[i][0] == medal[j][0]){
					if(medal[i][1] < medal[j][1]){
						int temp1=medal[j][0];
						int temp2=medal[j][1];
						int temp3=medal[j][2];
						String ct=country[j];
						country[j]=country[i];
						country[i]=ct;
						medal[j][0]=medal[i][0];
						medal[j][1]=medal[i][1];
						medal[j][2]=medal[i][2];
						medal[i][0]=temp1;
						medal[i][1]=temp2;
						medal[i][2]=temp3;
				}
					if(medal[i][1] == medal[j][1]){
						if(medal[i][2] < medal[j][2]){
							int temp1=medal[j][0];
							int temp2=medal[j][1];
							int temp3=medal[j][2];
							String ct=country[j];
							country[j]=country[i];
							country[i]=ct;
							medal[j][0]=medal[i][0];
							medal[j][1]=medal[i][1];
							medal[j][2]=medal[i][2];
							medal[i][0]=temp1;
							medal[i][1]=temp2;
							medal[i][2]=temp3;
						}
						if(medal[i][2] == medal[j][2]){
							if(country[i].compareTo(country[j]) == 1){
								String ct=country[j];
								country[j]=country[i];
								country[i]=ct;
							}
						}
				}
		}}}
		for(int i=0;i<num;i++){
			System.out.println(country[i]);
		}
	}

}
