package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public class ConcreteFactoryEN extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new Greater("Hi!");
	}

	@Override
	public Byer createBye() {
		return new Byer("Bye!");
	}

}
