#include<stdio.h>
int main()
{
	int r1,c1;
  scanf("%d",&r1);
  scanf("%d",&c1);
  int a[r1][c1],b[r1][c1];
  
  for(int i=0;i<r1;i++)
    for(int j=0;j<c1;j++)
      scanf("%d",&a[i][j]);
  
   for(int i=0;i<r1;i++)
    for(int j=0;j<c1;j++)
      scanf("%d",&b[i][j]);
  
  int flag=1;
   for(int i=0;i<r1;i++){
    for(int j=0;j<c1;j++){
     	if(a[i][j]!=b[i][j])
          flag=0;
    }
   }
  
  if(flag==0)
    printf("No");
  else 
    printf("Yes");
  
	return 0;
}