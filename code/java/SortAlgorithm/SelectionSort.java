/*选择排序
 * 每次循环挑选最小的放在最前面
 * 然后依次循环就可以完成排序
 * */
package SortAlgorithm;


public class SelectionSort {

	public void sort(int [] intArray,int sequenceflag){
		System.out.println("您调用的是选择排序算法");
		int flag=0;
		int max=intArray[0];
		long startTime=System.nanoTime();
		for(int i=intArray.length-1;i>0;i--)
		{
			//寻找最值放在最后
			for(int j=0;j<i;j++){
				if(intArray[j] > max)
				{
					max=intArray[j];
					flag=j;
				}
			}
			intArray[flag]=intArray[i];
			intArray[i]=max;
			max=intArray[0];
			flag=0;
		}
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
