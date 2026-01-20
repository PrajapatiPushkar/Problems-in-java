package src.tostringandmath;

//concatenate and convert

public class Concatenate {
    public static void main(String[] args) {
        String firstName = "Pushkar";
        String lastName = "Prajapati";
        String fullName = firstName.concat(" ").concat(lastName) ;
        System.out.println(fullName.toUpperCase());
    }
}
