#include<stdio.h>

int main(){

    int n,k=0;
    scanf("%d",&n);
    int a[n],b[n];

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(int i=0;i<n;i++){
        int count1=0;
        for(int j=0;j<n;j++){

            if(a[i]==a[j])
                count1++;
        }
        b[i]=count1;
    }

    int max=0,index;
    for(int i=0;i<n;i++){

        if(b[i]>max){

            max=b[i];
            index=i;
        }
    }
    printf("%d",a[index]);
    return 0;
}