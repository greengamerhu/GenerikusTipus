package hu.petrik.generikustipus.verem;

import java.util.ArrayList;
import java.util.List;

public class Verem<T> {
    private List<T> stack;

    public Verem() {
        this.stack = new ArrayList<>();
    }
    public void push(T elem) {
        stack.add(elem);
    }
    public Boolean pop() {
        if (!stack.isEmpty()) {
            stack.remove(stack.size()-1);
            return true;
        }
        return false;
    }
    public T top() {
        return stack.get(stack.size() -1);
    }
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    public void empty() {
        stack.clear();
    }
}
