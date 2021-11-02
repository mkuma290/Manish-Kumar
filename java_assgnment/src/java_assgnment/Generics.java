package java_assgnment;
import java.util.Comparator;
import java.util.*;
//import static java_assgnment.Generics.*;

 class Generics
{
	public static <G> void swap(G[] a,int i,int j)
	{
		G temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		for(Integer k=0;k<a.length;k++)
		System.out.print(a[k]+" ");
	
	}

		public static void main(String[] args) {
			
	      Integer arr[]= {1,2,3,4,5};
	      swap(arr,1,2);
		}
	  
	}
