/******************************************************************************
 *  Compilation:  javac RandomWord.java
 *  Execution:    java RandomWord
 *
 *  Reads a sequence of words from standard input and prints one of those words uniformly at random.
 *
 *  % java RandomWord
 *  > heads tails
 *
 *  On MacOS, you may need to press CTRL + D after hitting the Return key.
 *
 ******************************************************************************/

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {
  public static void main(String[] args) {
    // On MacOS terminals, you may need to append CTRL + D after supplying your input
    String value;
    String champion = "";
    double counter = 1.0;

    boolean chance;

    while (!StdIn.isEmpty()) {
      // Probability must be between 0.0 and 1.0
      chance = StdRandom.bernoulli(1 / counter);
      value = StdIn.readString();
      if (chance || champion.equals("")) {
        champion = value;
      }
      ++counter;
    }

    StdOut.println(champion);
  }
}
