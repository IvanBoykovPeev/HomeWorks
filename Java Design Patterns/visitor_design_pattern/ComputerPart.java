package visitor_design_pattern;

public interface ComputerPart {
	public void accept(ComputerPartVisitor computerPartVisitor);
}
