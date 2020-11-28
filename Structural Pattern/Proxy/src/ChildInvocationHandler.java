import java.lang.reflect.*;

public class ChildInvocationHandler implements InvocationHandler {
  Subject tv;

  public ChildInvocationHandler(Subject tv){
    this.tv = tv;
  }

  public Object invoke(Object proxy, Method method, Object[] args) throws     IllegalAccessException{
    try{
      if (method.getName().startsWith("get")) {
				return method.invoke(tv, args);
			} else if (method.getName().startsWith("setChannel")) {
				throw new IllegalAccessException();
      } else if (method.getName().startsWith("set")) {
				return method.invoke(tv, args);
			}
    }
    catch(InvocationTargetException e){
      e.printStackTrace();
    }
  return null;
  }
}