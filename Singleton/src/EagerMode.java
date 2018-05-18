

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class EagerMode {
	private static final EagerMode single = new EagerMode();
	private EagerMode(){
	};
	public static EagerMode getInstance(){
		return single;
	};
}
