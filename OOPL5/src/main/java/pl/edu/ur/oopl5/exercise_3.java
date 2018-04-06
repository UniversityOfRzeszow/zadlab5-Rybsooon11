
package pl.edu.ur.oopl5;


public class exercise_3 {
    private int index;
    private int size;
    int tab[] = new int[size];
    
    private void push(int x)
    {
        if(index >= size)
            System.out.println("Stack is full");
            else{
                    index = 0;
                    tab[index] = x;
                    index++;
                }                                   
    }
    
    private void pop() {
        if (index == 0)
            System.out.println("Stack is empty");
        else 
            System.out.println("Element removed " + tab[index]);
        index--;
    }
 
    public exercise_3(int size){
        this.size = size;
    }
    
}
