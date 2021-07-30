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
void preorder(struct node *root) {
   if (root != NULL) {
      cout<<root->data<<" ";
      preorder(root->left);
      preorder(root->right);
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
  int x;
   struct node *root = NULL;
 
  while(!cin.eof()){
    cin>>x;
 
    if(x > 0){
   root = insertNode(root, x);
   insertNode(root, x);
    }
  }
   cout<<"Preorder Traversal:"<<endl;
   preorder(root);
   return 0;
}