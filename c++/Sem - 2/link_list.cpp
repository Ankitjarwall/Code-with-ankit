#include<iostream>
using namespace std;

struct bca
{
    int data;
    struct bca *next;
};

int main()
{
    bca mca;
    struct bca* head;
    struct bca *first;
    struct bca *second;

    head = (struct bca *)malloc(sizeof(struct bca));
    first = (struct bca *)malloc(sizeof(struct bca));
    second = (struct bca *)malloc(sizeof(struct bca));

    head->data = 1;
    head->next = first;

    first->data = 2;
    first->next = second;

    second->data = 3;
    second->next = NULL;

    while (head!=NULL)
    {
        cout << head->data;
        head = head->next;
    }
    

    return 0;
}