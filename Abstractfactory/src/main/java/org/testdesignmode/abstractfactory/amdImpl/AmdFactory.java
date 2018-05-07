package org.testdesignmode.abstractfactory.amdImpl;

import org.testdesignmode.abstractfactory.AbstractFactory;
import org.testdesignmode.abstractfactory.Cpu;
import org.testdesignmode.abstractfactory.Mainboard;

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
