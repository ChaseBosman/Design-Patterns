import java.lang.reflect.*;
import java.util.*;

class Main {
  Subject main_tv;

  public static void main(String[] args) {
    Main driver = new Main();
    driver.drive();
  }

  Main(){
    createTV();
  }

  public void drive(){
    Subject AdultProxy = getAdultProxy(main_tv);
    System.out.println("Adult is setting the channel to 30 and volume to 40!");
    AdultProxy.setChannel(30);
    AdultProxy.setVolume(40);
    System.out.println("Adult set the channel to " + AdultProxy.getChannel());
    System.out.println("Adult set the volume to " + AdultProxy.getVolume());

    Subject ChildProxy = getChildProxy(main_tv);
    System.out.println("Child is setting the channel to 60 and volume to 100!");
    ChildProxy.setVolume(100);
    System.out.println("Child set the volume to " + ChildProxy.getVolume());
    try {
			ChildProxy.setChannel(60);
		} catch (Exception e) {
			System.out.println("Can't set the channel from the child remote!");
		}
  }

  public void createTV(){
    Subject tv1 = new Television();
    tv1.setChannel(50);
    tv1.setVolume(50);
    main_tv = tv1;
  }

  Subject getAdultProxy(Subject tv) {
 		
        return (Subject) Proxy.newProxyInstance( 
            	tv.getClass().getClassLoader(),
            	tv.getClass().getInterfaces(),
                new AdultInvocationHandler(tv));
	}

	Subject getChildProxy(Subject tv) {
		
        return (Subject) Proxy.newProxyInstance(
            	tv.getClass().getClassLoader(),
            	tv.getClass().getInterfaces(),
                new ChildInvocationHandler(tv));
	}

}