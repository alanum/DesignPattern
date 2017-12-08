
package adapter;



/**
 * 	适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
	这种模式涉及到一个单一的类，该类负责加入独立的或不兼容的接口功能。
	举个真实的例子，读卡器是作为内存卡和笔记本之间的适配器。您将内存卡插入读卡器，再将读卡器插入笔记本，这样就可以通过笔记本来读取内存卡。
 * @author Karl
 *
 */

public class Do {
	
	public static void main(String[] args){
		
		AudioPlayer player = new AudioPlayer();
		
		player.play("mp3", "来自天堂的魔鬼");
		player.play("444", "alone");
		player.play("mp4", "叶子");
		player.play("vlc", "lonely");
		player.play("avi", "Tokyo Hot");
		
	}

}
