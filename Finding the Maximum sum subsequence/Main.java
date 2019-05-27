#include<stdio.h>
int main()
{
    int arr_size;
    scanf("%d", &arr_size);
    int arr[arr_size];
    for(int index = 0; index < arr_size; index++)
    {
        scanf("%d", &arr[index]);
    }
    int seq[2 * arr_size];
    int seq_idx = 0;
    int start_idx = 0;


    for(int index = 0 ; index < arr_size-1; index++)
    {
        if(arr[index] > arr[index + 1])
        {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = index;
            seq_idx++;
            start_idx = index + 1;
        }
    }

    if(start_idx != arr_size-1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = arr_size - 1;
            seq_idx++;
    }

    if(start_idx == arr_size - 1)
    {
            seq[seq_idx] = start_idx;
            seq_idx++;
            seq[seq_idx] = arr_size - 1;
            seq_idx++;
    }
    int k=0;
    int a[10];
    for(int index = 0; index <= (seq_idx-1); index = index + 2)
    {
        start_idx = seq[index];
        int end_idx = seq[index + 1];
        int sum=0;
        for (int idx = start_idx ; idx <= end_idx; idx++)
        {
            sum=sum+arr[idx];
            //printf("%d ", arr[idx]);
        }
        a[k]=sum;
        k++;
        //printf("\n");
    }


       //for(int i=0;i<k;i++)
         //       printf("%d ",a[i]);

        int max=0;
        for(int i=0;i<k;i++){

            if(a[i]>max)
                max=a[i];
        }

        printf("%d",max);

   return 0;
}
