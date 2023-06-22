//Design a java program to implement interfaces.

interface IntStack {
    void push(int item); // Store an item.

    int pop(); // Retrieve an item.
}

class DynStack implements IntStack {
    private int stck[];
    private int tos;

    // Allocate and initialize stack.
    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    // Push an item onto the stack.
    public void push(int item) { // If stack is full, allocate a larger stack.
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2];
            // Making a double size array.
            for (int i = 0; i < stck.length; i++)
                temp[i] = stck[i];
            stck = temp;
            stck[++tos] = item;
        } else
            stck[++tos] = item;
    }

    // Pop an item from the stack.
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else
            return stck[tos--];
    }
}

class Practical12 {
    public static void main(String args[]) {
        DynStack mystack1 = new DynStack(5);
        DynStack mystack2 = new DynStack(8);
        // These loops cause each stack to grow.
        for (int i = 0; i < 12; i++)
            mystack1.push(i);
        for (int i = 0; i < 20; i++)
            mystack2.push(i);
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 12; i++)
            System.out.println(mystack1.pop());
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 20; i++)
            System.out.println(mystack2.pop());
    }
}
