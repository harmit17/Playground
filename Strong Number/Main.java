#include <stdio.h>

int fact(n){
 
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}


int main() {
	
  	int n,rem,x,sum=0,temp;
  	scanf("%d",&n);
  	temp=n;
  	while(n!=0){
      
     rem=n%10;
     x=fact(rem);
     sum =sum+x;
     n=n/10;
    }
  
  	if(sum==temp)
      printf("Yes");
  	else
      printf("No");
	
  return 0;
}