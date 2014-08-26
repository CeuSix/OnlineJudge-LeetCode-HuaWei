/*
 *数组的声明，初始化 */
package OrdinaryTool;

public class ArrayBasic {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		System.out.println("数组声明的演示");
		System.out.println("采用Int[] s");
		int array[] = {25,3,4};
		long endTime = System.nanoTime();
		System.out.println(endTime-startTime + "ns");
	}

}
