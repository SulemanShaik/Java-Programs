package PART_15_Java_Programe_EvenAndOddNummberinArray;

public class EvenAndOddNummberinArray {

	public static void main(String[] args) {
              
		int a[]= {1,2,3,4,5,6};
		//Extracting Even
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==0)
			{
				System.out.println(a[i]);
			}
		}
		
		//Extracting Odd
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=0) {
				System.out.println(a[i]);
			}
		}
		
	}

}
