#include<stdio.h>

int main(){

    int n;
    scanf("%d",&n);
    int a[n];

    for(int i=0;i<n;i++){
        scanf("%d",&a[i]);
    }

    for(int i=0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k=i+2;k<n;k++){

                if((a[i]!= a[j]) && (a[j]!= a[k]) && (i<j) && (j<k))
                    printf("(%d, %d, %d) ",a[i],a[j],a[k]);
            }
        }
      	if(i!=(n-1))
        	printf("\n");
    }
    return 0;
}
