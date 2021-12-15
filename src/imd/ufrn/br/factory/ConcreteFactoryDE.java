package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;
import imd.ufrn.br.product.GreaterDE;
import imd.ufrn.br.product.ByerDE;

public class ConcreteFactoryDE extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new GreaterDE();
	}

	@Override
	public Byer createBye() {
		return new ByerDE();
	}

}
