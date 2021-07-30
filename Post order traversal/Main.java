#include<iostream>
#include <cstdlib>
using namespace std; 
struct node {
   int data;
   struct node *left;
   struct node *right;
};
struct node *createNode(int val) {
   struct node *temp =  (struct node *)malloc(sizeof(struct node));
   temp->data = val;
   temp->left = temp->right = NULL;
   return temp;
}
void postorder(struct node *root) {
   if (root != NULL) {   
      postorder(root->left);
      postorder(root->right);
      cout<<root->data<<" ";
   }
}
struct node* insertNode(struct node* node, int val) {   
   if (node == NULL) return createNode(val);
   if (val < node->data)
      node->left  = insertNode(node->left, val);
   else if (val > node->data)
      node->right = insertNode(node->right, val);   
   return node;
}
int main() {
   struct node *root = NULL;
  int x;
  while(!cin.eof()){
    cin>>x;
    if(x > 0){
   root = insertNode(root, x);
   insertNode(root, x);
    }
  }
   cout<<"Post order Traversal:"<<endl;
   postorder(root);
   return 0;
}