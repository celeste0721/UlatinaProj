#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include   <string>

using namespace::std;

struct Nodo{
int cedula;
string nombre;
string apellido1;
string apellido2;
string direccion;
string enfermedad;
string telefono;
Nodo *siguiente;
};

void menu();
void insertarlista(Nodo *&,int,string,string,string,string,string,string);
void mostrar(Nodo *);
void buscar(Nodo*lista);
void modificar (Nodo *lista);
void Eliminar(Nodo *lista);

Nodo  *lista = NULL;

int main(){
	 menu();
	
    getch();
    return 0;
}

void menu(){

int opcion;

int cedula;
string nombre;
string apellido1;
string apellido2;
string direccion;
string enfermedad;
string telefono;
do{
	
	cout<<"\t. :Menu:.\n";
	cout<<"1. Inserte el elemento en la lista\n";
	cout<<"2. Mostrar el elemento en la lista\n";
	cout<<"3. buscar\n";
	cout<<"4. Modificar \n";
	cout<<"5. Eliminar \n";
	cout<<"6. Salir \n";
	
	
	cout<<"opcion :";
	cin>>opcion;
	
	switch (opcion){
	
	case 1: cout << "Digite la cedula ";
            cin >> cedula;
            cout << "Digite el nombre ";
           	getline(cin>> ws, nombre);
            cout << "Digite el primer apellido ";
            getline(cin>> ws, apellido1);
            cout << "Digite la segundo apellido ";
            getline(cin>> ws, apellido2);
            cout << "Digite la dirreccion ";
           getline(cin>> ws, direccion);
            cout << "Digite la enfermedad ";
           getline(cin>> ws, enfermedad);
            cout << "Digite el telefono ";
           getline(cin>> ws, telefono);
            insertarlista(lista, cedula, nombre, apellido1, apellido2, direccion, enfermedad, telefono);
			cout<<"\n";
			system("pause");
	break;
	case 2:  mostrar(lista);
			cout<<"\n";
			system("pause");
	break;
	
		case 3:  buscar(lista);
			cout<<"\n";
			system("pause");
	break;
	
	
			case 4: 
			
			modificar (lista);
			cout<<"\n";
			system("pause");
	break;
	
				case 5: 
			
			Eliminar (lista);
			cout<<"\n";
			system("pause");
	break;
}
      system("cls");
} while(opcion !=6);

}
void insertarlista(Nodo *&lista, int n, string m, string x, string c, string v, string z, string k){


Nodo *nuevo_nodo = new Nodo();
nuevo_nodo->cedula=n;
nuevo_nodo->nombre=m;
nuevo_nodo->apellido1=x;
nuevo_nodo->apellido2=c;
nuevo_nodo->direccion=v;
nuevo_nodo->enfermedad=z;
nuevo_nodo->telefono=k;
Nodo *aux1 = lista;
Nodo *aux2;

   while ((aux1 != NULL) && (aux1 ->cedula <n)){
   

aux2= aux1;
aux1 = aux1 ->siguiente;

}
    if (lista == aux1){

lista = nuevo_nodo;

}
     else{

aux2 ->siguiente = nuevo_nodo; 
}

nuevo_nodo -> siguiente = aux1;

cout<<"\El elemento " <<n<< " insertado corerctmente\n";
cout<<"\El elemento " <<m<< " insertado corerctmente\n";
cout<<"\El elemento " <<x<< " insertado corerctmente\n";
cout<<"\El elemento " <<c<< " insertado corerctmente\n";
cout<<"\El elemento " <<v<< " insertado corerctmente\n";
cout<<"\El elemento " <<z<< " insertado corerctmente\n";
cout<<"\El elemento " <<k<< " insertado corerctmente\n";
}

void mostrar(Nodo *lista){

Nodo *actual = new Nodo();
actual = lista;

  while (actual != NULL){
  cout <<actual->cedula<<"-> ";
  cout <<actual->nombre<<"-> ";
  cout <<actual->apellido1<<"->";
  cout <<actual->apellido2<<"->";
  cout <<actual->direccion<<"-> ";
  cout <<actual->telefono<<"-> ";
  cout <<actual->enfermedad<<"-> \n\n";
  
  actual = actual->siguiente;
  
  
  }
  
}


void buscar(Nodo*lista){
	Nodo*actual=new Nodo();
	actual=lista;
	
	bool encontrado= false;
	int buscarnodo=0;
	
	cout<<"Digite el nodo a buscar";
	cin>>buscarnodo;
	
	if(lista !=NULL){
		
		while(actual != NULL & encontrado != true){
			
			if(actual->cedula== buscarnodo){
				cout<<"El paciente"<<buscarnodo<<"Existe";
				encontrado=true;
			}
			actual=actual->siguiente;
		}
		
		if(!encontrado){
			cout<<"El paciente no existe";
		}
		
	
	}else{
		cout<<"Lista se encuentra vacia";
	}
}

void modificar (Nodo *lista){
	
	Nodo* actual = new Nodo();
	actual = lista;
	bool encontrado = false;
	int nodoBuscado = 0;
	cout << " Ingrese el dato del nodo a Buscar para Modificar: ";
	cin >> nodoBuscado;

	if (lista != NULL) {

		while (actual != NULL && encontrado != true) {

			if (actual->cedula == nodoBuscado) {
				cout << "\n Nodo con el dato " << nodoBuscado << " Encontrado";
				
				cout << "\n Ingrese el Nuevo dato para CEDULA: ";
				cin>>actual->cedula ;
				
				cout << "\n Ingrese el Nuevo dato para NOMBRE: ";
				getline(cin>> ws, actual->nombre);
				
				cout << "\n Ingrese el Nuevo dato para este APELLIDO1: ";
				getline(cin>> ws, actual->apellido1);
				
				cout << "\n Ingrese el Nuevo dato para este APELLIDO2: ";
				getline(cin>> ws, actual->apellido2);
				
				cout << "\n Ingrese el Nuevo dato para este DIRECCION: ";
				getline(cin>> ws, actual->direccion);

				cout << "\n Ingrese el Nuevo dato para este ENFERMEDAD: ";
				getline(cin>> ws, actual->enfermedad);
				
				cout << "\n Ingrese el Nuevo dato para este TELEFONO: ";
				getline(cin>> ws, actual->telefono);

				encontrado = true;
			}

			actual = actual->siguiente;
		}
		if (!encontrado) {
			cout << "\n Error,Nodo No Encontrado\n\n";
		}
	}
	else {
		cout << "\n La Lista se Encuentra Vacia\n\n";
	}
	
}

void Eliminar(Nodo *lista){
	Nodo* temp = new Nodo();
	int nodobuscado = 0;
	
	//	actual = primero;
	//	nodo* anterior = new nodo();

	cout << " Ingrese el dato del nodo a buscar para Eliminar: ";
	cin >>nodobuscado;

	// Si la lista está vacía o el nodo a eliminar es el primer nodo

	if (lista == NULL || (lista)->cedula == nodobuscado) {
		Nodo* temp = lista;
		lista = lista->siguiente;
		delete temp;
		return;
	}

	// Encuentra el nodo previo al que se quiere eliminar
	Nodo* buscado = lista;
	while (buscado->siguiente != NULL && buscado->siguiente->cedula != nodobuscado) {
		buscado = buscado->siguiente;
	}

	// Si se encontró el nodo a eliminar
	if (buscado->siguiente != NULL) { 
		Nodo* temp = buscado->siguiente;
		buscado->siguiente = temp->siguiente;
		delete temp;
	}
	

	}




