#include<stdio.h>
int main()
{
    char str1[100];
    gets(str1);
    int x=strlen(str1),j=0;
  	char temp[x];
 
  	for(int i=x-1;i>=0;i--){
     
      	if(j<=x-1){
      		temp[j]=str1[i];
      		j++;
        }
    }
  
  	if(strcmp(str1,temp)==0)
      printf("%s is a palindrome",str1);
  	else
      printf("%s is not a palindrome",str1);
  return 0;
}