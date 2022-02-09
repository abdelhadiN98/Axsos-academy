class Stack:
    def __init__(self):
        self.mainStack = []
        self.auxStack = []

    def push(self, x):
        self.mainStack.append(x)
        if (len(self.mainStack) == 1):
            self.auxStack.append(x)
            return
        if (x < self.auxStack[-1]):
            self.auxStack.append(x)
        else:
            self.auxStack.append(self.auxStack[-1])

    def min(self):
        return self.auxStack[-1]

    def pop(self):
        self.mainStack.pop()
        self.auxStack.pop()


MyStack = Stack()
MyStack.push(4)
MyStack.push(7)
MyStack.push(3)
MyStack.push(10)
MyStack.push(12)
print(MyStack.min())
