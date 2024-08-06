public class Main {
    public static void main(String[] args) {
        String name = "Rahul";
        // hashCode() is a simple string-hashing function which returns an int
        int code = name.hashCode();
        System.out.println(code);

        // hashCode does not work on primitives and only on wrapper-Classes and
        // derivitives
        Integer a = 1999999999;
        // For numbers, hashing often leads to the same number (until an upperlimit)
        System.out.println(a.hashCode());
    }
}
