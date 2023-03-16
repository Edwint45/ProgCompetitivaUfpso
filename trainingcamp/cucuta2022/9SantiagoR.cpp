#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    unsigned long long int n,i,triangularInferior,resta,x,y;
    do{
        scanf("%llu",&n);
        i=(-1+sqrt(1+(8*(double)(n))))/2;
        triangularInferior=(i*(i+1))/2;
        resta=n-triangularInferior;
        if(i%2==0){
            if(resta==0){
                y=1;
                x=i;
            }else{
                y=resta;
                x=(((i+1)*((i+1)+1))/2)-n;
                x++;
            }
        } else if(i%2!=0){
            if(resta==0){
                y=i;
                x=1;
            }else{
                x=resta;
                y=(((i+1)*((i+1)+1))/2)-n;
                y++;
            }
        }
        if(n!=0){
            cout<<x<<" "<<y<<endl;
        }
    }while(n!=0);
}