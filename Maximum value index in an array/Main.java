// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int n;
  scanf("%d",&n);
  int a[n];
  
  for(int i=0;i<n;i++){
    
   	scanf("%d",&a[i]); 
  }
  
  printf("%d",n-1);
  
  
   return 0;
}