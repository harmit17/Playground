#include<stdio.h>

int main()
{
	int i,j,k,l=1,n;
  	scanf("%d",&n);
	for(i=1; i<=n; i++)
	{
		for(j=n-1; j>=i; j--)
		{
			printf(" ");
		}
		
		for(k=1; k<=l; k++)
		{ 
			printf("*");
		}            
			l = l+2;    
	    printf("\n");
	}
    return 0;
}