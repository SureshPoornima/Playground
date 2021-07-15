#include <iostream>
using namespace std;
int stack[100], n = 100, top = -1;
void push(int val) {
   if(top > n)
      cout<<"Stack Overflow"<<endl;
   else {
      top++;
      stack[top] = val;
   }
}
void display() {
   if(top> 0) {
      cout<<"Stack elements are:"<<endl;
      for(int i = top; i>= 0; i--)
         cout<<stack[i]<<" ";
      cout<<endl;
   } else
      cout<<"Stack is empty";
}
int main() {
   int size, val,n=0;
 
  cin>>size;
   do {
            cin>>val;
            push(val);
            n++;
      
   }while(n < size);
   display();
   return 0;
}