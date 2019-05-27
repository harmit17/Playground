/*
Sorting the first half of the array in ascending order and the second half of the array in descending order.
Write a C code to sort the first half of the array in ascending order and the second half of the array in descending order.
------------------------
Sample Input:
6
10 30 20 40 60 50

Sample Output:
10 20 30 60 50 40
--------------------------
Input (stdin)
6
10 30 20 40 60 50

Output (stdout)
10 20 30 60 50 40
------------------------
Input (stdin)
7
10 4 6 2 8 9 0

Output (stdout)
4 6 10 9 8 2 0
------------------------
*/

#include<stdio.h>

int main(){

    int n;
    scanf("%d",&n);
    int a[n];

    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);

    int x=n/2;

    for(int i=0;i<x;i++){

        for(int j=i+1;j<x;j++){

            if(a[i]>a[j]){

                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
    }

    for(int i=x;i<n;i++){

        for(int j=i+1;j<n;j++){

            if(a[i]<a[j]){

                int temp=a[j];
                a[j]=a[i];
                a[i]=temp;
            }
        }
    }

    for(int i=0;i<n;i++)
        printf("%d ",a[i]);

    return 0;
}
