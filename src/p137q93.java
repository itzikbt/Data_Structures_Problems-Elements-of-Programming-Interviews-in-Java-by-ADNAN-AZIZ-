import myPackage.myStack;

import java.util.Deque;
import java.util.LinkedList;

public class p137q93 {
    public static void main(String[] args) {
      boolean t =  parenthesesWellFormed("{,},(,),[,]");
      System.out.println(t);
    }


    public static boolean parenthesesWellFormed(String str){
         Deque<Character> parenthesesStack = new LinkedList<>();

         for (int i = 0; i < str.length(); i++){
              String symbol = String.valueOf(str.charAt(i));
              if ("({[".contains(symbol))
                  parenthesesStack.addFirst(str.charAt(i));
              if (")}]".contains(symbol)){
                  if (parenthesesStack.isEmpty())
                      return false;
                  switch (symbol.charAt(0)){
                      case ')':
                          if (parenthesesStack.pop() != '(' )
                               return false;
                          break;
                      case '}':
                          if (parenthesesStack.pop() != '{' )
                              return false;
                          break;
                      case ']':
                          if (parenthesesStack.pop() != '[' )
                              return false;
                          break;

                  }
              }
         }
        return parenthesesStack.isEmpty();

    }


}
