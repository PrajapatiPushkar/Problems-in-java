package src.collectionproblem;

//Write a method concatenate strings that takes variables
// arguments of string type and concatenates them into a single string.

public class VarArgs {

    public static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(concatenate("Pushkar"));
        System.out.println(concatenate("Pushkar", "Prajapati"));
        System.out.println(concatenate("Pushkar", "Prajpati", "PKP"));
    }
}
