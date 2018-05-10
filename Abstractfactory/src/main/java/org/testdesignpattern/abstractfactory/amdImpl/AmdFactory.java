package org.testdesignpattern.abstractfactory.amdImpl;

import org.testdesignpattern.abstractfactory.AbstractFactory;
import org.testdesignpattern.abstractfactory.Cpu;
import org.testdesignpattern.abstractfactory.Mainboard;

public class AmdFactory implements AbstractFactory {

	@Override
	public Cpu createCpu() {
		return new AmdCpu(755);
	}

	@Override
	public Mainboard createMainboard() {
		return new AmdMainboard(755);
	}

}
