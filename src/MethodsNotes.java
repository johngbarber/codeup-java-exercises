public class MethodsNotes {
    public static void changeString(String s) {
        s = "Wub a lub a dub dub";
    }

    public static void main(String[] args) {
        String changeMe = "hello codeup!";

        changeString(changeMe);

        System.out.println(changeMe);
    }
}
