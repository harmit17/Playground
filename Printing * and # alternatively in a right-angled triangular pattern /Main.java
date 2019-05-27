#include <stdio.h>
int main(){
	int  n,count=0,i=1,j=1;
  	scanf("%d",&n);

  	for(i=1;i<=n;i++){

     for(j=1;j<=i;j++){

       if(count%2==0)
            printf("*");
       else
            printf("#");

        count++;
     }
      printf("\n");
    }
  	return 0;
}
