package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public class ConcreteFactoryDE extends AbstractFactory {

	@Override
	public Greater createHi() {		
		return new Greater("Hallo!");
	}

	@Override
	public Byer createBye() {
		return new Byer("Tshüss");
	}

}
