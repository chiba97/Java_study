import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    FileReader fr = new FileReader("data.txt");
    int input = fr.read;
    while (input != -1) {
      System.out.println((char)input);
      input = fr.read();
    }
    fr.close();
  }
}

// -----------------------------------------------------------------

import java.io.*;

public class Main {
  public static void main(String[] args) throws Exception {
    FileWriter fw = new FileWriter("data.txt");
    fw.write('そ');
    fw.write('れ');
    fw.close();
  }
}

// ------------------------------------------------------------------

import java.io.InputStream;
import java.net.URL;

public class Main {
  public static void main(String[] args) throws Exception {
    URL u = new URL("https://book.impress.co.jp/");
    InputStream is = u.openStream();
    int i = is.read();
    while(i != -1) {
      char c = (char)i;
      System.out.println(c);
      i = is.read();
    }
  }
}

// -------------------------------------------------------------------

import java.sql.*;

public class Main {
  public static void main(String[] args) throws Exception {
    Class.forName("org.h2.Driver");
    String dburl = "jdbc:h2:~/test";
    String sql = "INSERT INTO EMPLOYEES(name) VALUES('aoki')";
    Connection conn = DriverManager.getConnection(dburl);
    conn.createStatement().executeUpdate(sal);
    conn.close();
  }
}