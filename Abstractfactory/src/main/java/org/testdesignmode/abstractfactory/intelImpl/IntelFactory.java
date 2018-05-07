package org.testdesignmode.abstractfactory.intelImpl;

import org.testdesignmode.abstractfactory.AbstractFactory;
import org.testdesignmode.abstractfactory.Cpu;
import org.testdesignmode.abstractfactory.Mainboard;

public class IntelFactory implements AbstractFactory{

	public Cpu createCpu() {
		return new IntelCpu(938);
	}

	public Mainboard createMainboard() {
		return new IntelMainboard(938);
	}

}
