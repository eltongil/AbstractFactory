package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;
import imd.ufrn.br.product.ByerPT;
import imd.ufrn.br.product.GreaterPT;

public class ConcreteFactoryPT extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new GreaterPT();
	}

	@Override
	public Byer createBye() {
		return new ByerPT();
	}

}
