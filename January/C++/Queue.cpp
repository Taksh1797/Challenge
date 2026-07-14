#include<iostream>
using namespace std;

int a[5],front=-1,rear=-1;

void enqueue(int x){
	if(rear>=5)
		cout<<"Queue is Full.\n";
	else{
		if(front==-1)
			front=rear=0;
		a[rear++]=x;
	}
}

void dequeue(){
	if(front==-1 || front==rear)
		cout<<"Queue is Empty.\n";
	else{
		cout<<"Queue remove : "<<a[front++]<<endl;
		if(front==rear){
			front=-1,rear=-1;
		}
	}
}
void display(){
	if(front==-1 || front == rear)
		cout<<"Queue is Empty.\n";
	else
		for(int i=front;i<rear;i++)
			cout<<"\t"<<a[i];
	cout<<endl;
}
int main(){
	int ch,x;
	cout<<"1.Enqueue \t 2.Dequeue \t 3.Display \t 4.Exit\n";
	do{
		cout<<"Enter a Choice : ";
		cin>>ch;
		switch(ch){
			case 1 :
				cout<<"Enter a Value : ";
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
