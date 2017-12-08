package proxy;

public class ProxyImage implements Image{

	private RealImage realImage;
	private String fileName;
	
	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		
		if(realImage ==null){
			realImage = new RealImage(fileName);   // 想在访问一个类时做一些控制。 此处，就是增加了从硬盘读取图片功能
		}
		realImage.display();
	}

}
