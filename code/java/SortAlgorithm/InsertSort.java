/*插入排序
 * 没有有序的操作
 * */
package SortAlgorithm;

import java.util.Comparator;


public class InsertSort {

	/**
	 * @param args
	 */
	public static void insertionSort(Comparable []data){  
        for(int index=1;index<data.length;index++){  
            Comparable key = data[index];  
            int position = 0;  
            //升序排列
//            while( position>0 && data[position-1].compareTo(key)>0){  
//                data[position] = data[position-1];  
//                position--;  
//            }  
//            data[position]=key;
            while(position < index && data[position].compareTo(key) <= 0)
            {
            	position++;
            }
            
            if(position < index){
            	Comparable temp=data[position];
	            for(int i=position;i<=index;i++)
	            {
	            	data[position]=key;
	            	Comparable tem=data[position+1];
	            	data[position+1]=temp;
	            	temp=tem;
	            }
            }
        }     
    }  
    public static void main(String []args){  
        Comparable []c={4,9,23,1,45,27,5,2};  
        System.out.println("待排序数组");
        for(int i=0;i<c.length;i++)  
            System.out.print(c[i]+" ");
        insertionSort(c);  
        System.out.println("\n排序结果");
        for(int i=0;i<c.length;i++)  
            System.out.print(c[i]+" ");  
    }  
}
