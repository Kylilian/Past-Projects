#include <iostream>
#include <string>
using namespace std;

struct Address
{
	string city;
	string state;
	int zip;
};

struct person
{
	string name;
	int age;
	Address addr;
};

int main()
{
	person personInfo;

	cout << "Enter the name: ";
	getline(cin, personInfo.name);

	cout << "Enter the age: ";
	cin >> personInfo.age;
	cin.ignore(); //Ignores newline char in buffer

	cout << "Enter the city: ";
	getline(cin, personInfo.addr.city);

	cout << "Enter the state: ";
	getline(cin, personInfo.addr.state);

	cout << "Enter the zip: ";
	cin >> personInfo.addr.zip;

	cout << "The person you entered is:\n\n";

	cout << personInfo.name << ", age " << personInfo.age << endl;
	cout << personInfo.addr.city << ", " << personInfo.addr.state << " " << personInfo.addr.zip;

	return 0;
}