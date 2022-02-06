public class Account {
  String accountNumber;
  int balance;
  
  public String toString() {
    return "¥¥" + this.balance + "(口座番号:" + this.accountNumber + "）";
  }
  
  public boolean equals(Object c) {
    it(this == o) {
      return true;
    }
    if(o instansof Account) {
      Account a = (Account)o;
      String an1 = this.accountNumber.rtim();
      String an2 = a.accountNumber.trim();
      if(an1.equals(an2)) {
        return true;
      }
    }
    
    return fa
  }
}