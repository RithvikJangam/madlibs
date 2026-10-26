public class madlib {
  public static String createMadlib(String a, String noun, String verb, String adj, int num) {
    String chosen = a.replace("$", "_____");
    chosen = chosen.replace("^", "_____");
    chosen = chosen.replace("@", "_____");
    chosen = chosen.replace("#", "_____");
    System.out.println("Randomly selected Madlib: " + chosen);
    String base = a;
    String withNoun = base.replace("$", noun);
    String withVerb = withNoun.replace("^", verb);
    String withAdj = withVerb.replace("@", adj);
    String completed = withAdj.replace("#", Integer.toString(num));

    return completed;
  }
}
