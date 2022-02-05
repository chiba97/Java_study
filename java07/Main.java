public class Main {
  Y[] y = new Y[2];
  y[0] = new A();
  y[1] = new B();
  
  for (Y ys : y) {
    ys.b();
  }
}