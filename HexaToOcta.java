public class HexaToOcta {
    public static void main(String[] args) {
        String hexadecimal = "f";
        int decimal = Integer.parseInt(hexadecimal, 16);
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
    }
}
