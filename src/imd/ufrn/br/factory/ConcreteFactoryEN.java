package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;
import imd.ufrn.br.product.ByerEN;
import imd.ufrn.br.product.GreaterEN;

public class ConcreteFactoryEN extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new GreaterEN();
	}

	@Override
	public Byer createBye() {
		return new ByerEN();
	}

}
