#include<stdio.h>

int main(){

    int n,num=1;

    scanf("%d",&n);


    for(int i=1;i<=n;i++){

       if(i%2==0){

            for(int j=1;j<=n;j++){

                if(j==1){

                    num++;
                    printf("%d",num);
                }
                else
                    printf("%d",num-1);
            }

       }
        else{

            for(int j=1;j<=n;j++){

                    if(j==n){
                        num++;
                        printf("%d",num);
                    }
                    else
                        printf("%d",num);
            }

        }


        printf("\n");
    }


    return 0;
}
