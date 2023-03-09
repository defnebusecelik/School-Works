#include <stdio.h>
//created by daphne
void hanoiTower( int n, char *kaynak, char *ara, char *hedef ){ 
 if( n==1 ){
     printf("Diski kaydır: %s -> %s\n", kaynak, hedef); 
 }
 else{ 
    hanoiTower( n-1, kaynak, hedef, ara ); 
    printf("Diski kaydır: %s -> %s\n", kaynak, hedef); 
    hanoiTower( n-1, ara, kaynak, hedef ); 
    } 
 } 
 
int main(){
 hanoiTower( 8, "1.sütun", "2.sütun", "3.sütun"); 
 return 0; 
}
