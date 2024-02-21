#include <iostream>
#include <conio.h>
#include <stdlib.h>
#include <string>
#include <set>
#include <algorithm>
#include <vector>

using namespace std;

struct Nodo {
	//DATOS
    string nombre;
    string apellido1;
    string apellido2;
    string telCel;
    string telCasa;
    string cedula;
    Nodo *siguiente;
    Nodo *atras;
} *primero, *ultimo;

//Estructura  de la Lista Circular

struct Circular{
	//DATOS
    string nombreCir;
    string apellido1Cir;
    string apellido2Cir;
    string telCelCir;
    string telCasaCir;
    string cedulaCir;
    
    Circular *siguienteCir;
    
} *primeroCir, *ultimoCir;

//DECLARACION DE MENU
void menu();
void menu2();
void menu3();
void menu4();
void menu5();
void menu6();
void menu7();

//DECLARACION METODOS
void insertarNodo(Nodo *&, Nodo *&);
void modificarPersona();
void eliminarPersona(Nodo *&nodo, string cedula);
void buscarPersonaCedula();
void buscarPersonaTel();

//Metodos de la lista Circular
void insertarInactivo(Circular *&, Circular *&);
void insertarActivo(Nodo *&, Nodo *&);
void desplegarCircular(Circular *&);
void ordernarlista(Circular *&);


//Metodos del punto 5,lista doble
void Mostrar(Nodo *);
void ordenarBurbuja(Nodo*lista);
void imprimirPorLetra(char letra);
//Se iguala a NULL las listas a llenar
Nodo *nodo = NULL;
Nodo*lista=NULL;



//MAIN
int main(){
	menu();
	menu2();
	menu3();
	menu4();
	menu5();
	menu6();
	menu7();
    getch();
    return 0;
}

//MENU PRINCIPAL
void menu(){

    int opcion;
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
	 cout<<"     |               1. Ingreso de datos            |"<<endl;
	 cout<<"     |          2.Modificar numero telefonico       |"<<endl;
	 cout<<"     |               3. Eliminar usuario            |"<<endl;
	 cout<<"     |               4. Buscar usuario              |"<<endl;
	 cout<<"     |          5. Ver lista de la guia telefonica  |"<<endl;
	 cout<<"     |          6. Activar/Desactivar usuario       |"<<endl;
	 cout<<"     |                    7. Salir                  |"<<endl;
	 cout<<"     |                                              |"<<endl;
	 cout<<"     |----------------------------------------------|"<<endl;
	 cout<<"\n";
        cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
				system("cls");
				menu2();
				break;
                
            case 2:
            	system("cls");
            	menu3();
				break;
              
            case 3:
                system("cls");
                menu4();
                break;
                
            case 4:
                system("cls");
                menu5();
                break;
                
            case 5:
                system("cls");
                menu6();
                break;
                
            case 6:
                system("cls");
                menu7();
                break;
                
                
            default:
                cout << "Opcion invalida" << endl;
                
                
        }
        
        exit(7);
        
    } while (opcion!=7);

}

//MENU OPCION 1 INGRESAR
void menu2(){
	
	
	int opcion = 0;
	
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |         1. Ingreso de datos          |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |              2. Regresar             |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
            	insertarNodo(primero,ultimo);
				system("cls");
			    menu2();
			break;
                
            case 2:
            	system("cls");
            	menu();
			break;
				
     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 2);
}


//MENU OPCION 2 MODIFICAR
void menu3(){
	
	int cedula;
	int opcion = 0;
	
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |     1. Modificar num. telefonico     |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |              2. Regresar             |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
            	modificarPersona();
				system("cls");
			    menu3();
			break;
                
            case 2:
            	system("cls");
            	menu();
			break;
				
     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 2);
}


//MENU OPCION 3 ELIMINAR
void menu4(){
	
	string cedula;
	int opcion = 0;
	
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |         1. Eliminar usuario          |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |              2. Regresar             |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
    cout << "Ingrese la cedula que desea eliminar: ";
    cin >>cedula;
    eliminarPersona(nodo,cedula);
    system("pause");
            	
			    menu4();
			break;
                
            case 2:
            	system("cls");
            	menu();
			break;
				
     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 2);
}


//MENU OPCION 4 BUSCAR
void menu5(){
	
	int cedula;
	int opcion = 0;
	
do {
	 cout<<"     __^__                                           __^__ "<<endl;
     cout<<"    ( ___ )-----------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                           |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA                 |   | "<<endl;
     cout<<"     |   |                                           |   | "<<endl;
     cout<<"     |   |           1. Buscar usuario por cedula    |   | "<<endl;
     cout<<"     |   | 2. Buscar usuario por numero de telefono  |   | "<<endl;
     cout<<"     |   |              3. Regresar                  |   | "<<endl;
     cout<<"     |   |                                           |   | "<<endl;
     cout<<"     |___|                                           |___| "<<endl;
     cout<<"    (_____)-----------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
            	buscarPersonaCedula();
				system("cls");
			    menu5();
			break;
                
            case 2:
                buscarPersonaTel();
            	system("cls");
            	menu5();
			break;
				
            case 3:
            	system("cls");
            	menu();
			break;

     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 3);
}


//MENU OPCION 5 LISTA
void menu6(){
	
	int opcion = 0;
		/*Esta variable tipo char se crea para que unicamente elija la primera letra del nombre,
	 utilizada para colocar alfabeticamente a cada nombre en cada letra del abecedario*/
	char opcion1;
	
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |   1. Mostrar lista guia telefonica   |   | "<<endl;
     cout<<"     |   |   2. Mostrar lista alfabeticamente   |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |              3. Regresar             |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
				system("cls");
				//Se llama la lista nodo la cual almacena todos los datos
				Mostrar(nodo);
			break;
                
            case 2:
            	system("cls");
 				cout << "Ordenamiento Alfabetico \n";
				
        cout << "Ingrese una letra para imprimir los nombres que empiezan por esa letra: ";
        cin >> opcion1;
        
        //Este metodo se encarga de ordenar los nombres para luego colocarlos segun su letra del abecedario
        ordenarBurbuja(lista);

            cout << endl << "Nombres que inician por la letra '" << opcion1 << "':" << endl;
            //Finalmente este metodo finaliza el proceso de ordenamiento, eligiendo unicamente su primera letrs gracias al char
            imprimirPorLetra(opcion1);
				system("pause");
				break;
 
			case 3:
            	system("cls");
            	menu();
			break;
				
     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 3);
}

//MENU OPCION 6 ACTIVO/INACTIVO 
void menu7(){
	
	int cedula;
	int opcion = 0;
	
do {
	 cout<<"     __^__                                      __^__ "<<endl;
     cout<<"    ( ___ )------------------------------------( ___ )"<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |           GUIA TELEFONICA            |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |   |         1. Activar usuario           |   | "<<endl;
     cout<<"     |   |        2. Inactivar usuarios         |   | "<<endl;
     cout<<"     |   |         3. Mostrar Lista             |   | "<<endl;
     cout<<"     |   |           4. Regresar                |   | "<<endl;
     cout<<"     |   |                                      |   | "<<endl;
     cout<<"     |___|                                      |___| "<<endl;
     cout<<"    (_____)------------------------------------(_____)"<<endl;
     cout<<"\n";
     
     cout<<"Ingrese una opcion: ";
        cin>> opcion;

        switch(opcion) {
            case 1:
            	insertarActivo(primero,ultimo);
				system("cls");
			    menu7();
			break;
                
            case 2:
     			insertarInactivo(primeroCir,ultimoCir);
				system("cls");
			    menu7();
			break;
			
			//LISTA DE BAJAS
			case 3:
				ordernarlista(primeroCir);
				
            	desplegarCircular(primeroCir);
            	
            	system("cls");
			    menu7();
			break;
			
			case 4:
				
				system("cls");
            	menu();
				break;
				
     		default:
     			
	        	cout << "Opcion invalida" << endl;
	        	cout<<"\n";
	        	system("pause");
	        	system("cls");
	   	}
    } while (opcion != 3);
}


//METODOS

//Insertar Persona
void insertarNodo(Nodo *&primero, Nodo *&ultimo) //recibe punteros ultimo y primero
{
    Nodo *nuevo = new Nodo(); //crea nuevo nodo

    string nombre;
    string apellido1;
    string apellido2;
    string telCel;
    string telCasa;
    string cedula;

    //se guardan inputs de usuario en las variables locales
    cout << "Ingrese el nombre: ";
    getline(cin>> ws,nombre);
    
    cout << "\nIngrese el primer apellido: ";
    cin >> apellido1;
    cout << "\nIngrese el segundo apellido: ";
    cin >> apellido2;
    cout << "\nIngrese el telefono celular: ";
    cin >> telCel;
    cout << "\nIngrese el telefono de habitacion: ";
    cin >> telCasa;
    cout << "\nIngrese la cedula de la persona: ";
    cin >> cedula;

    //se asignan valores de variables locales a variables del nodo nuevo creado
    nuevo->nombre = nombre;
    nuevo->apellido1 = apellido1;
    nuevo->apellido2 = apellido2;
    nuevo->telCel = telCel;
    nuevo->telCasa = telCasa;
    nuevo->cedula = cedula;

	//Se crean los auxiliares que realizaran el intercambio de posicion para ordenar la lista
	Nodo *aux1 = nodo;
	Nodo *aux2;
	
	//Se crea un bucle para el ordenamiento
	while((aux1 != NULL) && (aux1->nombre < nombre)){
		aux2 = aux1;
		aux1 = aux1->siguiente;
	}
	//vacio, inicio y final de lista queda en el nuevo nodo, punteros apuntan a nulo  
	if(nodo == aux1){
		nodo = nuevo;
		primero=nuevo;
		primero->siguiente=NULL;
		primero->atras=NULL;
		ultimo=primero;

		//se inserta nuevo nodo y se hace el enlace entre el nodo insertado anteriormente y el nodo que se acaba de insertar 
	}else{
		aux2 -> siguiente = nuevo;
		nuevo->siguiente = NULL;
		nuevo->atras=ultimo;
		ultimo=nuevo;
	}
		//Finalmente se alista el aux1 para que este listo para el siguiente nodo entrante
	nuevo -> siguiente = aux1;
	cout<<"\n El usuario  ("<<nombre<< ") se agrega correctamente! \n";

	
	system("pause");
}

//Modificar Persona
void modificarPersona()
{
    Nodo *actual = new Nodo();
    actual = primero;
    bool encontrado = false;
    string buscado;
    
    if (primero != NULL)//si hay algo en la lista
    {
        cout << " Ingrese la cedula de la persona a modificar: ";
        cin >> buscado;

        while (actual != NULL && encontrado != true)//recorra la lista
        {

            if (actual->cedula == buscado)//si hay match entre cedula buscada y cedula en la lista, se modifica numero de telefono
            {
                cout << "\n Persona con la cedula " << buscado << " encontrado:\n";
                cout<<"---------------------------------------------------------------\n";
                cout<<"Nombre:"<<actual->nombre<<"\n";
                cout<<" "<<actual->apellido1<<" ";
                cout<<actual->apellido2<<"\n";
                cout<<"---------------------------------------------------------------\n";
                
                cout << "Por favor,ingrese el numero de telefono celular nuevo:\n";
                cin >> actual->telCel;
                cout << "Por favor,Ingrese el numero de telefono de habitacion nuevo:\n";
                cin >> actual->telCasa;
                
                cout << "\n Persona con la cedula (" << buscado << ") fue modificada con exito!\n\n";
                encontrado = true;
                system("pause");
            }

            actual = actual->siguiente;
        }
        if (!encontrado)
        {
            cout << "\n Persona no encontrada\n\n";
            system("pause");
        }
    }
    else
    {
        cout << "\n La Lista se Encuentra Vacia\n\n";
        system("pause");
    }
}

//Eliminar persona
void eliminarPersona(Nodo *&nodo, string cedula){
    Nodo *aux_borrar;
    Nodo *anterior = NULL;
    
    // Si la lista est  vac a, no hay nada que eliminar
    if(nodo == NULL){
        cout << "La lista esta vacia" << endl;
        return;
    }
    
    aux_borrar = nodo;
    
    // Se recorre la lista buscando el nombre a eliminar
    while(aux_borrar != NULL && aux_borrar->cedula != cedula){
        anterior = aux_borrar;
        aux_borrar = aux_borrar->siguiente;
    }
    
    // Si no se encuentra el nombre, se informa al usuario y se sale de la funci n
    if(aux_borrar == NULL){
        cout << "El elemento no ha sido encontrado en la lista" << endl;
        return;
    }
    
    // Si el nombre est  al inicio de la lista
    if(anterior == NULL){
        nodo = nodo->siguiente;
        nodo->atras=NULL;
        cout << "El elemento " << cedula << " ha sido eliminado de la lista" << endl;
    }
    // Si el nombre est  en otro lugar de la lista
    else{
        anterior->siguiente = aux_borrar->siguiente;
        if(aux_borrar->siguiente!=NULL){
            aux_borrar->siguiente->atras=ultimo;
        }
        cout << "El elemento " << cedula << " ha sido eliminado de la lista" << endl;
    }
    
    // Liberar el espacio de memoria del nodo eliminado
    delete(aux_borrar);
}



//Buscar persona por cedula
void buscarPersonaCedula()
{
    Nodo *actual = primero;
    bool encontrado = false;
    string buscado;
    cout << "\nIngrese la cedula de la persona a buscar: \n";
    cin >> buscado;
    if (actual != NULL)
    {
        while (actual != NULL)
        {

            if (actual->cedula == buscado)//compara dato buscado con la cedula
            {
                cout << "\n La persona con la cedula (" << buscado << " ) fue encontrada:\n ";//imprime dato buscado
                cout<<"---------------------------------------------------------------\n";
                cout<<"Nombre:"<<actual->nombre<< "\n";
                cout<<"Apellidos:"<<actual->apellido1<<" ";
                cout<<actual->apellido2<<"\n";
                cout<<"Tel.Cel:"<<actual->telCel<<"\n";
                cout<<"Tel.Casa:"<<actual->telCasa<<"\n";
                cout<<"Cedula:"<<actual->cedula<<"\n";
                cout<<"--------------------------------------------------------------\n";
                encontrado = true;
                system("pause");
            }
            actual = actual->siguiente;
        }

        if (!encontrado)
        {
            cout << "\n Persona no encontrada\n\n";
            system("pause");
        }
    }
    else
    {
        cout << "\n La lista esta vacia\n";
        system("pause");
}
}

//Buscar persona por telefono cedular
void buscarPersonaTel()
{
    Nodo *actual = primero;
    bool encontrado = false;
    string buscado;
    cout << "\nIngrese el telefono celular de la persona a buscar: \n";
    cin >> buscado;
    if (actual != NULL)
    {
        while (actual != NULL)
        {

            if (actual->telCel == buscado)//compara dato buscado con telefono celular
            {
                cout << "\n La persona con el numero de telefono ( " << buscado << ") fue encontrada:\n"; //imprime dato buscado
                cout<<"---------------------------------------------------------------\n";
                cout<<"Nombre:"<<actual->nombre<< "\n";
                cout<<"Apellidos:"<<actual->apellido1<<" ";
                cout<<actual->apellido2<<"\n";
                cout<<"Tel.Cel:"<<actual->telCel<<"\n";
                cout<<"Tel.Casa:"<<actual->telCasa<<"\n";
                cout<<"Cedula:"<<actual->cedula<<"\n";
                cout<<"---------------------------------------------------------------\n";
                
                encontrado = true;
                system("pause");
            }
            actual = actual->siguiente;
        }

        if (!encontrado)
        {
            cout << "\n Persona no encontrada\n\n";
            system("pause");
        }
    }
    else
    {
        cout << "\n La lista esta vacia\n";
        system("pause");
}
}

//Poner modo Inactivo al Usuario
void insertarInactivo(Circular *&primeroCir, Circular *&ultimoCir){
	
	Nodo *anterior = NULL;
    Nodo *posterior = NULL;
    
    Nodo *actual = new Nodo();
    actual = primero;
    bool encontrado = false;
    string buscado;
    
    if (primero != NULL)//si hay algo en la lista
    {
        cout << " Ingrese la cedula del usuario que desea pasar Inactivo: ";
        cin >> buscado;

        while (actual != NULL && encontrado != true)//recorra la lista
        {

            if (actual->cedula == buscado)//busca match entre cedula buscada y cedula en la lista
            {
            	
            	//Se crea el Nodo Circular de la lista Circular, junto que los datos de Actual pasa a  Nuevo Circular
                Circular* nuevoCir = new Circular();

                nuevoCir -> nombreCir = actual -> nombre;
                nuevoCir -> apellido1Cir = actual -> apellido1;
            	nuevoCir -> apellido2Cir = actual -> apellido2;
            	nuevoCir -> telCelCir = actual -> telCel;
            	nuevoCir -> telCasaCir = actual -> telCasa;
            	nuevoCir -> cedulaCir = actual -> cedula;
            
            	if(primeroCir==NULL){
            		primeroCir = nuevoCir;
            		primeroCir -> siguienteCir = primeroCir;
            		ultimoCir = primeroCir;
				}else{
					ultimoCir -> siguienteCir = nuevoCir;
					nuevoCir -> siguienteCir = primeroCir;
					ultimoCir = nuevoCir;
				}
				
				cout << "Usuario Inactivo \n\n";
				system("pause");
				
				
				//Conectar Nodo para eliminar al Usuario de la lista principal por que paso a  la Circular
				posterior = actual->siguiente;

    			anterior != NULL
        		? anterior->siguiente = posterior
        		: primero = posterior;

    			if (posterior != NULL)
    			{
        		posterior->atras = anterior;
    			}

    			// Borrar el nodo
   				delete actual;
                encontrado = true;
            }

            actual = actual->siguiente;
        }
        if (!encontrado)
        {
            cout << "\n Persona no encontrada\n\n";
            system("pause");
        }
    }
    else
    {
        cout << "\n La Lista se Encuentra Vacia\n\n";
        system("pause");
    }
}

// Poner modo Activo al Usuario
void insertarActivo(Nodo *&primero, Nodo *&ultimo){
	
	// Se definen los punteros anterior y posterior
	// que se utilizarán para insertar en la lista circular
    Circular *anterior = NULL;
    Circular *posterior = NULL;
    
    // Se inicializa el puntero actual con el primer elemento de la lista circular
    Circular *actual = new Circular();
    actual = primeroCir;
    
    // Se define la variable booleana encontrado para
    // verificar si se encontró el usuario a activar
    bool encontrado = false;
    string buscado;
    
    // Se definen las variables para guardar los datos del usuario
    string nombre;
    string apellido1;
    string apellido2;
    string telCel;
    string telCasa;
    string cedula;
    
    // Si hay algo en la lista circular
    if (primeroCir != NULL)
    {
        // Se solicita al usuario que ingrese la cédula del usuario a activar
        cout << " Ingrese la cedula del usuario que desea pasar Activo: ";
        cin >> buscado;

        // Se recorre la lista circular en busca del usuario a activar
        while (actual != NULL && encontrado != true)
        {

            // Si se encuentra el usuario en la lista circular
            if (actual->cedulaCir == buscado)
            {
            	// Se crea el nodo de la lista doblemente enlazada con los datos del usuario
                Nodo* nuevo = new Nodo();
                nuevo -> nombre = actual -> nombreCir;
                nuevo -> apellido1 = actual -> apellido1Cir;
            	nuevo -> apellido2 = actual -> apellido2Cir;
            	nuevo -> telCel = actual -> telCelCir;
            	nuevo -> telCasa = actual -> telCasaCir;
            	nuevo -> cedula = actual -> cedulaCir;
            	
            	// Se crean los auxiliares que realizarán el intercambio de posición para ordenar la lista
			Nodo *aux1 = nodo;
			Nodo *aux2;
	
			// Se crea un bucle para el ordenamiento
			while((aux1 != NULL) && (aux1-> nombre < nombre)){
				aux2 = aux1;
				aux1 = aux1->siguiente;
			}
			
			// Si la lista está vacía, el nuevo nodo es el inicio y el final de la lista
			if(nodo == aux1){
				nodo = nuevo;
				primero=nuevo;
				primero->siguiente=NULL;
				primero->atras=NULL;
				ultimo=primero;
			} else {
				// Si la lista no está vacía, se inserta el nuevo nodo y se hace el enlace entre el nodo insertado anteriormente y el nodo que se acaba de insertar 
				aux2 -> siguiente = nuevo;
				nuevo->siguiente = NULL;
				nuevo->atras=ultimo;
				ultimo=nuevo;
			}
			
			// Se actualiza el siguiente del nuevo nodo
			nuevo -> siguiente = aux1;
			delete actual;
			// Se muestra el mensaje de usuario activado y se pausa el programa
			cout << "Usuario Activo \n\n";
			system("pause");
			
			// Se marca que se encontró el usuario
			encontrado = true;
        }

        // Se mueve al siguiente


            	actual = actual->siguienteCir;
        }
    
        if (!encontrado)
        {
            cout << "\n Persona no encontrada\n\n";
            system("pause");
        }
    }
    else
    {
        cout << "\n La Lista se Encuentra Vacia\n\n";
        system("pause");
    }
}

//Para mostrar la lista ya ordena Alfabeticamente
void desplegarCircular(Circular *&primeroCir){
	
	//Se verifica si la lista esta vacia
	if (primeroCir == NULL) {
		
        return;
        
    }else{
    	
    	Circular* actual = primeroCir;
    do{
    		cout << "Nombre: " << actual->nombreCir << "\n ";
		
        actual = actual->siguienteCir;
        
    }while (actual != primeroCir);
    
    system("pause");
    }
}

//Void para  poder ordenar  la  lista  de forma  alfabetica
void ordernarlista(Circular *&primeroCir){
	
	 if (primeroCir == NULL) {
	 	cout << "Lista vacia \n";
	 	system("pause");
        return;
    }
    //Se usa un vector,  usando  el Nodo, para poder manejarlos facilmente
    
    vector<Circular*> nodos;
    Circular* actual = primeroCir;
    
    do{
    	//Usamos push back, para que este vaya aÃ±andiendo los  nodos al vector
        nodos.push_back(actual);
        actual = actual->siguienteCir;
        
    }while (actual != primeroCir);
    
    //El sort nos va servir, para ordenar  los  Nodos de Menor a Mayor, este caso de  orden Alfabetico
    sort(nodos.begin(), nodos.end(), [](Circular* a, Circular* b) {
        return a->nombreCir < b->nombreCir;
        
    });
    
    //El for  finalmente ordena los Nodos dependiendo del nombre
    for (size_t i = 0; i < nodos.size(); i++) {
    	
        Circular* nodo = nodos[i];
        nodo->siguienteCir = nodos[(i + 1) % nodos.size()];
        
    }
    primeroCir = nodos.front();
}

//Metodos del punto 5

//Se muestran los datos ordenados de la lista en forma descendente
void Mostrar(Nodo *nodo){
	system("cls");
	
	//Se llama la lista con los datos ingresados
	Nodo *actual = new Nodo();
	actual = nodo;
	
	cout<<"--------------------------LISTA TELEFONICA-------------------------------------\n";
	cout<<"\n";
	//Se crea un bucle para que imprima repetidamente todos los nombres existentes de la lista,en otras palabras para que recorra la lista
	while(actual !=NULL ){
		//Se llama la variable que guarda los nombres en el nodo
                cout<<"---------------------------------------------------------------\n";
                cout<<"Nombre:"<<actual->nombre<< "\n";
                cout<<"Apellidos:"<<actual->apellido1<<" ";
                cout<<actual->apellido2<<"\n";
                cout<<"Tel.Cel:"<<actual->telCel<<"\n";
                cout<<"Tel.Casa:"<<actual->telCasa<<"\n";
                cout<<"Cedula:"<<actual->cedula<<"\n";
                cout<<"--------------------------------------------------------------\n";
                cout<<"\n";
                    
		actual = actual->siguiente;
	}

	system("pause");
	
}


//Metodo para  poder ordenar  la  lista  de forma  alfabetica por el metodo burbuja
 void ordenarBurbuja(Nodo*lista) {		
            Nodo* actual;
            Nodo* siguiente;
            string temp;

            if (primero == NULL) {
                return;
            }

            bool aux1 = true;
            while (aux1) {
                aux1 = false;
                actual = primero;

				//Implementa el algoritmo de ordenacion de burbuja
                while (actual->siguiente != NULL) {
                    siguiente = actual->siguiente;
                    //El metodo compara cada nombre para determinar donde se debe insertar cada uno de ellos segun su letra del abc
                    if (actual->nombre.compare(siguiente->nombre) > 0) {
                        temp = actual->nombre;
                        actual->nombre = siguiente->nombre;
                        siguiente->nombre = temp;
                        aux1 = true;
                    }
                    actual = actual->siguiente;
                }
            }
        }
        
//Metodo para  poder mostrar  la  lista  de forma  alfabetica unicamente por nombre
void imprimirPorLetra(char letra) {
        	
        	//Se instancia el nodo
            Nodo* actual = primero;
		//Se crea un bucle para que imprima repetidamente todos los nombres existentes de la lista,en otras palabras para que recorra la lista
            while (actual != NULL) {
            	//El [0] se encarga de elegir unicamente la primera letra del nombre, esto gracias al parametro char que colocamos en el metodo
                if (actual->nombre[0] == letra) {
                	//Se imprimen los datos

                cout<<"---------------------------------------------------------------\n";
                cout<<"Nombre:"<<actual->nombre<< "\n";
                cout<<"Apellidos:"<<actual->apellido1<<" ";
                cout<<actual->apellido2<<"\n";
                cout<<"Tel.Cel:"<<actual->telCel<<"\n";
                cout<<"Tel.Casa:"<<actual->telCasa<<"\n";
                cout<<"Cedula:"<<actual->cedula<<"\n";
                cout<<"--------------------------------------------------------------\n";
                cout<<"\n";
					
                }
                actual = actual->siguiente;
            }
        }






