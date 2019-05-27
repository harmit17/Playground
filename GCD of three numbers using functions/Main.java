#include <stdio.h>

int gcd(int x,int y){
  
  	int min,gcd;
 	if(x<y)
      return min=x;
  	else
      return min=y;
  
  	while(min>0){
     
      	if(x%min==0 && y%min==0)
          	gcd= min;
      	else{
         	min--;
        }
    }
  	return gcd;
  	
}

int main() {
	
  	  int a,b,c;
  		scanf("%d %d %d",&a,&b,&c);
  
  	int x=gcd(a,b);
  
  	int y=gcd(x,c);
  
  	printf("%d",y);
  
  	
	return 0;
}