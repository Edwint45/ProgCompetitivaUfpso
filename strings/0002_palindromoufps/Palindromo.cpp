#include <iostream>
#include <iomanip>
#include <vector>
#include <sstream>
#include <string>
#include <math.h>
#include <bits/stdc++.h>
using namespace std;

int main() {

    string a[]={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
    int e;
    string s,sd,sr;
    cin>>e;
    for(int i=0; i<e;i++){
        sd="";sr="";
        if(i==0){
            getline(cin,s);
        }
        getline(cin,s);
        for(int j=0;j<s.size();j++){
            string x(1,tolower(s.at(j)));
            for(int y=0;y<sizeof(a)/sizeof(0);y++){
                if(a[y]==x){
                    sd=sd+x;
                    sr=x+sr;
                }
            }
        }
        if(sd==sr){
            cout<<"Palindromo"<<endl;
        }else{
            cout<<"No Palindromo"<<endl;
        }
    }
    return 0;
}