

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class InnerClass {
	//静态内部类，static可以修饰,没有指向外部类的引用
	private static class SingletonHolder{
		private static InnerClass single = new InnerClass();
	}
	
	private InnerClass(){
		System.out.println("create singleton");
	};
	
	public static InnerClass getInstance(){
		//因为内部类在使用的时候才会被加载，实际上同样达到了延迟加载的作用
		return SingletonHolder.single;
	}
}
