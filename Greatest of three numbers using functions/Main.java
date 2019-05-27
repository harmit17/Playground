#include <stdio.h>

int greatest(int x,int y){
  
 	if(x<y)
      return y;
  	else
      return x;
}

int main(){

  int a,b,c;
  scanf("%d %d %d",&a,&b,&c);
  
  int x=greatest(a,b);
  
  if(x>c)
    printf("%d",x);
  else
    printf("%d",c);
  
  
  	return 0;
}