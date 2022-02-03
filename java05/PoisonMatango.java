public class PoisonMatango extends Matango {
  int poisonCount = 5;
  
  public PoisonMatango(char suffix) {
    super(suffix);
  }
  
  public void attack(Hero h) {
    
    super.attack(h);
    
    if(this.poison > 0) {
      System.out.println("さらに毒の胞子をばら撒いた！");
      int dmg = h.hp / 5;
      h.hp -= dmg;
      System.out.println(dmg + "ポイントのダメージ！");
      this.poisonCount--;
    }
    
  }
}