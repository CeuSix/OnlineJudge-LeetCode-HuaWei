/*
 * 冒泡排序的算法
 * 算法思路是每次通过相邻位置两两比较，将最值浮动到最后的位置
 */
package SortAlgorithm;

public class BubbleSort {

	/**
	 * @param args
	 */
	public void sort(int [] intArray,int flag){
		System.out.println("您调用的是冒泡排序算法");
		switch(flag){
			case 0:
				System.out.println("降序排列");
				break;
			default:
				System.out.println("升序排列");
				break;
		}
		long startTime=System.nanoTime();
		for (int i = intArray.length-1; i >0; i--) {
			for (int j = 0; j < i; j++) {
				//降序的处理部分
				if(flag == 0){
					if(intArray[j] < intArray[j+1]){
						int temp = intArray[j];
						intArray[j]=intArray[j+1];
						intArray[j+1]=temp;
					}
				}
				//升序的处理部分
				else{
					if(intArray[j] > intArray[j+1]){
						int temp = intArray[j];
						intArray[j]=intArray[j+1];
						intArray[j+1]=temp;
					}
				}
			}
			System.out.print("选出了数字"+intArray[i]+", ");
		}
		System.out.println("选出了数字"+intArray[0]);
		long endTime = System.nanoTime();
		System.out.print("排序完成的数组是： {");
		for(int i=0;i<intArray.length;i++)
		{
			if(i == intArray.length-1)
				System.out.print(intArray[i]);
			else
				System.out.print(intArray[i]+", ");
		}
		//此处(endTime-startTime)必须有括号，要不然会报错
		System.out.println("}\n排序的时间是"+(endTime-startTime)+"ns");
	}
}
