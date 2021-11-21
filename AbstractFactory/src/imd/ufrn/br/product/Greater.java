package imd.ufrn.br.product;

public class Greater implements HiInterface{
	private String Oi;
	
	public Greater(String Hi) {
		Oi = Hi;
	}
	@Override
	public void Hi() {
		System.out.println(Oi);

	}
}
