#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <string>
#include <set>

using namespace std;

struct Nodo {
    string dato; 
    int datoN;
	int tope;
    Nodo* siguiente;
};

void Menu();
void InsertarP(Nodo *&tope, string dato);
void InsertarN(Nodo *&tope, string dato);
void Positivo();
void Negativo();
void Mostrar();

Nodo *tope = NULL;
int contador;
int mayor;
int menor;

int main(){
	
	contador = 0;
	mayor = 0;
	menor = 0;
	Menu();
	
    return 0;
}

void Menu(){	
	string dato;
	int opcion = 0;
	
	do{
        cout << "1. Agregar los datos de la pila\n";
        cout << "2.  Agregar los datos NEGATIVOS de la pila\n" ;
        cout << "3. Mostrar numero positivo mayor\n";
        cout << "4. Mostrar numero Negativo mayor\n";
        cout << "5. Salir\n" << endl;
        cout << "Ingrese una opcion: ";
        cin >> opcion;


		
		switch(opcion){
			case 1:
				if(contador < 19){
				cout << "Ingrese el numer POSITIVO ";
				cin >> dato;
				InsertarP(tope,dato);
				}else {
				cout << "El tope de digitos es 20 ";
				system("pause");
				}
				break;
			case 2:
				if(contador < 19){
				cout << "Ingrese el NEGATIVO ";
				cin >> dato;
				InsertarN(tope,dato);
				}else {
				cout << "El tope de digitos es 20 ";
				system("pause");
				}
				break;
			case 3:
				Positivo();
				break;
			case 4:
				Negativo();
				break;
			case 5:
				Mostrar();
				break;
			case 6:
				break;
			default:
				cout << endl << "Digite una opcion valida ";
				system("pause");
		}
		
	}while(opcion != 6);
}



void InsertarN(Nodo *&tope, string dato){
	if(dato =="A"){
			cout << "Debe ser negativo" ;
			system("pause");
		}else {
			Nodo* nodo = new Nodo;
    		nodo->dato = dato;
    		nodo->siguiente = tope;
    		tope = nodo;
			contador = contador + 1;
			if(dato == "A"){
				
			}
			system("pause");
		}
}


void InsertarP(Nodo *&tope, string dato){
		if(dato == ""){
			cout << "Debe ser  positivo";
			system("pause");
		}else {
			Nodo* nodo = new Nodo;
    		nodo->dato = dato;
    		nodo->siguiente = tope;
    		tope = nodo;
			contador = contador + 1;
			if(dato > mayor){
				mayor = dato;
			}
			cout << endl << "Numero apilado " << endl << endl;
			system("pause");
		}
}


void Negativo(){
	system("cls");
	
	cout << "El menor numero negativo ingresado es: " << menor ;
	
	system("pause");
}

void Positivo(){
	system("cls");
	
	cout << "El mayor numero positivo ingresado es: " << mayor;	
	
	system("pause");
}



void Mostrar(){

 /*   if (tope == NULL) {
        cout << "La pila esta vacia" << endl;
    } else {
        int topeDato = tope->dato;
        cout << "La pila es:" << endl;
        Nodo* nodoActual = tope;
        while (nodoActual != NULL) {
            cout << nodoActual->dato << endl;
            nodoActual = nodoActual->siguiente;
        }
        cout << "El tope de la pila es: " << topeDato << endl;
        return topeDato;
    
}
*/

}

