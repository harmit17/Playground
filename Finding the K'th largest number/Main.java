#include<stdio.h>

int main(){

    int n,k;
    scanf("%d",&n);
    int a[n];

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    scanf("%d",&k);

    for(int i=0;i<n;i++){

        for(int j=i+1;j<n;j++){

            int temp;
            if(a[i]<a[j]){

                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
            }
        }
    }

    printf("%d",a[k-1]);

    return 0;
}
