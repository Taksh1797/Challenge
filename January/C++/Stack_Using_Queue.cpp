#include<iostream>
#include<queue>
using namespace std;
queue<int> q1,q2;

void push(int x){
	q2.push(x);
	while(!q1.empty()){
		q2.push(q1.front());
		q1.pop();
	}
	swap(q1,q2);
}

void pop(){
	if(q1.empty()){
		cout<<"Stack Empty.\n";
		return;
	}
	cout<<"Deleted : "<<q1.front()<<endl;
	q1.pop();
}
void display(){
	if(q1.empty()){
		cout<<"Stack Empty.\n";
		return;
	}
	queue<int> t=q1;
	while(!t.empty()){
		cout<<t.front()<<endl;
		t.pop();
	}
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
