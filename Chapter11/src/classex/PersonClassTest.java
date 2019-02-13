package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonClassTest {

	public static void main(String[] args) throws ClassNotFoundException {
		
	//	Class pClass = Class.forName("classex.Person");
		Class pClass = Person.class;
		
		System.out.println(pClass.getName());
		
		System.out.println();
		
		Constructor[] cons = pClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);
		}
		
		System.out.println();
		
		Field[] fields = pClass.getFields();
		for(Field f : fields) {
			System.out.println(f);
			
		} //필드는 public만 보임
		
		System.out.println();
		
		Method[] methods = pClass.getMethods();
		for(Method m : methods) {
			System.out.println(m);
		}
		
		System.out.println();
		
	
		
		
	
	}

}
