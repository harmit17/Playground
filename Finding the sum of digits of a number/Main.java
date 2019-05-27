#include <stdio.h>
int main() {
	
  int sum=0,q,r,num;
  scanf("%d",&num);
  
  while(num/10>0){
   
    q=num/10;
    r=num%10;
    sum=sum+r;
    num=q;
  }
  
  sum=sum+num;
  
  printf("%d",sum);
  
	return 0;
}
