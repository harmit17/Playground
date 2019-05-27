#include <stdio.h>
int main() {
	
  	int n,count=0;
	scanf("%d",&n);
  
  	for(int i=1;i<=n;i++){
      
     	printf("%d",i); 
      	count++;
      	if(count==3){
         	
          	printf(",");
          	count=0;
        }
    }
	return 0;
}