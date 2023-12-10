package myPackage;


import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class myStack  {
     private Deque<ElementWithCachedMax> elementWithCachedMax;

     public myStack(){
         this.elementWithCachedMax  = new LinkedList<ElementWithCachedMax>();
     }
     public boolean isEmpty(){
         return elementWithCachedMax.isEmpty();
     }

     public Integer max(){
         if (this.isEmpty())
             throw new IllegalStateException("max() : empty stack.");
         return elementWithCachedMax.peek().max;
     }

     public Integer pop(){
         if (this.isEmpty())
             throw new IllegalStateException("pop() : empty stack.");
         return elementWithCachedMax.removeFirst().element;
     }

     public Integer peek(){
         if (this.isEmpty())
             throw new IllegalStateException("peek() : empty stack.");
         return elementWithCachedMax.peek().element;
     }

     public void push(Integer x){
         elementWithCachedMax.addFirst(new ElementWithCachedMax(x, Math.max(x, isEmpty() ? x : max())));
     }

     public void removeAll(){
         if (!elementWithCachedMax.isEmpty()) {
             Iterator<ElementWithCachedMax> iter = elementWithCachedMax.descendingIterator();
             while (iter.hasNext()) {
                 iter.next();
                 elementWithCachedMax.pop();
             }
         }
     }

     public Iterator iterator(){
         return elementWithCachedMax.descendingIterator();
     }

}

