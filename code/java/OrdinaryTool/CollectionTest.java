package OrdinaryTool;

import java.awt.List;
import java.util.*;

public class CollectionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Hashtable<Integer, Integer> ht;
		HashMap<Integer, Integer> hmHashMap;
		// TODO Auto-generated method stub
		//Collection<Integer> collection = new List<Integer>();
		//Collection<Integer> collection = new Collection<Integer>();
		//java.util.List<Integer> alist =new List<Integer>();
		double darray[] = {2.2,5.5,3.8,3.4,1.1};
		Arrays.sort(darray);
		ArrayList<Integer> arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.size();
		java.util.List<Integer> l1=new Vector<Integer>();
		arrayList.ensureCapacity(2);
		java.util.List<Integer> list =new ArrayList<>();
		list.size();
		list.add(0);list.add(1);list.add(2);
		//System.out.println(list.indexOf(0)+ " and " + list.indexOf(-1));
		LinkedList<Integer> linkedList=new LinkedList<Integer>();
		linkedList.add(3);
		linkedList.add(2);
		
		linkedList.add(1);
		Iterator< Integer> iterator;
		iterator = linkedList.iterator();
		int i = iterator.next().intValue();
		//System.out.println("ArrayList ");
		//System.out.println("LinkedList "+i);
		//System.out.println(linkedList.peekFirst() + " and " + linkedList.peekLast());
		Collections.sort(linkedList);
		//System.out.println(linkedList.peekFirst() + " and " + linkedList.peekLast());
		Set<Integer> iseSet=new TreeSet<>();
		iseSet.add(3);
		iseSet.add(4);
		iseSet.add(5);
		iseSet.add(2);
		for (Integer integer : iseSet) {
			System.out.println(integer);
		}
		System.out.println("treeSet="+iseSet.size());
		Set<Integer> hseSet=new HashSet<>();
		hseSet.add(15);
		hseSet.add(400);
		hseSet.add(250);
		hseSet.add(102);
		for (Integer integer : hseSet) {
			System.out.println(integer);
		}
		System.out.println("HashSet="+hseSet.size());
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		Map<Integer, Integer> map1=new Hashtable<Integer, Integer>();
	}

}
