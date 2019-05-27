#include<stdio.h>
#include<string.h>

int main(){

    int k=0;
    char str[100],str2[k];
    gets(str);

    int x=strlen(str);

    for(int i=0;i<x;i++){

        if((str[i]=='t' && str[i+1]=='h' && str[i+2]=='e') || (str[i]=='T' && str[i+1]=='h' && str[i+2]=='e') ){

            i=i+3;
        }
        else{

            str2[k]=str[i];
            k++;
        }
    }

    for(int i=0;i<k;i++)
        printf("%c",str2[i]);

    return 0;
}
