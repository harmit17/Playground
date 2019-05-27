#include <stdio.h>
int main()
{
    int rows, coef = 1, space, i, j;

    scanf("%d",&rows);

    for(i=0; i<rows; i++)
    {
        for(space=1; space <= rows-i-1; space++)
            printf(" ");

        for(j=0; j <= i; j++)
        {
            if ( i==0)
                coef = 1;
            else
                coef =coef + 1;

            //coef++;

            printf("%d ", coef);
        }
        printf("\n");
    }

    return 0;
}
