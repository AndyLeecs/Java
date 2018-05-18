

/**     
* @author 李安迪
* @date 2018年5月18日
* @description 修改已经发布的接口而不影响其他继承此接口的类
*/
public class DefaultMethod {
	public interface vehicle {
		   default void print(){
		      System.out.println("我是一辆车!");
		   }
		    // 静态方法
		   static void blowHorn(){
		      System.out.println("按喇叭!!!");
		   }
		}
		 
		public interface fourWheeler {
		   default void print(){
		      System.out.println("我是一辆四轮车!");
		   }
		}
		
		public class car implements vehicle, fourWheeler {
			@Override
			public void print(){
			      System.out.println("我是一辆四轮汽车!");
			   }
			}
	

			public class carWithSuper implements vehicle, fourWheeler {
			   public void print(){
			      vehicle.super.print();
			   }
			}
}
