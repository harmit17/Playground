/*
Decode it !!!
Tom and Jerry want to convey their needs to their master. Since they are enemy they don't like to share their needs directly, so they are using Caesar
Shift Encryption so that both of them will not know the other ones need. Now help their master to decrypt their needs.
The first line of input is their need and the second line of input is the key value.

 Input: Fuuqj 5
 Output: Apple

Explanation: Each letter of a given message is an encoded one. The letters of the actual string are replaced by a letter with some fixed number of
positions down the alphabet to encode. For example, to encrypt with a shift of 1, A would be replaced by B, B would become C, and so on. So, your
task is to shift the letters with the given key in a reverse way.
--------------------------
Input (stdin)
J xbou b dvq pg Njml
53

Output (stdout)
I want a cup of Milk

*/

#include<stdio.h>
#include<string.h>

int main(){

    char str[100],alphaU[26],alphaL[26];
    int key;
    gets(str);
    scanf("%d",&key);
    int x=strlen(str);

    //Lower Case character array
    char ch1='a';
    for(int i=0;i<26;i++){

        alphaL[i]=ch1;
        ch1++;
    }

    //Upper Case character array
    char ch2='A';
    for(int i=0;i<26;i++){

        alphaU[i]=ch2;
        ch2++;
    }

    if(key>26)
            key=key%26;

    for(int i=0;i<x;i++){
           for(int j=0;j<26;j++){

                if(str[i]==alphaL[j]){

                    int d=j-key;
                    if(d<0)
                        d=d+26;

                    str[i]=alphaL[d];
                    //printf("%d %d %d %c, ",i,j,d,str[i]);
                    break;
                }
           }
    }

    for(int i=0;i<x;i++){

       for(int j=0;j<26;j++){

            if(str[i]==alphaU[j]){

                int d=j-key;
                if(d<0)
                    d=d+26;
                str[i]=alphaU[d];
                break;
            }
       }
    }

    for(int i=0;i<x;i++)
        printf("%c",str[i]);

    return 0;
}
