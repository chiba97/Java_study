public class Main {
  public static void main(String[] args) {
    try {
      String s = null;
      System.out.println(s.length());
    } catch (NullPointException e) {
      System.out.println("NullPointException例外をcatchしました");
      System.out.println("--スタックトレース（ここから）--")
      e.stackTrace();
      System.out.primtln("--スタックトレース（ここまで）--")
    }
  }
}

// ------------------------------------------------------------------------
// 仮：別ファイル

public class Main {
  public static void main(String[] args) {
    try {
      int i = Integer.parseInt("三");
    } catch (NumberFormatException e) {
      System.out.println("NumberFormatException例外をcatchしました");
    }
  }
}

// -------------------------------------------------------------------------
// 仮：別ファイル

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    System.out.println("プログラムが起動しました");
    throw new IOException();
  }
}