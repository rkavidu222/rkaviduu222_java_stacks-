import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {
        Stack<String> stac=new Stack<>();

        stac.push("Amal");
        stac.push("Kamal");
        stac.push("Nimal");
        stac.push("Sunimal");

        System.out.println("Names:- "+stac);
        stac.pop();
        System.out.println("Names after pop:- "+stac);
        System.out.println("Peak :- "+stac.peek());
        System.out.println("Position of Kamal is:- "+stac.search("Kamal"));

        while (!stac.isEmpty()){
            System.out.println(stac.pop()); //remove all elements
        }

        System.out.println("stack elements are:- "+stac);
    }
}
