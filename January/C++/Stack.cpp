#include<iostream>
using namespace std;
int a[5],top=-1;
void push(int x){
	if(top==4){
		cout<<"Stack Overflow.\n";
		return;
	}
	a[++top]=x;
}

void pop(){
	if(top==-1){
		cout<<"Stack Underflow.\n";
		return;
	}
	cout<<"Pop Elem : "<<a[top--]<<endl;
}
void display(){
	if(top==-1){
		cout<<"Stack Empty.\n";
		return;
	}
	for(int i=top;i>=0;i--)
		cout<<a[i]<<endl;
}
int main(){
	cout<<"1.Push \t 2.Pop \t 3.Display \t 4.Exit\n";
	int ch,x;
	do{
		cout<<"Enter a choice : ";
		cin>>ch;
		switch(ch){
			case 1 :
				cout<<"Enter a Value : ";
				cin>>x;
				push(x);
				break;
			case 2 :
				pop();
				break;
			case 3 :
				display();
				break;
			case 4 :
				cout<<"Exiting...\n";
				break;
			default :
				cout<<"Invalid Choice.\n";
		}
	}while(ch!=4);
	return 0;
}
