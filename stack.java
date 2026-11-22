public class stack {
    int stack[] = new int[5];
    int top = -1;

    void push(int value){
        if(top == 4){
            System.out.println("Stack overflow");
        }
        else
        {
            stack[++top] = value;
            System.out.println(value + " inserted");

        }
    }
    void pop(){
        if(top == -1){
            System.out.println("Stack underflow");
        }
        else
        {
            System.out.println("Deleted element : " +stack[top--]);
        }
    }
    void peek(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else
        {
            System.out.println("Top Element :" +stack[top]);
        }
    }
    void display(){
        if(top == -1){
            System.out.println("Stack is empty");
        }
        else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }
    }
    public static void main(String[] args){
        stack s = new stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        s.display();
        s.peek();
        s.pop();
        s.display();
        s.pop();
        s.display();
    }
}
