package onsiteTester;

import static org.junit.Assert.*;
import java.util.*;

import org.junit.Test;

import onsite.CommonElementInKSortedList;

public class CommonElementInKSortedListTester {

	@Test
	public void test() {
		CommonElementInKSortedList tester=new CommonElementInKSortedList();
		int[][] nums1={{1,4,5,7,8,15,56,254},
					   {2,5,6,8,9,10},
					   {5,8},
					   {5,6,7,8,9,10},
					   {2,5,6,8,9,10},
					   {-10,1,2,3,4,5,8}};
		List<Integer> res1=tester.findCommonElement(nums1);
		assert(res1.size()==2&&res1.get(0)==5&&res1.get(1)==8);
		int[][] nums2={{1,4,5,7,8,15,56,254},
				   {2,5,6,8,9,10},
				   {},
				   {5,6,7,8,9,10},
				   {2,5,6,8,9,10},
				   {-10,1,2,3,4,5,8}};
		List<Integer> res2=tester.findCommonElement(nums2);
		assert(res2.size()==0);
	}
}
