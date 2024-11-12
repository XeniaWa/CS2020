import java.util.*;

public class practicals {
    public static void main (String[] args) {
        String sentence = "Reversing words";
    Stack<String> reverseStack = new Stack<String>();
    Scanner scan = new Scanner(sentence);

    while (scan.hasNext()) {
        reverseStack.push(scan.next());
    }

    String result = "";
    while (!reverseStack.empty()) {
        result = result + " " + reverseStack.pop();
    }

    System.out.println(result);
        
    }
}
