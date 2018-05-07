package org.testdesignmode.abstractfactory.intelImpl;

import org.testdesignmode.abstractfactory.Cpu;

/**
 * Intel Cpu
 * @author pxy
 *
 */
public class IntelCpu implements Cpu {

	
    /**
     * CPU的针脚数
     */
    private int pins = 0;
    public  IntelCpu(int pins){
        this.pins = pins;
    }
    @Override
	public void calculate() {
		System.out.println("Intel CPU的针脚数" + pins);
	}

}
