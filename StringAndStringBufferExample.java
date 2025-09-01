public class StringAndStringBufferExample {
    public static void main(String[] args) {
        // String example
        String str1 = "Hello";
        String str2 = "World";

        // Concatenating strings
        String concatenatedString = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenatedString);

        // String is immutable, so every modification creates a new string
        str1 = str1.concat(" Java");
        System.out.println("Modified str1: " + str1);

        // StringBuffer example
        StringBuffer buffer1 = new StringBuffer("Hello");
        StringBuffer buffer2 = new StringBuffer("World");

        // Appending StringBuffer objects
        buffer1.append(" ").append(buffer2);
        System.out.println("Appended StringBuffer: " + buffer1);

        // StringBuffer is mutable, so modifications happen in-place
        buffer1.insert(6, " Java");
        System.out.println("Modified buffer1: " + buffer1);
    }  
}
