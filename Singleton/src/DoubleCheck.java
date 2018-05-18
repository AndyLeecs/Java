

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class DoubleCheck {
	private static DoubleCheck single = null;
	
	private DoubleCheck(){};
	
	public static DoubleCheck getInstance(){
		
		if(single == null){
			synchronized(DoubleCheck.class){
				if(single == null)
					single = new DoubleCheck(){};
			}
		}
		
		return single;
	}
}
