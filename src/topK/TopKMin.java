package topK;
//使用java提供的优先队列
import java.util.Comparator;
import java.util.PriorityQueue;

public class TopKMin {
	public static int[] topKMin(int[] nums,int k){
		int[] res=new int[k];
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		for(int num:nums){
			pq.add(num);
			if(pq.size()>k)
				pq.poll();
		}
		int i=0;
        while(i<k)
        	res[i++]=pq.poll();
		return res;		
	}
	
	public static int kthMin(int[] nums,int k){
		PriorityQueue<Integer> pq=new PriorityQueue<Integer>(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		for(int num:nums){
			pq.add(num);
			if(pq.size()>k)
				pq.poll();
		}
		return (int)(pq.toArray()[0]);
	}
	
	public static void main(String[] args){
		int[] test=new int[]{1,3,5,7,9,2,4,6,8,0};
		int[] res=topKMin(test, 3);
		for(int i:res)
			System.out.println(i);
		System.out.println(kthMin(test, 3));
	}
}
