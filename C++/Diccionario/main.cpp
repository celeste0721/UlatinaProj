#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

class Node {
public:
    string name;
    Node* next;
    Node* prev;
    Node(string name) {
        this->name = name;
        next = NULL;
        prev = NULL;
    }
};

class LinkedList {
public:
    Node* head;
    LinkedList() {
        head = NULL;
    }

    void insert(string name) {
        Node* newNode = new Node(name);
        if (head == NULL) {
            head = newNode;
        }
        else {
            Node* current = head;
            while (current->next != NULL) {
                current = current->next;
            }
            current->next = newNode;
            newNode->prev = current;
        }
    }

    void printByLetter(char letter) {
        Node* current = head;
        while (current != NULL) {
        	
            if (current->name[0] == letter) {
            	
                cout << current->name;
            }
            current = current->next;
        }
    }
};

int main() {
    LinkedList list;
    string name;
    char letter;
    int choice;
    do {
        cout << "1. Agregar nombre\n2. Imprimir nombres por letra\n3. Salir\nIngrese su elección: ";
        cin >> choice;
        switch (choice) {
        case 1:
            cout << "Ingrese el nombre: ";
            cin >> name;
            list.insert(name);
            break;
        case 2:
            cout << "Ingrese la letra: ";
            cin >> letter;
            list.printByLetter(tolower(letter));
            break;
        case 3:
            cout << "Saliendo..." << endl;
            break;
        default:
            cout << "Elección inválida, intente nuevamente." << endl;
        }
    } while (choice != 3);

    return 0;
}
    

