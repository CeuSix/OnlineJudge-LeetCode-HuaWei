package SortAlgorithm;

public class ShellSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparable []c={4,9,23,1,45,27,5,2};  
       shellSort(c, 2);  
        for(int i=0;i<c.length;i++)  
            System.out.println("插入排序："+c[i]);  
	}
	public static void shellSort(Comparable [] array,int increment){
		int index=0;
		int bounder=index+increment;
		int innerIndex=0;
		while(index < array.length && index < bounder)
		{
			//单次的插入排序程序
			 for(innerIndex = index+increment;innerIndex<array.length-increment;innerIndex=innerIndex+increment){  
		            Comparable key = array[innerIndex];  
		            int position =index;  
		            //升序排列
		            while( position < array.length-increment 
		            		&& array[position].compareTo(key) < 0)
		                	position+=increment;  
		            Comparable temp=array[position];
		            array[position]=key;  
		            for(int i=position;i<array.length;i=i+increment)
		            {
		            	Comparable tem=array[position];
		            	array[position]=temp;
		            	temp=tem;
		            }
		            
		        } 
			index++;
		}
	}

}
