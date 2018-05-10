package org.testdesignpattern.abstractfactory.intelImpl;

import org.testdesignpattern.abstractfactory.AbstractFactory;
import org.testdesignpattern.abstractfactory.Cpu;
import org.testdesignpattern.abstractfactory.Mainboard;

public class IntelFactory implements AbstractFactory{

	public Cpu createCpu() {
		return new IntelCpu(938);
	}

	public Mainboard createMainboard() {
		return new IntelMainboard(938);
	}

}
