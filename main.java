public class main {
  public static void main(String[] baez) {
    System.out.println("Welcome to our Madlibs program!");
    System.out.println("This was made by: Advay Bansal, \nBradley Zhong (Team lead), \nEvan Spirin, \nRithvik Jangam, \nGursimran Sachdeva, \nSankarshana Sudeendra");  
    System.out.println("I hope you enjoy!");
    String usedNoun = noun.getNoun();
    String usedVerb = verb.getVerb();
    String usedAdjective = adjective.getAdjective();
    int usedNumber = (new numbers()).check();
    System.out.print(madlib.createMadlib(picker.choice(), usedNoun, usedVerb, usedAdjective, usedNumber));
  }
}
