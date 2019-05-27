#include<stdio.h>
int main()
{
  int a[3],avg=0,sum=0;
  for(int i=0;i<3;i++){
   	scanf("%d\n",&a[i]); 
  }
  for(int i=0;i<3;i++){
   sum=sum+a[i]; 
  }
  avg=sum/3;
  printf("%d",avg);
  
  return 0;
}