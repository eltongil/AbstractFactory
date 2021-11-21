package imd.ufrn.br.product;

public class Byer implements ByeInterface {
	private String xau;
	
	public Byer(String bye) {
		xau = bye;
	}
	@Override
	public void Bye() {
		System.out.println(xau);
	}

}
