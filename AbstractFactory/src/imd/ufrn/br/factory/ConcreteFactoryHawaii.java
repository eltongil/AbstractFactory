package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public class ConcreteFactoryHawaii extends AbstractFactory {

	@Override
	public Greater createHi() {
		return new Greater("Aloha!");
	}

	@Override
	public Byer createBye() {
		return new Byer("Aloha!");
	}

}
