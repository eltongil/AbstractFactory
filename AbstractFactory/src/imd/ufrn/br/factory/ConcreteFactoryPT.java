package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public class ConcreteFactoryPT extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new Greater("Oi!");		
	}

	@Override
	public Byer createBye() {
		return new Byer("Tchau!");		
	}
	
}
