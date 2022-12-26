# Daily_Practice


lamport 

#include <stdio.h>


int max(int a , int b){
    if(a>b)
        return a;
    else return b    ;
}

int main(){
    int p1[20] , p2[20] ,dep[20][20] , e1 , e2;
    printf("Enter the no. of event for process as p1 and p2 \n");
    scanf("%d %d" , &e1 , &e2);
    for(int i = 0  ; i < e1 ; i++){
        p1[i] = i+1;
    }
    for(int j = 0 ; j < e2 ; j++){
        p2[j] = j+1;
    } 

    printf("Enter the dependancy matrix \n");
    printf("\nhappend before relationship :\n enter 1 if e1 -> e2 , \n enter -1 if e1 <- e2 \n else 0 \n");
    
    //prints the process 2 line 
    for(int i = 0 ; i < e2; i++){
        printf("\te2%d",i+1);
        
    }
    //print process1 line with scanf the dep matrix
    for(int i = 0 ; i < e1 ; i++){
        printf("\ne1%d",i+1);
        for(int j = 0 ; j < e2 ; j++){
            scanf("%d", &dep[i][j]);
        }
    }

    for(int i = 0 ; i< e1 ; i++){
        for(int j = 0 ; j < e2 ; j++){
            if(dep[i][j] == 1){
                p2[j] = max(p2[j] , p1[i]+1);
                for(int k = j ; k<e2;k++){
                    p2[k+1] = p2[k] + 1;
                }
            }

            if(dep[i][j] == -1){
                p1[i] = max(p1[i] , p2[j]+1);
                for(int k = i ; k<e1;k++){
                    p2[k+1] = p1[k] + 1;
                }
            }
        }
    }
    printf("p1 is :");
    for(int i = 0; i < e1 ; i++){
        printf("%d", p1[i] );
    }

    printf("p2 is :");
    for(int j = 0; j < e2 ; j++){
        printf("\n%d", p2[j]);
    }
}




