#include <iostream>
#include <conio.h>
#include <stdlib.h>

using namespace ::std;

struct Nodo {
	
int codigo;
string nombre;
string apellido1;
string apellido2;
string correo;
int nota;
Nodo*siguiente;
	Nodo*atras;
}	*primero,*ultimo;


void menu();
void insertar(Nodo *&lista, int c,string n, string a, string s, string d, int m);
void mostrarNotas(Nodo*lista);
void buscar(Nodo*lista);
void modificar(Nodo*lista);
void eliminar();

void mostrarlistaPU();

Nodo*lista=NULL;



int main(){

	menu();
    getch();
    return 0;
}


void menu(){

int opcion;
int codigo;
int nota;
string nombre;
string apellido1;
string apellido2;
string correo;


do{
	
	
	cout<<"\t. :Menu:.\n";
	cout<<"1. Inserte el estudiante\n";
	cout<<"2. Buscar el estudiante\n";
	cout<<"3. Eliminar el estudiante\n";
	cout<<"4. Total de estudiantes aprobados y reprobados \n";
	cout<<"5. Verificar \n";
	cout<<"6. Salir \n";
	
	cout<<"opcion :";
	cin>>opcion;
	
	switch (opcion){
	
	case 1:
			cout<<"\nIngrese el CODIGO del estudiante: ";
			cin>>codigo;
			cout<<"\nIngrese el NOMBRE del estudiante: ";
			getline(cin>>ws, nombre);
			cout<<"\nIngrese el PRIMER APELLIDO  del estudiante: ";
			getline(cin>>ws, apellido1);
			cout<<"\nIngrese el SEGUNDO APELLIDO del estudiante: ";
			getline(cin>>ws, apellido2);
			cout<<"\nIngrese la CORREO del estudiante: ";
			getline(cin>>ws,correo);
			cout<<"\nIngrese la NOTA del estudiante: ";
			cin>>nota;
			
			insertar(lista, codigo ,nombre, apellido1, apellido2,correo,nota);
			
			cout<<"\n";
			system("pause");
	break;
	
	
	
	case 2:  
			buscar(lista);
			cout<<"\n";
			system("pause");
	break;
	
		case 3:  
			eliminar();
			cout<<"\n";
			system("pause");
	break;
	
			case 4: 
	mostrarNotas(lista);
			cout<<"\n";
			system("pause");
	break;
	
	
	
				case 5: 
		mostrarlistaPU();
			cout<<"\n";
			system("pause");
	break;
	
}
      system("cls");
} while(opcion !=6);
}


void insertar(Nodo *&lista, int c,string n, string a, string s, string d, int m){
	
	Nodo*nuevo=new Nodo();
	nuevo->codigo=c;
	nuevo->nombre=n;
	nuevo->apellido1=a;
	nuevo->apellido2=s;
	nuevo->correo=d;
	nuevo->nota=m;

	Nodo*aux1=lista;
	Nodo*aux2;
	
	
	cout<<"Por favor,Ingrese los datos solicitados:  ";
	
	nuevo->codigo=c;
	nuevo->nombre=n;
	nuevo->apellido1=a;
	nuevo->apellido2=s;
	nuevo->correo=d;
	nuevo->nota=m;
	
	if(primero ==NULL){
		primero=nuevo;
		primero->siguiente=NULL;
		primero->atras=NULL;
		ultimo=primero;
	}else{
		ultimo->siguiente= nuevo;
		nuevo->siguiente = NULL;
		nuevo->atras=ultimo;
		ultimo=nuevo;
	}
	
		cout<<"\nEl NOMBRE estudiante: "<<n<<" , Se registro correctamente";
		cout<<"\nEl APELLIDO 1 estudiante: "<<a<<",  Se registro correctamente";
		cout<<"\nEl APELLIDO 2 estudiante: "<<s<<",  Se registro correctamente";
		cout<<"\nEl CORREO estudiante: "<<d<<",  Se registro correctamente";
		cout<<"\nLa NOTA estudiante: "<<m<<",  Se registro correctamente";
		
	
	

}


void buscar(Nodo*lista){

	Nodo*actual=new Nodo();
	actual=primero;
	bool encontrado=false;
	int nodoEncontrado= 0;
	cout<<"\n Ingrese el CODIGO de estudiante a buscar :  ";
	cin>>nodoEncontrado;
	

	if(primero !=NULL){
		
		while(actual !=NULL ){
			
			if(actual->codigo == nodoEncontrado){
					cout<<"\n El Estudiante con codigo: ("<<nodoEncontrado<<") fue encontrado \n\n";
					cout<<"\n El Estudiante tiene nota: ("<<actual->nota <<") \n";
					encontrado=true;
			}

			actual= actual ->siguiente;
		}
		
		if(!encontrado){
			cout<<"\n No se encontro el codigo del estudiante \n";
		}
		
	}else{
		cout<<"\n la lista esta vacia";
	}

	
}

void mostrarNotas(Nodo*lista){
	
	Nodo*actual=primero;
	int totalAprobados=0;
	int Aprobados;
	int Reprobados;
	
	
	while(actual!=NULL){
		
		if(actual->nota >=70){
			Aprobados++;
		}else{
			Reprobados++;
		}
		actual=actual->siguiente;
	}
		cout<<"\n La cantidad de aprobados es: "<<Aprobados<<endl;
		cout<<"\n La cantidad de reprobados es: "<<Reprobados<<endl;
	
	
	}

void eliminar(){
		
	Nodo*actual=new Nodo();
	actual=primero;
	bool encontrado=false;
	int nodoEncontrado= 0;
	cout<<"\n Ingrese el CODIGO del estudiante a eliminar:  ";
	cin>>nodoEncontrado;
	
	if(primero !=NULL){
		
		while(actual !=NULL){
			
			if(actual->codigo ==nodoEncontrado){
					cout<<"\n El estudiante con codigo: ("<<nodoEncontrado<<") fue encontrado \n\n";
					encontrado=true;
					
					if(actual == primero){
					primero = primero->siguiente;
				}else if(actual == ultimo){
					ultimo->siguiente = NULL;

				}else{
					ultimo->siguiente = actual->siguiente;
				}

				cout << "\n El estudiante con codigo: " <<actual->codigo<< " fue eliminado con exito\n\n ";
				encontrado = true;
					
			}
			ultimo = actual;
			actual= actual ->siguiente;
		}
		
		if(!encontrado){
			cout<<"\n No se encontro el CODIGO del estudiante \n";
		}
		
	}else{
		cout<<"\n la lista esta vacia";
	}
	
}



void mostrarlistaPU(){
	
	Nodo*actual=new Nodo();
	actual=primero;

	if(primero !=NULL){
		
		while(actual !=NULL ){
			cout<<"->"<<actual->nota;
			actual= actual -> siguiente;
		}
		
	}else{
		cout<<"\n la lista esta vacia";
	}
	
	
}

	









