package arrayStackStudy;

import arrayStudy.MyArray;

public class MyArrayStack {
    MyArray arrayStack; //멤버변수는 기본값으로 초기화 된다. 0, null, false
    int top;

    public MyArrayStack() {
        top = 0;
        arrayStack = new MyArray();
    }

    public MyArrayStack(int size) {
        top = 0;
        arrayStack = new MyArray(size);
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("stack is full");
            return ;
        }
        arrayStack.addElement(data);
        top++;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return (arrayStack.removeElement(--top));
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty");
            return MyArray.ERROR_NUM;
        }
        return (arrayStack.removeElement(--top));
    }

    public void printAll() {
        arrayStack.printAll();
    }

    public boolean isFull() {
        if (top == arrayStack.ARRAY_SIZE) {
            return (true);
        } else {
            return (false);
        }
    }

    public boolean isEmpty() {
        if (top == 0) {
            System.out.println("stack is empty");
            return (true);
        } else {
            return (false);
        }
    }
}
