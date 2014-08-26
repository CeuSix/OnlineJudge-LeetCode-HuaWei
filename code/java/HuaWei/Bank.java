package HuaWei;

import java.util.Scanner;

public class Bank {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int inpay=sc.nextInt();
		int iapay=sc.nextInt();
		if(iapay < inpay){
			System.out.println("null");
			return;
		}
		if((iapay-inpay)>100){
			System.out.println("null");
			return;
		}
		if(iapay == inpay){
			System.out.println("00000");
			return;
		}
		else{
			int ilpay=iapay-inpay;
			int i50=ilpay/50;
			int i20=(ilpay-50*i50)/20;
			int i10=(ilpay-50*i50-20*i20)/10;
			int i5=(ilpay-50*i50-20*i20-10*i10)/5;
			int i1=ilpay-50*i50-20*i20-10*i10-5*i5;
			System.out.println(i50+""+i20+""+i10+""+i5+""+i1);
		}
	}

}
