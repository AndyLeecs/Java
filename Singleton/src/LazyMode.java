

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class LazyMode {
	private static LazyMode single;
	private LazyMode(){
	}
	
	public static synchronized LazyMode getInstance(){
		if(single == null){
			single = new LazyMode();
		}
		
		return single;
	}
}
