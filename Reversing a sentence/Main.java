#include <stdio.h>
#include<string.h>
int main(){
  
 	  	char str[100];
  		gets(str);
  		int x=strlen(str),i;
  
    	for (i = x - 1; i >= 0; i--) { 
  			    if (str[i] == ' ') { 
  
            	// putting the NULL character at the  
            	// position of space characters for 
            	// next iteration.          
    	        str[i] = '\0'; 
  	
            	// Start from next charatcer      
            	printf("%s ", &(str[i]) + 1); 
        } 
    } 
  
    // printing the last word 
    printf("%s", str); 
  		 return 0;
}
