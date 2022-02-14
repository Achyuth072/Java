package main;

public class Largeorsmall {

	public static void main(String[] args) {
		int l,s,i;
		int a[] = new int[]{3, 5, 8, 1, 6};
		int n = a.length;
		l=s=a[0];
		for(i=1;i<n;++i)
		{
			if(a[i]>l)
				l=a[i];

			if(a[i]<s)
				s=a[i];
		}
		System.out.println(" Smallest number = " +s+" and Largest number = "+l);	
		// TODO Auto-generated method stub

	}

}
