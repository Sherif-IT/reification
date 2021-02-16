/**
 * 
 */
package reification;

import java.lang.reflect.Method;

/**
 * @author sherif
 *
 */
public class Lanceur {

	/**
	 * 
	 */
	public Lanceur() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		System.out.println(args[0]);
		Method[] lesMethodes = null;
		Object obj = null;
		try {
			Class<?> clazz = Class.forName(args[0]);
			lesMethodes = clazz.getDeclaredMethods();
			for (Method m : lesMethodes) {
				System.out.println(m.getName());
			}
			obj = clazz.getConstructor(null).newInstance(null);
			System.out.println(lesMethodes[0].invoke(obj, null));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
