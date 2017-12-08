package visitor;

public interface ComputerPartVisitor {
	
	public void visit(Computer computerPart);
	public void visit(Mouse computerPart);
	public void visit(Keyboard computerPart);
	public void visit(Monitor computerPart);

}
