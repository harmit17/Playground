#include<stdio.h>
#include<string.h>
int  Rotation_check(char *str1, char *str2)
{
  char temp;
  int x=strlen(str1),y=strlen(str2),j;
  for(int i=1;i<=x;i++){

    	char temp=str1[0];
    	for(j=1;j<x;j++){

    		str1[j-1]=str1[j];
        }
    	str1[j-1]=temp;


    	if(strcmp(str1,str2)==0)
          	return 1;
    	else
          	continue;
  }

}
int main()
{
  char st1[20], st2[20];
  gets(st1);
  gets(st2);

  int x=Rotation_check(st1,st2);

  if(x==1)
    printf("Yes");
  else
    printf("No");

  return 0;
}
