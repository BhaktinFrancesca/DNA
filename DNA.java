//program that determines whether there is a protein in a strand of DNA

public class DNA {
  
 
  public static void main(String[] args) {
    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    int dnaLength = dna.length();

    int start = dna.indexOf("ATG");
    int end = dna.indexOf("TGA");

    if (start != -1 && end != -1 && dnaLength % 3 == 0) {
      System.out.println("It's a protein!");
      String protein = dna.substring(0, 4);
    } else {
      System.out.println("No protein");
    }
  }
 
}
