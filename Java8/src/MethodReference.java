import java.util.ArrayList;
import java.util.List;

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class MethodReference {
	class Cat{
		public void meo(String s){
			System.out.println(s);
		}
	}
	
	public void test(){
		List<String> l = new ArrayList<String>();
		Cat andy = new Cat();
		l.forEach(andy::meo);
	}
}
