package com.vamshi.arrayprogramms;

public class Largestandsmallestinarray {
	static Largestandsmallestinarray next;
	
	public Largestandsmallestinarray(Largestandsmallestinarray next) {
		super();
		this.next = next;
	}
	
	public Largestandsmallestinarray() {
		super();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] nums= {10,20,30,40,90,110};
largestsmallest(nums);

	}
	public static int largestsmallest(int[] nums) {
		Largestandsmallestinarray lgst=new Largestandsmallestinarray();
		int head = 0;
		int tail=0;
		for(int i=0;i<nums.length;i++) {
			
			
			if(nums[i]>head) {
				head=nums[i];
				
			}
			if(tail==0||nums[i]<tail) {
				tail=nums[i];
			}
			
		}
		System.out.println("highestnumer="+head);
		System.out.println("tailnumber="+tail);

		return head&tail;
	}

}
