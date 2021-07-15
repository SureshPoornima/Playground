#include <iostream>
using namespace std;
struct Node {
   int data;
   struct Node *next;
};
struct Node* head = NULL;
void insert(int new_data) {
   struct Node* new_node = (struct Node*) malloc(sizeof(struct Node));
   new_node->data = new_data;
   new_node->next = head;
   head = new_node;
  cout<<new_node->data<<endl;
}

int main() {
  int data;
  cin>>data;
  while(data > 0){
   insert(data);
    cin>>data;
  }
   return 0;
}