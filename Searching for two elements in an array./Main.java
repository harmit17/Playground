#include<stdio.h>
int main()
{
  int n,search_ele1,search_ele2,flag1=0,flag2=0;
 
  scanf("%d",&n);
  int a[n]; 
  for(int i=0;i<n;i++){
    
   	scanf("%d",&a[i]);
  }
  
  scanf("\n%d",&search_ele1);
  scanf("\n%d",&search_ele2);
  
  for(int i=0;i<n;i++){
   
    	if(search_ele1==a[i]){
          	printf("%d\n",i);
        	flag1=1;
        }
  }
  if(flag1!=1)
    	printf("-1");
  
  for(int i=0;i<n;i++){
   
    	if(search_ele2==a[i]){
          	printf("%d",i);
    		flag2=1;
        }
  }
   if(flag2!=1)
    	printf("-1");
 
  
  return 0;
}