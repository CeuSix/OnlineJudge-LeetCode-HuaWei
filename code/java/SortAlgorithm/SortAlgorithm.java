/*排序算法集锦
 * 提供随机数组、用户输入数组
 * 提供参数模板
 * */
package SortAlgorithm;

import java.util.Scanner;

public class SortAlgorithm {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//程序自带数组
		int[] systemArray = {23,12,14,2,5,7,46,130,25,3};
		int sy[] = new int[10];
		//System.out.println(sy.length +" " +systemArray.length);
		System.out.println("请选择待排序数组的产生类型");
		System.out.println("1.程序自定义数据2.随机产生3.用户输入4.退出");
		Scanner scanner=new Scanner(System.in);
		int inputFlag=scanner.nextInt();
		System.out.println("选择升序还是降序，降序为0，升序是1");
		int sortKind=scanner.nextInt();
		System.out.println("选择排序算法1.冒泡排序2.选择排序3.插入排序4.希尔排序\n5.快速排序6.归并排序7.堆排序");
		int chooseflag=scanner.nextInt();
		
		while(inputFlag!=3){
			switch (inputFlag) {
			case 1:
				System.out.println("自定义数组长度为10\n数组内容为{23,12,14,2,5,7,46,130,25,3}");
				chooseSort(chooseflag, systemArray, sortKind);
				break;
			case 2:
				System.out.println("请输入您希望排序的数组，空格隔开，回车是确定");
				break;
			case 3:
				System.out.println("请输入您希望排序的数组，空格隔开，回车是确定");
				break;
			default:
				System.out.println("您选择了退出");
				break;
			}
			inputFlag=scanner.nextInt();
		}
		System.out.println("程序退出");
		scanner.close();
	}
	public static void chooseSort(int flag,int intArray[],int sortKind)
	{
		switch(flag){
			case 1:
				BubbleSort bubbleSort=new BubbleSort();
				bubbleSort.sort(intArray, sortKind);
				break;
			case 2:
				SelectionSort selectionSort = new SelectionSort();
				selectionSort.sort(intArray, sortKind);
				//selectionSort的作用域就在case这个里面
				break;
			case 3:
				//InsertSort insertSort = new InsertSort();
				//selectionSort.sort(intArray, sortKind);
				break;
			case 5:
				QuickSort quickSort = new QuickSort();
				quickSort.sort(intArray, 0, intArray.length-1);
				break;
		}
	}
}
