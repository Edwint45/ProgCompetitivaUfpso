#include <iostream>
#include <iomanip>
#include <vector>
#include <sstream>
#include <string>
#include <math.h>
#include <bits/stdc++.h>
using namespace std;
 
int main() {
    string e;
    string letra[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    string num[]={"0","1","2","3","4","5","6","7","8","9"};
    int b=0,n=0,l=0,cont=0;
    getline(cin,e);
    for(int i=0;i<e.size();i++){
        string le(1,tolower(e.at(i)));
        if(le==" "){
            b++;
        }else{
            cont=0;
            for(int j=0;j<sizeof(letra)/sizeof(letra[0]);j++){
                if(le==letra[j]){
                    l++;
                    cont=1;
                }
            }
            if(cont==0){
                for(int j=0;j<sizeof(num)/sizeof(num[0]);j++){
                if(le==num[j]){
                    n++;
                }
            }
            }
        }
    }
    int t= e.size()-b;
    double p= l*10+n*20+(t-(l+n))*30;
    cout<<"Precio: $"<<p<<endl;
    return 0;
}
