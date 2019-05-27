/*
Write a C code to find all pairs of elements whose sum is equal to the given value.
Sample Input :

5

1 3 4 7 5

7

Sample Output :

Perfect couple: 3 4
*/

#include<stdio.h>
#include<stdlib.h>
void check_sum_and_display(int arr[], int size, int sum);
int main()
{
    // Get the size of an array
    int size;
    scanf("%d", &size);

    // Get the array elements
    int arr[50], i;
    for(i=0; i<size; i++)
    {
        scanf("%d", &arr[i]);
    }

    // Get the sum value (to check with an array elements)
    int sum;
    scanf("%d", &sum);

  	// Function call to check the sum of any two elements in an array equal to given sum
  	// and display the same
    check_sum_and_display(arr, size, sum);
    return 0;
}

void check_sum_and_display(int arr[], int size, int sum)
{
  int sum1=0,count1=0;
  for(int i=0;i<size;i++){

        for(int j=i+1;j<size;j++){

            sum1=arr[i]+arr[j];
            if(sum1==sum){

                printf("Perfect couple: %d %d",arr[i],arr[j]);
              	count1=1;
              	break;
            }
        }
    
  }
   if(count1!=1){

      printf("No perfect couple found!");
    }
  
}
