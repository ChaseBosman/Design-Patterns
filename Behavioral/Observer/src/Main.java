class Main {
  public static void main(String[] args) {
    Baby baby1 = new Baby("Tom");
    Baby baby2 = new Baby("Jill");
    SimpleMonitor m1 = new SimpleMonitor(baby1);
    AdvancedMonitor m2 = new AdvancedMonitor(baby1, baby2);
    
    baby1.set_cry_level(3);
    
  }
}



