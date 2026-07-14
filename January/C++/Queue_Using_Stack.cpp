#include<iostream>
#include<stack>
using namespace std;

stack<int> s1,s2;

void enqueue(int x){
	while(!s1.empty()){
		s2.push(s1.top());
		s1.pop();
	}
	s1.push(x);
	while(!s2.empty()){
		s1.push(s2.top());
		s2.pop();
	}
}

void dequeue(){
	if(s1.empty()){
		cout<<"Queue Empty.\n";
		return;
	}
	else{
		cout<<"Deleted : "<<s1.top()<<endl;
		s1.pop();
	}
}
void display(){
	if(s1.empty()){
		cout<<"Queue Empty.\n";
		return;
	}
	else{
		stack<int> t =s1;
		while(!t.empty()){
			cout<<"\t "<<t.top();
			t.pop();
		}
		cout<<endl;
	}
}
int main(){
	int ch,x;
	cout<<"1.Enqueue \t 2.Dequeue \t 3.Display \t 4.Exit\n";
	do{
		cout<<"Enter a Choice : ";
		cin>>ch;
		switch(ch){
			case 1 :
				cout<<"Enter a value : ";
				cin>>x;
				enqueue(x);
				break;
			case 2 :
				dequeue();
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
