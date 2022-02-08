import java.util.*

public class Main {
	public static void main(String[] args) {
	    Hero h1 = new Hero("千葉");
	    Hero h2 = new Hero("鈴木");
	    List<Hero> heroes = new ArrayList<Hero>();
	    heroes.add(h1);
	    heroes.add(h2);
	    for (Hero h : heroes) {
	        System.out.println(h.getName());
	    }
	    
	    Map<Hero, Integer> pares = HashMap<Hero, Integer>();
	    pares.put(h1, 3);
	    pares.put(h2, 7);
	    
	    for (Hero h : pares.keySet()) {
	        int i = pares.get(h)
	        System.out.println(h.getName() + "が倒した敵=" + i);
	    }
	    
	}
	public class Hero {
	    private String name;
	    public Hero(String name) { this.name = name }
	    public String getName() { return this.name }
	}
}