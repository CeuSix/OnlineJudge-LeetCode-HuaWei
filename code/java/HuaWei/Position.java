package HuaWei;

import java.util.Scanner;

public class Position {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		//当前位置CLICK
		if(x1 == x2 && y1==y2)
		{
			System.out.println("CLICK");
			return;
		}
		//左右方向
		else if(Math.abs(x2-x1) == Math.abs(y2-y1))
		{
			if(x2 > x1)
			{
				System.out.println("RIGHT");
				return;
			}
			else
			{
				System.out.println("LEFT");
				return;
			}
		}
		//上下方向
		else{
			if(y2>y1)
			{
				System.out.println("Down");
				return;
			}
			else{
				System.out.println("UP");
				return;
			}
		}
	}

}
