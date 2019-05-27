#include<stdio.h>

int main(){

    int n;
    scanf("%d",&n);
    int a[n];

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    int x=n/2;
    for(int i=0;i<x;i++){

        for(int j=i+1;j<x;j++){

            if(a[i]>a[j]){

                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
    }

    for(int i=0;i<n;i++)
        printf("%d ",a[i]);

    return 0;
}
