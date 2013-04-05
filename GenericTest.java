package guohao;
import java.util.*;
class GenericTest
{
  public static void main(String [] args)
  {
    HashMap<String,Integer> m = new HashMap<>();
	m.put("guohao",99);
	m.put("guoziyi",9999);
	System.out.println(m);
	int i = m.get("guohao");
	System.out.println(i);
	//m.put("guohao","guohao");
  }
}


class Person<T>
{
  public T info;
  
  public Person( T info)
  {
    this.info = info;
  }
  
  public void setInfo(T info)
  {
    this.info = info;
  }
  
  public T getInfo()
  {
    return info;
  }
  
  public static void main(String[] args)
  {
    Person<String> p = new Person<>("guohao");
	System.out.println(p.getInfo());
	
	Person<Integer> p1 = new Person<>(99);
	System.out.println(p1.getInfo());
	
  }
  
  
  
}













