#include<stdio.h>

int main(){

    int n,count1=0;;
    scanf("%d",&n);
    int a[n];

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(int i=0;i<n;i++){

        if(a[i]==1 && a[i+1]!=0)
            count1++;
    }
    printf("%d",count1);
    return 0;
}