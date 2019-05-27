#include<stdio.h>

int sum_natural(int n){
  
  	int sum=0;
 	for(int i=1;i<=n;i++){
     
      sum=sum+i;
    }
  	return sum;
}

int main() {
	
  	int n,x;
  	scanf("%d",&n);
  printf("%d",x=sum_natural(n));  
  	return 0;
}