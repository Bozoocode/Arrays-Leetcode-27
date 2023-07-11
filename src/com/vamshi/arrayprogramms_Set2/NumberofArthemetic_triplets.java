package com.vamshi.arrayprogramms_Set2;


public class NumberofArthemetic_triplets {
public static int arthematictriplets(int[] myarray,int diff) {
	int count = 0;

    for (int i = 0; i < myarray.length; i++) {
     for(int j=i+1;j<myarray.length;j++) {
for(int k=j+1;k<myarray.length;k++) {
if(myarray[j]-myarray[i]==diff&&myarray[k]-myarray[j]==diff) {
	count++;
}
}
     }
    }

    return count;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] muarray= {0,1,4,6,7,10};
int ans=arthematictriplets(muarray, 3);
System.out.println(ans);
	}

}
