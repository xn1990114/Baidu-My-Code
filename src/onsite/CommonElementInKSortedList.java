package onsite;
import java.util.*;

public class CommonElementInKSortedList {
	public List<Integer> findCommonElement(int[][] nums){
		List<Integer> result=new ArrayList<Integer>();
		PriorityQueue<int[]> pq=new PriorityQueue<int[]>(new Comparator<int[]>(){
			public int compare(int[] i1,int[] i2){
				if(i1[0]==i2[0]){
					return i1[1]=i2[1];
				}
				return i1[0]=i2[0];
			}
		});
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++){
			if(nums[i].length==0){
				return result;
			}
			// 0-val,1-row,2-col
			int[] toadd={nums[i][0],i,0};
			pq.offer(toadd);
			max=Math.max(max, nums[i][0]);
		}
		while(pq.size()==nums.length){
			if(pq.peek()[0]==max){
				result.add(max);
			}
			int[] curr=pq.poll();
			curr[2]++;
			if(curr[2]<nums[curr[1]].length){
				curr[0]=nums[curr[1]][curr[2]];
				max=Math.max(max, curr[0]);
				pq.offer(curr);
			}
		}
		return result;
	}
}
