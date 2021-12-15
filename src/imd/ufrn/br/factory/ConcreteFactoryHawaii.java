package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;
import imd.ufrn.br.product.ByerHawaii;
import imd.ufrn.br.product.GreaterHawaii;

public class ConcreteFactoryHawaii extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new GreaterHawaii();
	}

	@Override
	public Byer createBye() {
		return new ByerHawaii();
	}

}
