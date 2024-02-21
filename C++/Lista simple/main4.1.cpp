#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace ::std;

struct Nodo{
	int dato;
	Nodo*siguiente;
	Nodo*atras;
}	*primero,*ultimo;


void mostrarlistaPU();
void mostrarlistaUP();
void insertarlista();

int main(){
	
		int opcion_menu = 0;

	do{

	cout << "\n*-------------------------------------*";
	cout << "\n*           ° LISTA SIMPLE °          *";
	cout << "\n*------------------*------------------*";
	cout << "\n* 1. Agregar       * 4.      *";
	cout << "\n* 2. DesplegarPU   * 5.   *";
	cout << "\n* 3. DesplegarUP   * 6.      *";
	cout << "\n*------------------*------------------*";
	cout << "\n\n Por favor, escoja una Opcion: ";
	cin >> opcion_menu;

	switch (opcion_menu) {
	case 1:
		cout << "\n\n INSERTA NODO EN LA LISTA \n\n";
	 insertarlista();
		break;


	case 2:
		cout << "\n\n DesplegarPU  EN LA LISTA \n\n";
	 mostrarlistaPU();
		break;
		
	case 3:
		cout << "\n\n DesplegarUP LA LISTA \n\n";
 mostrarlistaUP();
		break;

	default:
		cout << "\n\n Opcion No Valida \n\n";
	}


	} while (opcion_menu != 3);
	
	
	
	
return 0;	
}



//Primero2		ultimo2		NUEVO2		valores 2,7,78,25,12

//lista doble	2-> <-NULL->			


void insertarlista(){
	
	Nodo* nuevo= new Nodo();
	
	cout<<"Ingrese el dato";
	cin>>nuevo->dato;
	
	if(primero ==NULL){
		primero=nuevo;
		primero->siguiente=NULL;
		primero ->atras=NULL;
		ultimo=primero;
	}else{
		ultimo->siguiente= nuevo;
		nuevo->siguiente = NULL;
		nuevo->atras=ultimo;
		ultimo=nuevo;
	}
	
		cout <<"\n El nodo ingresado";
	
}



//LISTA DE PRIMERO A ULTIMO

//Primero2		ultimo2		NUEVO2		actual		valores 2,7,78,25,12

//lista doble	2-> <-NULL->		

void mostrarlistaPU(){
	Nodo*actual=new Nodo();
	actual=primero;

	if(primero !=NULL){
		
		while(actual !=NULL ){
			cout<<"\n"<<actual->dato;
			actual= actual ->siguiente;
			
		}
		
	}else{
		cout<<"\n la lista esta vacia";
		
	}
	
	
	
}




//LISTA DE ULTIMO A PRIMWEO

//Primero2		ultimo2		NUEVO2		actual		valores 2,7,78,25,12

//lista doble	2-> <-NULL->
void mostrarlistaUP(){
	Nodo*actual=new Nodo();
	actual =ultimo;
	if(primero !=NULL){
	
	while(actual !=NULL){
		cout<<"\n"<<actual->dato;
		actual=actual ->atras;
	}
	
	}else{
		cout <<"la lista se encuentra vacia";
	}
	
	
}
