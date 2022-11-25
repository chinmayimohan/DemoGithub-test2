

public class Factors_of_Odd_num {
	public static void main(String[] args) {
		int num=12345,rem=0,sum=0;
		while(num>0){
		rem=num%10;
		int fact=1;
		if(rem%2!=0) {
			int i=1;
			while(i<=rem) {
			//for(int i=1;i<=rem;i++) {
			fact=fact*i;
			i++;
		}
			sum=sum+fact;
			}
		num/=10;
		}
System.out.println(sum);
}}
