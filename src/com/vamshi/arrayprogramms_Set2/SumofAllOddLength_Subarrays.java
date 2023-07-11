package com.vamshi.arrayprogramms_Set2;

public class SumofAllOddLength_Subarrays {
public static int sumofoddlength(int[] arr) {
	int	sum=0;
int start;
int end;
int length=arr.length;
	for(int i=0;i<length;i++) {
end=i+1;
start=length-i;

int total=start*end;
int odd=total/2;
if(total%2==1) {
	odd++;
}
sum+=odd*arr[i];
		}
	
	return sum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] myarray= {1,4,2,5,3};
int ans=sumofoddlength(myarray);
System.out.println(ans);
	}

}
