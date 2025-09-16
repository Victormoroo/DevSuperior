public class funcoes_String {
  public static void main(String[] args) {

    String original = "abcde FGHIJ ABC abc DEFG    ";

    String s01 = original.toLowerCase();
    String s02 = original.toUpperCase();
    String s03 = original.trim();
    String s04 = original.substring(3);
    String s05 = original.substring(2, 9);
    String s06 = original.replace('a', 'x');
    String s07 = original.replace("abc", "xy");
    int i = original.indexOf("bc"); // primeira ocorrenia do "bc"
    int j = original.lastIndexOf("bc"); // ultima ocorrencia do "bc"

    System.out.println("-----------------------------------------------");
    System.out.println("Original: -" + original + "-");
    System.out.println("toLowerCase: -" + s01 + "-");
    System.out.println("toUpperCase: -" + s02 + "-");
    System.out.println("trim: -" + s03 + "-");
    System.out.println("substring(3): -" + s04 + "-");
    System.out.println("substring(2, 9): -" + s05 + "-");
    System.out.println("replace('a', 'x'): -" + s06 + "-");
    System.out.println("replace('abc', 'xy'): -" + s07 + "-");
    System.out.println("indexOf: " + i);
    System.out.println("lastIndexOf: " + j);
    System.out.println("-----------------------------------------------");

    String s = "potato apple lemon orange";

    String[] vect = s.split(" ");
    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
    System.out.println(vect[3]);
  }
}
