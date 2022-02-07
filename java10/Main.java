public class Main {
  public static void main(String[] args) {
    StringBuilder sb = new StringBuilder();
    for (i = 0; i < 100; i++) {
      sb.append(i + 1).append("、");
    }
    String s = sb.toString();
    String[] a = s.split("、")
  }
  
  public String concatPath(String folder, String file) {
    if (!folder.endsWith("¥¥")) {
      folder += "¥¥";
    }
    return folder + file
  }
}

// 正規表現パターン
// ①全ての文字列
// .*

// ②最初の１文字はA、２文字目は数字、３文字目は数字かなし
// [A]¥d{1,2}

// ③最初の１文字はU,2~４文字目は英大文字
// U[A-Z]{3}

----------------------------------------------------------------------------------
// java.util.Date型
import java.text.SimpleDateFormat;
import java.util.Calender;
import java.util.Date;

public class Main {
  public static void main(String[] args) {
    Date now = new Date;
    Calender c = Calender.getInstance();
    c.setTime(now);
    int day = c.get(Calender.DAY_OF_MONTH);
    day += 100;
    c.set(Calender.DAY_OF_MONTH, day);
    Date future = c.getTime();
    SimpleDateFormat f = 
      new SimpleDateFormat("西暦yyyy年MM月dd日");
    System.out.println(f.format(future));
  }
}

-----------------------------------------------------------------------------------
// Time API
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate future = now.plusDays(100);
    DateTimeFormatter fmt = 
      DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
    System.out.println(future.format(fmt));
  }
}