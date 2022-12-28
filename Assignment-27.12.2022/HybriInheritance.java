package abstractiondemo;

interface K{
	void print();
}
interface D {
	void show();
}

class N implements K, D {

	@Override
	public void show() {
		System.out.println("khushboo is a girl");
		
	}

	@Override
	public void print() {
		System.out.println("Dhiraj is boy");
		
	}
	
}
class S extends N {
	public void print() {
		System.out.println("Sunita also girl");
	}
}

public class HybriInheritance {

	public static void main(String[] args) {
		N n = new N();
		n.print();
		n.show();
		
		System.out.println();
		
		S s = new S();
		s.print();

	}

}
