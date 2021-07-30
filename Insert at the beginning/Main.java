#include<iostream>
using namespace std;
class node{
 public : 
    int data;
    node *next;
}*head = NULL;

void insert(int data){
  node *temp = head;
  node * newnode = new node();
  newnode->data = data;
  newnode->next = NULL;
  
  if(head == NULL){
    head = newnode;
    }
  else
  {
   head = newnode;
    newnode->next = temp;
  }
}


void print()
{
  node *temp = head;
 while(temp != NULL){
  cout<<temp->data<<endl;;
   temp = temp->next;
 }
}
  int main()
{
  int data;
   
    while(1){
       cin>>data;
      if(data >= 0){
      insert(data);
    }
    else
    {
      break;
    }
    }
      print();
  return 0;
}