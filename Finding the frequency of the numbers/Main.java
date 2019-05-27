/*
Finding the frequency of the numbers
Write a C code to find the frequency of the numbers in a given array.
(Hint: The frequency of a number denotes the number of occurrences of that number in the given array).

Get the array of size 'n' with values between 1 to k, find the frequency of numbers from 1 to k.

Sample Input:

n = 8

k = 5

arr[] = {4, 3, 2, 1, 1, 2, 3, 1}


Sample Output:

1 3

2 2

3 2

4 1

5 0
*/
#include<stdio.h>

int main(){

    int n,k;
    scanf("%d",&n);
  
    A:
    scanf("%d",&k);

    if(k>n){
        printf("\nEnter legel k.");
        goto A;
    }


    int a[n];
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    for(int i=1;i<=k;i++){

        int count1=0;
        for(int j=0;j<n;j++){

            if(a[j]==i)
                count1++;
        }
        printf("%d %d\n",i,count1);
    }


    return 0;
}
