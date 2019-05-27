#include<stdio.h>

int square_num(int n){
  
 return n*n; 
}

int main() {
   
  int n,x;
  scanf("%d",&n);
  
  x=square_num(n);
  printf("%d",x);
   return 0;
}