#include<stdio.h>

int main(){

    int size,i;
    scanf("%d",&size);
    int a[size],b[size];

    for(int i=0;i<size;i++)
        scanf("%d",&a[i]);
    int count1=1;

    for(int i=0;i<size;i++){

            b[i]=count1;
            count1++;
    }
 
    for(int i=0;i<size;i++){

        for(int j=0;j<size;j++){

            if(a[i]==b[j]){

                b[j]=0;
            }

        }
    }

    for(int i=0;i<size;i++){

        if(b[i]!=0)
            printf("%d",b[i]);
    }
    return 0;
}
