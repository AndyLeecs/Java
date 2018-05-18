import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

/**     
* @author 李安迪
* @date 2018年5月18日
* @description
*/
public class TestStream {
	
	
	public static void main(String args[]){
		//限制流的大小，可排序，可筛选，可单独操作，可并行
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		strings.parallelStream()
		.limit(10)
		.sorted()
		.filter(string -> !string.isEmpty())
		.map(string -> string + "m")
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		//统计
		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		 
		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
		 
		System.out.println("列表中最大的数 : " + stats.getMax());
		System.out.println("列表中最小的数 : " + stats.getMin());
		System.out.println("所有数之和 : " + stats.getSum());
		System.out.println("平均数 : " + stats.getAverage());
	}
}
