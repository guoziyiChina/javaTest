package guohao;
import java.util.*;
class MapTest
{

  public static void main(String[] args){
  HashMap m1 = new HashMap();
  HashMap m2 = new HashMap();
  
  m1.put("a",new Integer(1));
  m1.put("b",new Integer(2));
  m1.put(1,new String("haha"));
  p(m1);
  m2.put("1",new String("guohao"));
  m2.put("2",new String("guoziyi"));
  p(m2);
  
  p(((Integer)m1.get("a")).intValue());
  
  HashMap m3 = new HashMap(m1);
  m3.putAll(m2);
  p(m3);
  
  
    }
	
	public static void p(Object o)
	{
	  System.out.println(o);
	}
}

