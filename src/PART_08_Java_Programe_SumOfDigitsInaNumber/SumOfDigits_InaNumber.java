package PART_08_Java_Programe_SumOfDigitsInaNumber;

public class SumOfDigits_InaNumber {

	public static void main(String[] args) {
		
		
		int num=12345;
		int sum=0;
		
		while(num>0) {
			
			
			sum=sum+num%10;
			num=num/10;
		}
          System.out.println(sum);
	}

}
