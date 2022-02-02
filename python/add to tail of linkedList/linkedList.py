class Node:
    def __init__(self, value):
        self.value = value
        self.next = None


class LinkedList:
    def __init__(self):
        self.head = None

    def add_to_tail(self, value):
        newNode = Node(value)
        if(self.head == None):
            self.head = newNode
            return
        else:
            current = self.head
            while(current.next != None):
                current = current.next
            current.next = newNode

    def display_linked_list(self):
        current = self.head
        while(current.next != None):
            print(current.value)
            current = current.next
        print(current.value)


MyList = LinkedList()


MyList.add_to_tail(3)
MyList.add_to_tail(6)
MyList.add_to_tail(9)
MyList.add_to_tail(20)
MyList.add_to_tail(40)
MyList.display_linked_list()
