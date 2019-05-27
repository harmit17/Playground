#include<stdio.h>

int power(int b,int e){
  
  	int pow=1;
 	for(int i=1;i<=e;i++)
      pow=pow*b;
  
  	return pow;
}


int main(){
  	
  	int base,expo;
  	scanf("%d %d",&base,&expo);
  
  	int x=power(base,expo);
  	printf("%d",x);
  
  	return 0;
}