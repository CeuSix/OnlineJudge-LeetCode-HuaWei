/*快速排序算法
 * */
package SortAlgorithm;

public class QuickSort {
	
	public void sort(int[] intArray,int left,int right){
		System.out.println("您调用的算法：快速排序");
		//设置关键字
		int key=intArray[left];
		int leftFlag=left;
		int rightFlag=right;
		int swapTemp;
		while(leftFlag != rightFlag){
			//左移操作
			while(intArray[rightFlag] >= key && rightFlag > 0)
				rightFlag--;
			swapTemp=intArray[rightFlag];
			intArray[rightFlag]=key;
			intArray[leftFlag]=intArray[rightFlag];
			//右移操作
			while(intArray[leftFlag] <= key && leftFlag <intArray.length-1)
				leftFlag++;
			swapTemp=intArray[leftFlag];
			intArray[leftFlag]=key;
			intArray[rightFlag]=intArray[leftFlag];
		}
		if(left < rightFlag)
			sort(intArray,left,rightFlag);
		if(right > leftFlag)
			sort(intArray, leftFlag, right);
	}
}
