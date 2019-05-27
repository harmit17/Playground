#include<stdio.h>
int main()
{
  int a;
  scanf("%d",&a);
  a=a%100;
  a=a/10;
  printf("%d",a);
  return 0;
}