#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {

    long long int n; 
    int t,s;
    cin>>t;
    for(int i=1; i<=t; i++){
     cin>>s;    
    n = (long long int)(s+1)*(s+1)-1;
        cout<<n<<endl;  
    } 
    
    return 0;
}