#include <stdio.h>

int fact(n){
 
  if(n==1)
    return 1;
  else
    return n*fact(n-1);
}

int main() {
	
  	int n,x;
  	scanf("%d",&n);
  	x=fact(n);
  	printf("%d",x);
	return 0;
}