#include<stdio.h>

int main(){

    int n;
    scanf("%d",&n);
    int a[n],b[n],j=0;

    for(int i=0;i<n;i++){

        scanf("%d",&a[i]);
    }

    for(int i=0;i<n;i++){

        if(a[i]>0){

           a[j]=a[i];
           j++;
        }
    }

    while(j<n){

        a[j++]=0;
    }
    for(int i=0;i<n;i++){

        printf("%d ",a[i]);
    }


    return 0;
}
