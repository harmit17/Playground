#include<stdio.h>
#include<string.h>

int main(){

    char str[100];
    gets(str);

    int count1[26]={0},c=0,x,a=strlen(str);

     while(str[c]!='\0'){
        if(str[c]>='a' && str[c]<'z'){
                x=str[c]-'a';
                count1[x]++;
        }
        c++;
    }

    int flag=1;
    for(int i=0;i<a;i++){

        x=str[i]-'a';
        if(count1[x]==1){

            printf("%c",str[i]);
          	flag=1;
            break;
        }
        else if(count1[x]>1){

            flag=0;
        }
    }

    if(flag==0)
        printf("All the characters are repetitive");
    return 0;
}