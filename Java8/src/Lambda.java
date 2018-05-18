import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class Lambda {
	private void innerClass(List<String> names){
		Collections.sort(names,
				new Comparator<String>(){
					@Override
					public int compare(String o1, String o2) {
						// TODO Auto-generated method stub
						return o1.compareTo(o2);
					}			
				}
		);
	}
	
	private void lambda(List<String>names){
		Collections.sort(names, 
				(o1,o2) -> (o1.compareTo(o2))
		);
	}
}
