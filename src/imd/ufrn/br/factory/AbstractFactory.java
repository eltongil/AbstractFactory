package imd.ufrn.br.factory;

import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public abstract class AbstractFactory {
	abstract public Greater createHi();
	abstract public Byer createBye();
	
}
