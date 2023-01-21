package br.com.domain.facade;

import br.com.domain.factory.Accessory;
import br.com.domain.pc.factory.CPU;
import br.com.domain.pc.factory.HD;
import br.com.domain.pc.factory.Memory;
import br.com.domain.pc.factory.OS;

public class ComputerFacade {
	
	private Memory memory;
	private HD hd;
	private CPU cpu;
	private Accessory accessory;
	private OS so;

	public ComputerFacade() {
		this.memory = new Memory();
		this.hd = new HD();
		this.cpu = new CPU();
		this.accessory = new Accessory();
		this.so = new OS();
	}
	
	public void assemblePC() {
		System.out.println("Montando uma nova máquina\n");
		memory.addMemory();
		hd.addHD();
		cpu.addProcessor();
		accessory.addMouse();
		accessory.addKeyboard();
		accessory.addMonitor();
		so.installOS();
		System.out.println("\nComputador fabricado");
	}

}
