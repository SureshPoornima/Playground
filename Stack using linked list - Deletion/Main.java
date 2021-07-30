#include <iostream>
#include <cstdlib> 
using namespace std;
struct Node { 
   int data; 
   struct Node *next; 
}; 
struct Node* top = NULL; 
void push(int val) {
   struct Node* newnode = (struct Node*) malloc(sizeof(struct Node)); 
   newnode->data = val; 
   newnode->next = top; 
   top = newnode; 
}
void pop() {
  while(top != NULL){
   if(top==NULL)
      cout<<"Stack Underflow"<<endl;
   else {
      cout<<"Deleted element is "<< top->data <<endl;
      top = top->next;
   }
  }
}
void display() {
   struct Node* ptr;
   if(top==NULL)
      cout<<"Before deleting:"<<endl;
   else {   
      ptr = top; 
      cout<<"Before deleting:"<<endl;
      while (ptr != NULL) { 
        
         cout<< ptr->data <<" "; 
         ptr = ptr->next; 
        
      } 
   }
   cout<<endl;
}
int main() {
   int ch, val; 
    while(!cin.eof())
    {
            cin>>val;
      if(val > 0){
            push(val);
      }
    }
  display();
  pop();
  cout<<"Stack is empty";
      return 0;
}