package imd.ufrn.br.application;

import java.util.ArrayList;
import java.util.List;

import imd.ufrn.br.factory.*;
import imd.ufrn.br.product.Byer;
import imd.ufrn.br.product.Greater;

public class Test {
	private static List<AbstractFactory> factories;
	private static List<Greater> greaters;
	private static List<Byer> byers;
	public static void main(String[] args) {
		factories = new ArrayList<AbstractFactory>();
		factories.add(new ConcreteFactoryPT());
		factories.add(new ConcreteFactoryEN());
		factories.add(new ConcreteFactoryDE());
		factories.add(new ConcreteFactoryHawaii());
		
		greaters = new ArrayList<Greater>();
		byers = new ArrayList<Byer>();
		
		for (AbstractFactory maker : factories) {
			greaters.add(maker.createHi());
			byers.add(maker.createBye());
		}
		System.out.println("Say Hi!\n");
		for(Greater arrive : greaters) {
			arrive.Hi();
		}
		System.out.println("\nSay bye!\n");
		
		for(Byer leave : byers) {
			leave.Bye();
		}
	}

}
