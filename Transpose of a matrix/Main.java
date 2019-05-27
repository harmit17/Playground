#include<stdio.h>

int main(){

    int x,y;
    scanf("%d %d",&x,&y);
    int a[x][y],trans[y][x];

    for(int i=0;i<x;i++)
        for(int j=0;j<y;j++)
            scanf("%d",&a[i][j]);

    for(int i=0;i<x;i++)
        for(int j=0;j<y;j++)
            trans[j][i]=a[i][j];

    for(int i=0;i<y;i++){

        for(int j=0;j<x;j++){

            printf("%d ",trans[i][j]);
        }
        printf("\n");
    }

    return 0;
}
