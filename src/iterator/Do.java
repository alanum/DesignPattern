package iterator;

public class Do {

	/**
	 * 意图：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。
	 * 
	 * 主要解决：不同的方式来遍历整个整合对象。
	 * 
	 * 何时使用：遍历一个聚合对象。
	 * 
	 * 如何解决：把在元素之间游走的责任交给迭代器，而不是聚合对象。
	 * 
	 * 关键代码：定义接口：hasNext, next。
	 * 
	 * 应用实例：JAVA 中的 iterator。
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		NameRepository nameRepository = new NameRepository();
		for(Iterator it = nameRepository.getIterator();it.hasNext();){
			
			System.out.println(String.valueOf(it.next()));
		}
	}
}
