class ArmstrongPrac1 
{public static void main(String[] args) 
	{	int n=153,temp1=n,temp2=n,sum=0;
		int count=0;
		while(temp1>0)
		{temp1=temp1/10;
			count++;}
		while(temp2>0)
		{int digit=temp2%10;
			sum=sum+(int)Math.pow(digit,count);
			temp2=temp2/10;
		}
		if(sum==n)
		{
			System.out.println("Armstrong number");
		}
		else
		{
			System.out.println("not Armstrong number");
		}
	}
}
